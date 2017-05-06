package com.cerezaconsulting.example;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static final int RESULT_SECON_ACTIVITY = 666;

//Componentes de Android
    //1. Activities
    //2. Services
    //3. Broadcaster Receiver
    //4. Content Providers


    //Intent  -- > comunica los 4 componentes

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.btn_next);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, RESULT_SECON_ACTIVITY);
            }
        });

        // Toast.makeText(this, "On create", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(this, "On start", Toast.LENGTH_SHORT).show();
    }


    //Método más utilizado
    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this, "On resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(this, "On pause", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(this, "On stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Toast.makeText(this, "On destroy", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (resultCode == Activity.RESULT_OK) {

            switch (requestCode) {

                case RESULT_SECON_ACTIVITY:

                    String response = data.getStringExtra(SecondActivity.DATA);

                    Toast.makeText(this, response, Toast.LENGTH_SHORT).show();
                    break;

                default:
                    break;

            }
        }
    }
}
