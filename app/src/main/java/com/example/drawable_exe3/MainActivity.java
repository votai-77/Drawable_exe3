package com.example.drawable_exe3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean running = true;
    ImageView cat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }
    private void setControl() {
        cat = findViewById(R.id.imgCat);
    }

    private void setEvent() {
        final AnimationDrawable runningCat = (AnimationDrawable) cat.getDrawable();
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(running) {
                    runningCat.start();
                }else {
                    runningCat.stop();
                }
                running = !running;
            }
        });
    }
}
