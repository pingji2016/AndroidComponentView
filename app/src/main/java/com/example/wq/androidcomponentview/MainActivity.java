package com.example.wq.androidcomponentview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.common.Message.MessageBase;
import com.example.common.Message.MessageMap;
import com.example.order.OrderMainActivity;
import com.example.personal.PersonalMainActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity {

    private boolean flagOfSendEvent = false;

    private String eventMessage = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
        showToast();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        flagOfSendEvent = false;
        String eventMessage = "";
    }

    @Override
    protected void onResume() {
        super.onResume();
//        showToast();
    }

    private void showToast() {
        if (flagOfSendEvent){
            Toast.makeText(getApplicationContext(), eventMessage,Toast.LENGTH_SHORT).show();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageBase event) {
        //处理
        flagOfSendEvent = true;
        eventMessage = event.getMessage();
        showToast();
    };


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
