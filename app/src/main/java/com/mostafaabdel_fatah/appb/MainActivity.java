package com.mostafaabdel_fatah.appb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActivity_inApp_btnClicked(View view) {
        Intent intent = new Intent("com.mostafaabdel_fatah.appa.ActivityTwo");
        /*
        * this forcing app choose every time Clicked Button if Choose always
        * Intent chooser = Intent.createChooser(intent,"Please Choose Activity");
        * */
        Intent chooser = Intent.createChooser(intent,"Please Choose Activity");
        startActivity(chooser);
        //startActivity(intent);
    }
}
