package com.example.inclass02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editPrice = findViewById(R.id.editTicketPrice);


        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputPrice = editPrice.getText().toString();
                if (inputPrice.trim().equals("") || inputPrice.contains("-")) {
                    Toast.makeText(getApplicationContext(), "Please Enter a Valid Number!", Toast.LENGTH_LONG).show();
                }
                else {
                    double ticketPrice = Double.parseDouble(editPrice.getText().toString());
                    TextView textView = (TextView) findViewById(R.id.discountPercentage);
                    textView.setText("5%");

                    double finalPrice = ticketPrice * 0.95;
                    TextView discount = findViewById(R.id.discountPrice);
                    discount.setText(Double.toString(finalPrice));
                }
            }
        });

        findViewById(R.id.button10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputPrice = editPrice.getText().toString();
                if (inputPrice.trim().equals("") || inputPrice.contains("-")) {
                    Toast.makeText(getApplicationContext(), "Please Enter a Valid Number!", Toast.LENGTH_LONG).show();
                }
                else {
                    double ticketPrice = Double.parseDouble(editPrice.getText().toString());
                    TextView textView = (TextView) findViewById(R.id.discountPercentage);
                    textView.setText("10%");

                    double finalPrice = ticketPrice * 0.90;
                    TextView discount = findViewById(R.id.discountPrice);
                    discount.setText(Double.toString(finalPrice));
                }
            }
        });

        findViewById(R.id.button15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputPrice = editPrice.getText().toString();
                if (inputPrice.trim().equals("") || inputPrice.contains("-")) {
                    Toast.makeText(getApplicationContext(), "Please Enter a Valid Number!", Toast.LENGTH_LONG).show();
                }
                else {
                    double ticketPrice = Double.parseDouble(editPrice.getText().toString());
                    TextView textView = (TextView) findViewById(R.id.discountPercentage);
                    textView.setText("15%");

                    double finalPrice = ticketPrice * 0.85;
                    TextView discount = findViewById(R.id.discountPrice);
                    discount.setText(Double.toString(finalPrice));
                }
            }
        });

        findViewById(R.id.button20).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputPrice = editPrice.getText().toString();
                if (inputPrice.trim().equals("") || inputPrice.contains("-")) {
                    Toast.makeText(getApplicationContext(), "Please Enter a Valid Number!", Toast.LENGTH_LONG).show();
                }
                else {

                    double ticketPrice = Double.parseDouble(editPrice.getText().toString());
                    TextView textView = (TextView) findViewById(R.id.discountPercentage);
                    textView.setText("20%");

                    double finalPrice = ticketPrice * 0.80;
                    TextView discount = findViewById(R.id.discountPrice);
                    discount.setText(Double.toString(finalPrice));
                }
            }
        });

        findViewById(R.id.button50).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputPrice = editPrice.getText().toString();

                if (inputPrice.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Enter a Valid Number!", Toast.LENGTH_LONG).show();
                }
                else {
                    double ticketPrice = Double.parseDouble(editPrice.getText().toString());
                    TextView textView = (TextView) findViewById(R.id.discountPercentage);
                    textView.setText("50%");

                    double finalPrice = ticketPrice * 0.50;
                    TextView discount = findViewById(R.id.discountPrice);
                    discount.setText(Double.toString(finalPrice));
                }
            }
        });

        findViewById(R.id.buttonClear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView textView = (TextView)findViewById(R.id.discountPercentage);
                textView.setText("");
                editPrice.setText("");

                TextView discount = findViewById(R.id.discountPrice);
                discount.setText("");
            }
        });

    }
}