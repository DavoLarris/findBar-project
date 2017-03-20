package org.davolarris.findbar;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;

public class MainActivity extends AppCompatActivity{
    private Button showMap;
    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=42.804972, -1.681907&radius=200&types=bar&sensor=false&key=


        showMap = (Button) findViewById(R.id.showMap);
        showMap.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().add(R.id.mapLayout, new MapFragmentClass()).commit();
            }
        });
    }


}
