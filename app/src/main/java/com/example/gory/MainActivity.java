package com.example.gory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView pytania;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pytania = findViewById(R.id.pytanie);
    }

    public void sprawdz(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        int wybrany = radioGroup.getCheckedRadioButtonId();

        if (wybrany == R.id.radioButton3){
            Toast.makeText(this, R.string.gratulacje, Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, R.string.zla_odp, Toast.LENGTH_SHORT).show();
        }
    }

    public void help(View view) {
        String tresc = pytania.getText().toString();
        Intent intent = new Intent(this, HelpActivity.class);
        intent.putExtra("wiadomosc", tresc);
        startActivity(intent);
    }
}