package org.davolarris.findbar;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button showMap;

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
                FragmentTransaction ft = fm.beginTransaction();
                MapFragmentClass mapFragmentClass = new MapFragmentClass();
                ft.add(R.id.mapLayout, mapFragmentClass);
                ft.commit();
            }
        });
    }
}
