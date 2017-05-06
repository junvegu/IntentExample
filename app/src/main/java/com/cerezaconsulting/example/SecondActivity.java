package com.cerezaconsulting.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by junior on 06/05/17.
 */

public class SecondActivity extends AppCompatActivity {


    public static final String DATA="data";

    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        imageView = (ImageView) findViewById(R.id.image_view);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent();
                intent.putExtra(DATA,"HOLA");
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });
    }
}
