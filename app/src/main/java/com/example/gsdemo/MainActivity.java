package com.example.gsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.search_flights)
    Button searchFlights;
    @BindView(R.id.reserve_seat)
    Button reserveSeat;
    @BindView(R.id.amenities)
    Button amenities;
    @BindView(R.id.about_our_airlines)
    Button aboutOurAirlines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.search_flights, R.id.reserve_seat, R.id.amenities, R.id.about_our_airlines})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.search_flights:
                startActivity(new Intent(this, SearchingForFlights.class));
                break;
            case R.id.reserve_seat:
                startActivity(new Intent(this, SeatReservation.class));
                break;
            case R.id.amenities:
                startActivity(new Intent(this, ListingofAmenities.class));
                break;
            case R.id.about_our_airlines:
                startActivity(new Intent(this, AboutAmonic.class));
                break;
        }
    }
}
