package com.example.gsdemo;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

/**
 * Create by 张瀛煜 on 2020-03-02 ：）
 */
public class AppClient extends Application {
    private static RequestQueue requestQueue;
    @Override
    public void onCreate() {
        super.onCreate();
        requestQueue = Volley.newRequestQueue(this);
    }

    public static void add(JsonObjectRequest jsonObjectRequest){
        requestQueue.add(jsonObjectRequest);
    }

}
