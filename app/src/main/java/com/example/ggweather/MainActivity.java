package com.example.ggweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //缓存数据判断，如果之前请求过数据则直接运行WeatherActivity活动
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if(prefs.getString("weather",null) != null){
            Intent intent = new Intent(this,WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
