package com.example.wq.androidcomponentview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.common.Message.MessageBase;

import org.greenrobot.eventbus.EventBus;

public class GlideTest extends Activity {
    private Button button;
    private Button button2;
    private Button button3;
    private ImageView imageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glidetest);
        button = findViewById(R.id.bt_glide_base);
        button2 = findViewById(R.id.bt_glide_recycleview);
        button3 = findViewById(R.id.bt_glide_transfromation);
        imageView = findViewById(R.id.img_view);
        button.setOnClickListener(new GlideTest.onClickListener());
        button2.setOnClickListener(new GlideTest.onClickListener());
        button3.setOnClickListener(new GlideTest.onClickListener());
    }

    class onClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(view.equals(button)){
                Toast.makeText(GlideTest.this,"dasda",Toast.LENGTH_SHORT).show();
                Glide.with(GlideTest.this)
                        .load("http://inthecheesefactory.com/uploads/source/nestedfragment/fragments.png")
                        .into(imageView);
            }else if(view.equals(button2)){
                Glide.with(GlideTest.this)
                        .load("http://inthecheesefactory.com/uploads/source/nestedfragment/fragments.png")
                        .into(imageView);

            }else if(view.equals(button3)){
                EventBus.getDefault().post(new MessageBase("我只有感叹号"));
            }

        }
    }
}
