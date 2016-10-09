package com.mhacks8.varun.metrodetroit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewTicketButtonClicked(View v) {
        Intent i = new Intent(this, ViewTicketActivity.class);
        startActivity(i);
    }

    public void purchaseTicketsButtonClicked(View v) {
        //Toast.makeText(MainActivity.this, "Clicked!", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, PurchaseTicketsActivity.class);
        startActivity(i);
    }

    public void viewMapButtonClicked(View v) {
        //Toast.makeText(MainActivity.this, "Clicked!", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, GoogleMapsActivity.class);
        startActivity(i);
    }

}
