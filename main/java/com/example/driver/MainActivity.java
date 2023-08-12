package com.example.driver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button confirmPaymentButton;
    private TextView fareTextView;
    private double totalFare;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        confirmPaymentButton = findViewById(R.id.confirm_payment_button);
        fareTextView = findViewById(R.id.fare_text_view);

        confirmPaymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call a function to confirm payment and update the UI accordingly
                confirmPayment();
            }
        });
    }

    private void confirmPayment() {
        // Update the UI to indicate that payment is confirmed
        fareTextView.setText("Payment Confirmed");
    }
}
