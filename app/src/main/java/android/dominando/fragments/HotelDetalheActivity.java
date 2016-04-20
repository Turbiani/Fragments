package android.dominando.fragments;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HotelDetalheActivity extends AppCompatActivity {
    public static final String EXTRA_HOTEL = "hotel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detalhe);

        if(savedInstanceState == null){
            Intent intent = getIntent();
            Hotel hotel = (Hotel) intent.getSerializableExtra(EXTRA_HOTEL);

            HotelDetalheFragment fragment = HotelDetalheFragment.novaInstancia(hotel);

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.detalhe, fragment, HotelDetalheFragment.TAG_DETALHE);
            ft.commit();
        }
    }
}
