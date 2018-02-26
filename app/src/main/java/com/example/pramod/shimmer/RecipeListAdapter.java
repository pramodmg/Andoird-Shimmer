package com.example.pramod.shimmer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by 11095 on 26/02/18.
 */

public class RecipeListAdapter extends RecyclerView.Adapter<RecipeListAdapter.MyViewHolder> {

    private Context context;
    private List<Recipe> cartList;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reciepe_list_item, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Recipe recipe = cartList.get(position);
        holder.name.setText(recipe.getName());
        holder.chef.setText("By " + recipe.getChef());
        holder.description.setText(recipe.getDescription());
        holder.price.setText("Rs " + recipe.getPrice());
        holder.timestamp.setText(recipe.getTimestamp());

        Glide.with(context)
                .load(recipe.getThumbnail())
                .into(holder.thumbnail);
    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, description, price, chef, timestamp;
        public ImageView thumbnail;
        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.name);
            description = view.findViewById(R.id.description);
            price = view.findViewById(R.id.price);
            chef = view.findViewById(R.id.chef);
            timestamp = view.findViewById(R.id.timestamp);

            thumbnail = view.findViewById(R.id.thumbnail);
        }
    }

    public RecipeListAdapter(Context context,List<Recipe> cartList) {
        this.context = context;
        this.cartList = cartList;
    }


}
