package com.example.a2107_droid;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.editTextNumber);
        text.setText("");
        String txt = "";

    }
    public void one(View view) {
        TextView text = findViewById(R.id.editTextNumber);
        String one = "1";
        text.setText(text.getText() + "1");
    }
    public void two(View view) {
        TextView text = findViewById(R.id.editTextNumber);

        text.setText(text.getText() + "2");
    }
    public void tree(View view) {
        TextView text = findViewById(R.id.editTextNumber);

        text.setText(text.getText() + "3");
    }
    public void four(View view) {
        TextView text = findViewById(R.id.editTextNumber);

        text.setText(text.getText() + "4");
    }
    public void five(View view) {
        TextView text = findViewById(R.id.editTextNumber);

        text.setText(text.getText() + "5");
    }
    public void six(View view) {
        TextView text = findViewById(R.id.editTextNumber);

        text.setText(text.getText() + "6");
    }
    public void seven(View view) {
        TextView text = findViewById(R.id.editTextNumber);

        text.setText(text.getText() + "7");
    }
    public void eight(View view) {
        TextView text = findViewById(R.id.editTextNumber);

        text.setText(text.getText() + "8");
    }
    public void nine(View view) {
        TextView text = findViewById(R.id.editTextNumber);

        text.setText(text.getText() + "9");
    }
    public void zero(View view) {
        TextView text = findViewById(R.id.editTextNumber);

        text.setText(text.getText() + "0");
    }
    public void none(View view) {
        TextView text = findViewById(R.id.editTextNumber);

        text.setText("");
    }

}