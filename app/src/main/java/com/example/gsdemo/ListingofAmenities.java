package com.example.gsdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.example.gsdemo.bean.AirportInfo;
import com.example.gsdemo.net.VolleyLo;
import com.example.gsdemo.net.VolleyTo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ListingofAmenities extends AppCompatActivity {

    @BindView(R.id.my_list)
    ListView myList;
    @BindView(R.id.back)
    Button back;
    private List<AirportInfo> airportInfos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listingof_amenities);
        ButterKnife.bind(this);
        setVolley();
    }

    private void setVolley() {
        VolleyTo volleyTo = new VolleyTo();
        volleyTo.setUrl("get_airport_info")
                .setJsonObject("UserName", "user1")
                .setVolleyLo(new VolleyLo() {
                    @Override
                    public void onResponse(JSONObject jsonObject) {
                        airportInfos = new Gson().fromJson(jsonObject.optJSONArray("ROWS_DETAIL").toString()
                                , new TypeToken<List<AirportInfo>>() {
                                }.getType());
                        setListAdapter();
                    }

                    @Override
                    public void onErrorResponse(VolleyError volleyError) {

                    }
                }).start();
    }

    private void setListAdapter() {
        myList.setAdapter(new MyAdapter(this,R.layout.listingo_item,airportInfos));

    }

    @OnClick(R.id.back)
    public void onViewClicked() {
        finish();
    }

    static class MyAdapter extends ArrayAdapter<AirportInfo> {
        private int layout;

        public MyAdapter(@NonNull Context context, int resource, @NonNull List<AirportInfo> objects) {
            super(context, resource, objects);
            layout = resource;
        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            AirportInfo airportInfo = getItem(position);
            View view = LayoutInflater.from(getContext()).inflate(layout, parent, false);
            ViewHolder holder = new ViewHolder(view);
            holder.itemPrice.setText("$" + airportInfo.getPrice());
            holder.itemService.setText("Serivce:" + airportInfo.getServiceName());
            return view;

        }

        static
        class ViewHolder {
            @BindView(R.id.item_service)
            TextView itemService;
            @BindView(R.id.item_price)
            TextView itemPrice;

            ViewHolder(View view) {
                ButterKnife.bind(this, view);
            }
        }
    }
}
