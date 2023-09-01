package com.abayhq.pemula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import  android.app.AlertDialog;
import  android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, MainActivity2.class);
        AlertDialog.Builder alrt = new AlertDialog.Builder(this);
        Button btn = findViewById(R.id.button1);
        String fgNama = "abayhq";
        String fgrPass = "abay";
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText t1 = findViewById(R.id.txtNama);
                EditText t2 = findViewById(R.id.txtPass);
                TextView txt = findViewById(R.id.txtHasil);
                if (t1.toString() == fgNama && t2.toString() == fgrPass){
                    txt.setText("login");//startActivity(intent);

                } else if (t1.toString() == fgNama && t2.toString() != fgrPass) {
                    txt.setText("salah password");//alrt.setMessage("Password yang anda masukkan salah");

                }else if (t1.toString() != fgNama && t2.toString() == fgrPass) {
                    txt.setText("salah nama");//alrt.setMessage("Nama yang anda masukkan salah");
                }else{
                    txt.setText("salah semua");//alrt.setMessage("Nama dan Password salah");
                }

            }
        });
    }
}