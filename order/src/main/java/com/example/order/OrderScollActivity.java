package com.example.order;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class OrderScollActivity extends Activity {

    private ListView listView;

    private List<Fruit> fruitList = new ArrayList<>();

    private Toolbar toolbar;

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_scoll_activity);

        toolbar = (Toolbar) findViewById(R.id.toolbar_order_scoll);
        toolbar.setTitle("订单界面");

        initFruits();
        listView = findViewById(R.id.content_orderlist);
        FruitAdapter arrayAdapter = new FruitAdapter(OrderScollActivity.this,R.layout.order_list_item,fruitList);
        listView.setAdapter(arrayAdapter);

        recyclerView = findViewById(R.id.content_orderlist_scoll);
//        StaggeredGridLayoutManager layoutManager = new
//                StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        OrderReAdapter adp = new OrderReAdapter(fruitList);
        recyclerView.setAdapter(adp);
    }

    private void initFruits(){
        for( int i =0; i<2;i++){
            Fruit apple = new Fruit("Apple",R.drawable.ic_launcher);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana",R.drawable.ic_launcher);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange",R.drawable.ic_launcher);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon",R.drawable.ic_launcher);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear",R.drawable.ic_launcher);
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape",R.drawable.ic_launcher);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple",R.drawable.ic_launcher);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry",R.drawable.ic_launcher);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry",R.drawable.ic_launcher);
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango",R.drawable.ic_launcher);
            fruitList.add(mango);

        }
    }
}