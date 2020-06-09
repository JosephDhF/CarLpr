package com.jiataoyuan.carlpr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MainClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.btn_capture: {
                intent.setClass(this, CaptureTest.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_video: {

                break;
            }

            default:
                break;
        }
    }
}
