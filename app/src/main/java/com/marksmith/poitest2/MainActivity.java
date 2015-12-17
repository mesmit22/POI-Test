package com.marksmith.poitest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        XWPFDocument doc = new XWPFDocument();
    }
}
