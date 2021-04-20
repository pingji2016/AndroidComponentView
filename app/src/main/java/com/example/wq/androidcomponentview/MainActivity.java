package com.example.wq.androidcomponentview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.order.OrderMainActivity;
import com.example.personal.PersonalMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toOrderModule(View view) {
        startActivity(new Intent(this, OrderMainActivity.class));
    }

    public void toPersonalModule(View view) {
        startActivity(new Intent(this, PersonalMainActivity.class));
    }

    public void toGlideTestAct(View view) {
        Intent intent = new Intent(this,GlideTest.class);
        startActivity(intent);
    }

}
