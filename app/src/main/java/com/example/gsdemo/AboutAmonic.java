package com.example.gsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AboutAmonic extends AppCompatActivity {

    @BindView(R.id.mt_text)
    TextView mtText;
    @BindView(R.id.back)
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_amonic);
        ButterKnife.bind(this);
        mtText.setText("As a new airline operating routes in the region, it\n" +
                "is very important to provide information about the\n" +
                "airline and how it operates. \n" +
                "TP09_S5 5 of 7\n" +
                "作为本地区一条新的航空公司运行路线，提供更多\n" +
                "有关航空公司及其运营方式的信息是至关重要的。\n" +
                "One of the documents at your possession\n" +
                "provides all the information the airline needs to\n" +
                "your to present to the client.\n" +
                "你手里所拥有的文档之一提供了航空公司需要你向\n" +
                "客户展示的全部信息。\n" +
                "Feel free to use other graphics and other visual\n" +
                "elements to make this presentation of information\n" +
                "more appealing.\n" +
                "你可随意使用其他图画和视觉元素来使信息的展示\n" +
                "更加吸引人。\n"+
                "The file “Amenities.xlsx” has the list of all the\n" +
                "amenities the airline provides. It is important to\n" +
                "have it displayed in a way that is clear and easy to\n" +
                "read.\n" +
                "“Amenities.xlsx”文件中是航空公司提供的所有\n" +
                "便利服务列表。需要重点注意的是，便利服务项目\n" +
                "的显示应该清晰易读。\n" +
                "Feel free to use icons and other graphical assets\n" +
                "to improve the aesthetics.\n" +
                "你可随意使用图标和其他图形来提高美感");
    }

    @OnClick(R.id.back)
    public void onViewClicked() {
        finish();
    }
}
