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

    private int[] image_resorces = {R.drawable.icon_canoe, R.drawable.icon_helmet, R.drawable.icon_kayak};
    private Context ctx;
    private LayoutInflater layoutInflator;

    public CustomSwipeAdapter(Context ctx){

        this.ctx = ctx;
    }


    @Override
    public int getCount() {
        return image_resorces.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflator.inflate(R.layout.swipe_layout, container, false);

        ImageView imageView = (ImageView) item_view.findViewById(R.id.image_view);
        TextView textView = (TextView) item_view.findViewById(R.id.image_count);
        imageView.setImageResource(image_resorces[position]);
        textView.setText("Image: " + position);
        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       container.removeView((LinearLayout) object);
    }

}
