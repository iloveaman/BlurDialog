package com.github.lany192.blurdialog.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SampleDialogFragment dialogFragment = SampleDialogFragment.newInstance(4, 4, true);
                dialogFragment.show(getSupportFragmentManager(), "TAG");
            }
        });
    }
}
