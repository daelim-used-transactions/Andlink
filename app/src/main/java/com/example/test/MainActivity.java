package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Network network = new Network();

        Map<String, String> params = new HashMap<String, String>();
        params.put("title", "한글나오냐.");
        params.put("memo", "memo");

        network.execute(params);
    }
}