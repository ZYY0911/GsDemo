package com.example.gsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ListingofAmenities extends AppCompatActivity {

    @BindView(R.id.my_list)
    ListView myList;
    @BindView(R.id.back)
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listingof_amenities);
        ButterKnife.bind(this);
        
    }

    @OnClick(R.id.back)
    public void onViewClicked() {
        finish();
    }
}
