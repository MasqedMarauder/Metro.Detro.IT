package com.mhacks8.varun.metrodetroit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EnterPaymentInfoActivity extends AppCompatActivity {

    private TextView paymentReviewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_payment_info);

        Bundle ticketInfo = getIntent().getExtras();
        String passType = ticketInfo.getString("passType");
        String startDate = ticketInfo.getString("startDate");
        paymentReviewTextView = (TextView)findViewById(R.id.paymentReviewTextView);
        paymentReviewTextView.setText("Pass Type: " + passType + "\n" + "Start Date: " + startDate);
    }

    public void purchaseTicketButtonClicked(View v) {
        Toast.makeText(EnterPaymentInfoActivity.this, "Purchase Complete!", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this, ViewTicketActivity.class);
        startActivity(i);
    }

}
