package com.example.lecture14_dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.btnDialog);
    }

    public void ShowDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Alert Dialog!");
        builder.setMessage("It is an Alert Dialog Box");

        builder.setCancelable(false);

        LayoutInflater inflater= this.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.my_layout_dialog, null));
        builder.setPositiveButton("Positive",
                new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Positive Button  clicked",Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton("Negative",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Negative Button  clicked",Toast.LENGTH_LONG).show();
                    }
                });
        AlertDialog alertDialog= builder.create();
        alertDialog.show();
    }

}