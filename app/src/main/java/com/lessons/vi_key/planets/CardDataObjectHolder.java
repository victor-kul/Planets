package com.lessons.vi_key.planets;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class CardDataObjectHolder extends RecyclerView.ViewHolder {
    TextView label;
    TextView dateTime;
    ImageView icon;

    public CardDataObjectHolder(View itemView) {
        super(itemView);
        label = (TextView) itemView.findViewById(R.id.card_title);
        dateTime = (TextView) itemView.findViewById(R.id.card_description);

        icon = (ImageView) itemView.findViewById(R.id.card_icon);
    }
}
