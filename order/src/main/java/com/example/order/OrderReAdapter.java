package com.example.order;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class OrderReAdapter extends RecyclerView.Adapter<OrderReAdapter.ViewHolder> {
    private  List<Fruit> mfruitlist;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View fruitView;
        ImageView imageView;
        TextView textView;

        public ViewHolder(View view){
            super(view);
            fruitView = view;
            imageView = (ImageView) view.findViewById(R.id.fruit_image);
            textView =(TextView) view.findViewById(R.id.fruitname);
        }
    }

    public OrderReAdapter(List<Fruit> fruitlist){
        mfruitlist = fruitlist;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_list_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.fruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Fruit fruit = mfruitlist.get(position);
                Toast.makeText(v.getContext(), "you clicked view " + fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Fruit fruit = mfruitlist.get(position);
                Toast.makeText(v.getContext(), "you clicked image " + fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Fruit fruit = mfruitlist.get(position);
        holder.imageView.setImageResource(fruit.getImageId());
        holder.textView.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return mfruitlist.size();
    }
}
