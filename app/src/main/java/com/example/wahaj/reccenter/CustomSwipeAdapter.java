package com.example.wahaj.reccenter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by wahaj on 2016-11-18.
 */

public class CustomSwipeAdapter extends PagerAdapter {

    private int[] image_resources = {R.drawable.icon_canoe, R.drawable.icon_lifejacket,
            R.drawable.icon_kayak, R.drawable.icon_raft, R.drawable.icon_helmet, R.drawable.icon_paddles, R.drawable.icon_wetsuit, };
    private String[] image_labels= {"Canoe", "Life Jacket", "Kayak", "Raft", "Helmet", "Paddles", "Wetsuit"};
    private String[] image_prices= {"Price = $26", "Price = $3", "Price = $18", "Price = $45", "Price = $3", "Price = $2 - 6", "Price = $10"};
    private Context ctx;


    public CustomSwipeAdapter(Context ctx){

        this.ctx = ctx;
    }


    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater layoutInflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflator.inflate(R.layout.swipe_layout, container, false);

        ImageView imageView = (ImageView) item_view.findViewById(R.id.image_view);
        TextView textViewLabel = (TextView) item_view.findViewById(R.id.image_count);
        TextView textViewPrice = (TextView) item_view.findViewById(R.id.image_price);

        imageView.setImageResource(image_resources[position]);
        textViewLabel.setText(image_labels[position]);
        textViewPrice.setText(image_prices[position]);

        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       container.removeView((LinearLayout) object);
    }

}
