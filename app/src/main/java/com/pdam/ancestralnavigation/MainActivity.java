package com.pdam.ancestralnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchDonutActivity(View view) {
        Intent intent = new Intent(MainActivity.this,
                DonutActivity.class);
        startActivity(intent);
    }

    public void launchFroyoActivity(View view) {
        Intent intent = new Intent(MainActivity.this,
                FroyoActivity.class);
        startActivity(intent);
    }

    public void launchIceCreamSandActivity(View view) {
        Intent intent = new Intent(MainActivity.this,
                IceCreamSandActivity.class);
        startActivity(intent);
    }
}