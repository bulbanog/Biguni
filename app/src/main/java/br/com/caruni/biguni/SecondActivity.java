package br.com.caruni.biguni;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by JOHN on 2/04/2017.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreat(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("SecondActivity","onCreat");
    }
    @Override
    protected void onStart(){
        super.onCreate();
        Log.i("SecondActivity","onStart");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("SecondActivity", "onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("SecondActivity", "onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("SecondActivity", "onRestart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("SecondActivity", "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("SecondActivity", "onPause");
    }
}