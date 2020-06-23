package com.example.rinkdproject.coffee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.rinkdproject.R;

import java.util.ArrayList;

public class DrinkAdapter extends RecyclerView.Adapter<DrinkAdapter.CustomViewHolder> {

    private ArrayList<Drink> arrayList;
    private Context context;

    public DrinkAdapter(ArrayList<Drink> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.drink_item,parent,false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Glide.with(holder.itemView)
                .load(arrayList.get(position).getImage())
                .into(holder.imageView);
        holder.tv_name.setText(arrayList.get(position).getCafename());
        holder.tv_price.setText(String.valueOf(arrayList.get(position).getPrice()));
        holder.tv_drinkname.setText(arrayList.get(position).getDrinkname());
        holder.tv_textprice.setText(arrayList.get(position).getTextprice());
        //  holder.zzim.setText(arrayList.get(position).getFav());
    }

    @Override
    public int getItemCount() {
        return (arrayList != null ? arrayList.size() :0);
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tv_name;
        TextView tv_price;
        TextView tv_drinkname;
        TextView tv_textprice;
        // Button zzim;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            this.imageView = itemView.findViewById(R.id.image_drink);
            this.tv_name = itemView.findViewById(R.id.textView_name);
            this.tv_price = itemView.findViewById(R.id.textView_price);
            this.tv_textprice = itemView.findViewById(R.id.textView_price);
            this.tv_drinkname = itemView.findViewById(R.id.textView_drinkname);
            // this.zzim = itemView.findViewById(R.id.zzim);

        }

    }
}
