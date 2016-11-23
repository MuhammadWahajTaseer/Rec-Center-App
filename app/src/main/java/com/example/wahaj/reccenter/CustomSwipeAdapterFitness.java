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
 * Created by wahaj on 2016-11-22.
 */

public class CustomSwipeAdapterFitness extends PagerAdapter {

    private int[] image_resources_fitness = {R.drawable.mondays, R.drawable.tuesdays, R.drawable.wednesdays,
            R.drawable.thursdays, R.drawable.fridays, R.drawable.saturdays, R.drawable.sundays};
    private String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private Context ctx;

    public CustomSwipeAdapterFitness(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resources_fitness.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater layoutInflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflator.inflate(R.layout.swipe_layout_fitness, container, false);

        ImageView imageView = (ImageView) item_view.findViewById(R.id.fitness_how_busy);
        TextView textView = (TextView) item_view.findViewById(R.id.fitness_day);

        imageView.setImageResource(image_resources_fitness[position]);
        textView.setText(days[position]);

        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

}
