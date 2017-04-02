package br.com.caruni.biguni;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity","onStart");
    }
    @Override
    protected void onStart(){
        super.onCreate();
        Log.i("MainActivity","onStart");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity", "onRestart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();