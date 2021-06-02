package com.mirea.vbeygul.praktika2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    public Object TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"onStart()");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy()");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.e(TAG,"onStop()");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause()");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"onResume()");
    }

}