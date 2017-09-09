package com.amorr.wowapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WoWApp extends AppCompatActivity implements View.OnClickListener
{
    //StartScreen startscreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //startscreen = new StartScreen(this);

        setContentView(R.layout.activity_wo_wapp);

        //need to make sure that the button you want to use is in the xml file you are looking on
        Button startbutton = (Button)findViewById(R.id.button1);
        startbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.button1):
                setContentView(R.layout.user_login);
                Button userbutton = (Button)findViewById(R.id.button2);
                userbutton.setOnClickListener(this);
                break;

           case (R.id.button2):
               setContentView(R.layout.activity_wo_wapp);
               Button startbutton = (Button)findViewById(R.id.button1);
               startbutton.setOnClickListener(this);
               break;

        }
    }

}
