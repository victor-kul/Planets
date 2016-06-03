package com.lessons.vi_key.planets;

import android.graphics.drawable.Drawable;

public class CardDataObject {
    private String mTitle;
    private String mDescription;
    private Drawable mIcon;

    CardDataObject(String title, String description, Drawable icon){
        mTitle = title;
        mDescription = description;
        mIcon = icon;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String value) {
        this.mTitle = value;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String value) {
        this.mDescription = value;
    }

    public void setIcon(Drawable value) {
        mIcon = value;
    }

    public Drawable getIcon() {
        return mIcon;
    }
}
