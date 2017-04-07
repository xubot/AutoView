package com.example.administrator.autoview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private VeiwSet vs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vs = (VeiwSet) findViewById(R.id.sytlsView);
        TextView tv= (TextView) findViewById(R.id.vt);
        vs.setLeftBackOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "已点击", Toast.LENGTH_SHORT).show();
            }
        });
        vs.seRightBackOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vs.setRight(false);
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TweActivity.class));
            }
        });
    }
}
