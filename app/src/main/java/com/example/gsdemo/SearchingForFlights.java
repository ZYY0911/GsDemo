package com.example.gsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import com.bigkoo.pickerview.builder.TimePickerBuilder;
import com.bigkoo.pickerview.listener.OnTimeSelectListener;
import com.bigkoo.pickerview.view.TimePickerView;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SearchingForFlights extends AppCompatActivity {

    @BindView(R.id.spinner_frmo)
    Spinner spinnerFrmo;
    @BindView(R.id.spinner_to)
    Spinner spinnerTo;
    @BindView(R.id.tv_time)
    TextView tvTime;
    @BindView(R.id.my_list)
    ListView myList;
    @BindView(R.id.back)
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching_for_flights);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_time, R.id.back})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_time:
                TimePickerView timePickerView = new TimePickerBuilder(this, new OnTimeSelectListener() {
                    @Override
                    public void onTimeSelect(Date date, View v) {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                        tvTime.setText(format.format(date));
                    }
                }).isDialog(true).build();
                timePickerView.show();
                break;
            case R.id.back:
                finish();
                break;
        }
    }
}
