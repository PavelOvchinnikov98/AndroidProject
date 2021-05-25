package com.example.recipebook;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecipeBookAdapter extends RecyclerView.Adapter<RecipeBookAdapter.RecipeBookViewHolder>{

    ArrayList<RecipeBookItem> recipeBookItems;
    Context context;

    public RecipeBookAdapter(ArrayList<RecipeBookItem> recipeBookItems,
                             Context context){
        this.recipeBookItems = recipeBookItems;
        this.context = context;
    }
    @NonNull
    @Override
    public RecipeBookAdapter.RecipeBookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_recipe_item,
                parent, false);
        RecipeBookViewHolder recipeBookViewHolder = new RecipeBookViewHolder(view);
        return recipeBookViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeBookViewHolder holder, int i) {
        RecipeBookItem recipeBookItem = recipeBookItems.get(i);
        holder.recipeImageView.setImageResource(recipeBookItem.getImageResource());
        holder.title.setText(recipeBookItem.getTitle());
        holder.description.setText(recipeBookItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return recipeBookItems.size();
    }

    class RecipeBookViewHolder extends RecyclerView.ViewHolder implements
            View.OnClickListener {

        public ImageView recipeImageView;
        public TextView title;
        public TextView description;

        public RecipeBookViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            recipeImageView = itemView.findViewById(R.id.recipeImageView);
            title = itemView.findViewById(R.id.titleTextView);
            description = itemView.findViewById(R.id.descriptionTextView);
        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            RecipeBookItem recipeBookItem = recipeBookItems.get(position);

            Intent intent = new Intent(context, RecipeActivity.class);
            intent.putExtra("imageResource", recipeBookItem.getImageResource());
            intent.putExtra("title", recipeBookItem.getTitle());
            intent.putExtra("description", recipeBookItem.getDescription());
            intent.putExtra("recipe", recipeBookItem.getRecipe1());
            context.startActivity(intent);
        }
    }
}
