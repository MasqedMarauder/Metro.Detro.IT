package com.mhacks8.varun.metrodetroit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewTicketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_ticket);
    }

    public void ticketToMainScreenButtonClicked(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
