package com.example.basilarackal.inr2usd;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ToastEm(View view){
        Toast.makeText(getApplicationContext(), "#Change Text Here", Toast.LENGTH_SHORT).show();
    }
}
