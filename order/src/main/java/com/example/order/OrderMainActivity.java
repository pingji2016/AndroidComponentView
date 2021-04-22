package com.example.order;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.example.common.NetManagerUtils;

public class OrderMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_main_activity);

        Toolbar toolbar = findViewById(R.id.toolbar);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)
                findViewById(R.id.coll_toolbar);

        ImageView imgview = (ImageView) findViewById(R.id.img);
        TextView content_text = (TextView) findViewById(R.id.content_text);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();

        if (actionBar == null){

        }else{
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        collapsingToolbarLayout.setTitle("订单界面");
        Glide.with(OrderMainActivity.this)
                .load("http://inthecheesefactory.com/uploads/source/nestedfragment/fragments.png")
                .into(imgview);

        content_text.setText(gennerateString(566));

        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.floatbutton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OrderMainActivity.this, OrderScollActivity.class));
            }
        });
    }

    private String gennerateString(int num){
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<500;i++){
            ans.append("dgskjhds ds flg sda ");
        }
        return ans.toString();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}
