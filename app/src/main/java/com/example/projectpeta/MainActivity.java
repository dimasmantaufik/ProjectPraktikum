package com.example.projectpeta;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.SearchView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mapAPI;
    SupportMapFragment mapFragment;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapAPI);

        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mapAPI = googleMap;

        LatLng bjbr = new LatLng(-7.733791, 113.222244);
        mapAPI.addMarker(new MarkerOptions().position(bjbr).title("BEE JAY BAKAU RESORT PROBOLINGGO")
                .snippet("Pelabuhan PPP Mayangan, Wisata Primadona, Mangunharjo, Mayangan, Mangunharjo, Kec. Mayangan, Kota Probolinggo, Jawa Timur 67217"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(bjbr));

        LatLng bentar = new LatLng(-7.779307, 113.276679);
        mapAPI.addMarker(new MarkerOptions().position(bentar).title("Wisata Pantai Bentar Probolinggo")
                .snippet("Jalur Pantura Mayangan, Karang Anyar, Curahsawo, Kec. Gending, Probolinggo, Jawa Timur 67211"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(bentar));

        LatLng gili = new LatLng(-7.679147, 113.245678);
        mapAPI.addMarker(new MarkerOptions().position(gili).title("Wisata Pantai Gili Ketapang ")
                .snippet("Sapia, Gili Ketapang, Kec. Sumberasih, Probolinggo, Jawa Timur"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(gili));

        LatLng mada = new LatLng(-7.853030, 113.007900);
        mapAPI.addMarker(new MarkerOptions().position(mada).title("Air Terjun Madakaripura")
                .snippet("Sapih, Branggah, Lumbang, Probolinggo, Jawa Timur 67183"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(mada));

        LatLng myhouse = new LatLng(-7.734760, 113.120930);
        mapAPI.addMarker(new MarkerOptions().position(myhouse).title("Rumahku Tersayang")
                .snippet("Sumberan, Dungun, Kec. Tongas, Probolinggo, Jawa Timur 67252"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(myhouse));

    }
}

