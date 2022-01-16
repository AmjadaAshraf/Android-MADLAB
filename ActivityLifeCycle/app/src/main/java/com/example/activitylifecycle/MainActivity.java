package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected void onStart(){
        super.onStart();
        Log.d("Activity Life Cycle","onStart invoked");
        Toast.makeText(MainActivity.this,"onStart is invoked",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity Life Cycle","in method onCreate");
        Toast.makeText(MainActivity.this,"onCreate is invoked",Toast.LENGTH_LONG).show();
    }
    protected void onStop(){
        super.onStop();
        Log.d("Activity Life Cycle","in method onStop");
        Toast.makeText(MainActivity.this,"onStop is invoked",Toast.LENGTH_LONG).show();
    }
    protected void onResume(){
        super.onResume();
        Log.d("Activity Life Cycle","in method onResume");
        Toast.makeText(MainActivity.this,"onresume is invoked",Toast.LENGTH_LONG).show();
    }
    protected void onPause(){
        super.onPause();
        Log.d("Activity Life Cycle","in method onPause");
        Toast.makeText(MainActivity.this,"onPause is invoked",Toast.LENGTH_LONG).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Activity Life Cycle","in method onDestroy");
        Toast.makeText(MainActivity.this,"onDestroy is invoked",Toast.LENGTH_LONG).show();
    }
}
