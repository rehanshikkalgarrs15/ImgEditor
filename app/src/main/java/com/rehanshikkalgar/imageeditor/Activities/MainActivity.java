package com.rehanshikkalgar.imageeditor.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.rehanshikkalgar.imageeditor.R;

public class MainActivity extends AppCompatActivity {

    private Button selectFromGalleryBT,captureCameraBT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectFromGalleryBT = (Button)findViewById(R.id.selectFromGallery);
        captureCameraBT = (Button)findViewById(R.id.captureImage);
    }
}
