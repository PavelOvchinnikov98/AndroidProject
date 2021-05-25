package com.example.recipebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Рецепты");

        ArrayList<RecipeBookItem> recipeBookItems = new ArrayList<>();

        recipeBookItems.add(new RecipeBookItem(R.drawable.recipe_1, Utils.RECIPE_1_TITLE,
                Utils.RECIPE_1_DESCRIPTION, Utils.RECIPE_1_RECIPE));
        recipeBookItems.add(new RecipeBookItem(R.drawable.recipe_2, Utils.RECIPE_2_TITLE,
                Utils.RECIPE_2_DESCRIPTION, Utils.RECIPE_2_RECIPE));
        recipeBookItems.add(new RecipeBookItem(R.drawable.recipe_3, Utils.RECIPE_3_TITLE,
                Utils.RECIPE_3_DESCRIPTION, Utils.RECIPE_3_RECIPE));
        recipeBookItems.add(new RecipeBookItem(R.drawable.recipe_4, Utils.RECIPE_4_TITLE,
                Utils.RECIPE_4_DESCRIPTION, Utils.RECIPE_4_RECIPE));
        recipeBookItems.add(new RecipeBookItem(R.drawable.recipe_5, Utils.RECIPE_5_TITLE,
                Utils.RECIPE_5_DESCRIPTION, Utils.RECIPE_5_RECIPE));
        recipeBookItems.add(new RecipeBookItem(R.drawable.recipe_6, Utils.RECIPE_6_TITLE,
                Utils.RECIPE_6_DESCRIPTION, Utils.RECIPE_6_RECIPE));
        recipeBookItems.add(new RecipeBookItem(R.drawable.recipe_7, Utils.RECIPE_7_TITLE,
                Utils.RECIPE_7_DESCRIPTION, Utils.RECIPE_7_RECIPE));
        recipeBookItems.add(new RecipeBookItem(R.drawable.recipe_8, Utils.RECIPE_8_TITLE,
                Utils.RECIPE_8_DESCRIPTION, Utils.RECIPE_8_RECIPE));
        recipeBookItems.add(new RecipeBookItem(R.drawable.recipe_9, Utils.RECIPE_9_TITLE,
                Utils.RECIPE_9_DESCRIPTION, Utils.RECIPE_9_RECIPE));
        recipeBookItems.add(new RecipeBookItem(R.drawable.recipe_10, Utils.RECIPE_10_TITLE,
                Utils.RECIPE_10_DESCRIPTION, Utils.RECIPE_10_RECIPE));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecipeBookAdapter(recipeBookItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}