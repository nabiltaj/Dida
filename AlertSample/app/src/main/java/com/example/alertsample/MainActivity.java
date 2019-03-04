package com.example.alertsample;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBulider = new
                AlertDialog.Builder(MainActivity.this);
        myAlertBulider.setTitle("Alert");
        myAlertBulider.setMessage("Click OK to Continue, or Cancel to stop:");
        myAlertBulider.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Pressed OK",Toast.LENGTH_SHORT).show();
            }
        });
        myAlertBulider.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Pressed Cancel", Toast.LENGTH_SHORT).show();
            }
        });
myAlertBulider.show();
    }
}
