package com.example.life_cycle;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"i m in on create method",Toast.LENGTH_LONG).show();
        Log.i(tag "lifecyle", msg "i m in on create method");
        button=findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"i m in on start method",Toast.LENGTH_LONG).show();
        Log.i(tag "lifecyle", msg "i m in on start method");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"i m in on pause method",Toast.LENGTH_LONG).show();
        Log.i(tag "lifecyle", msg "i m in on pause method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"i m in on resume method",Toast.LENGTH_LONG).show();
        Log.i(tag "lifecyle", msg "i m in on resume method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"i m in on destroy method",Toast.LENGTH_LONG).show();
        Log.i(tag"lifecyle", msg"i m in on destroy method");
    }
    @Override
    public void onClick(View view){
        Intent intent=new Intent(getApplicationContext(),lifecycle2.class);
        startActivity(intent);
    }
}
