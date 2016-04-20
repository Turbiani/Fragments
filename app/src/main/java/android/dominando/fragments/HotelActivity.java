package android.dominando.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HotelActivity extends AppCompatActivity implements AoClicarNoHotel{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
    }

    @Override
    public void clicouNoHotel(Hotel hotel) {
        Intent it = new Intent(this, HotelDetalheActivity.class);
        it.putExtra(HotelDetalheActivity.EXTRA_HOTEL, hotel);
        startActivity(it);
    }
}
