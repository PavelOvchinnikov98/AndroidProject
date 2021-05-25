package com.example.recipebook;

public class RecipeBookItem {
    private int imageResource;
    private String title;
    private String description;
    private String recipe1;

    public RecipeBookItem(int imageResource, String title, String description, String recipe1) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        this.recipe1 = recipe1;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    public String getRecipe1(){
        return recipe1;
    }
}
