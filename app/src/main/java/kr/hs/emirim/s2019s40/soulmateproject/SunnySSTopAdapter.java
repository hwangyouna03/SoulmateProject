package kr.hs.emirim.s2019s40.soulmateproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

import kr.hs.emirim.s2019s40.soulmateproject.Dress.Dots;
import kr.hs.emirim.s2019s40.soulmateproject.Dress.FourSeasonLooseShortSleeve;
import kr.hs.emirim.s2019s40.soulmateproject.Dress.IfCanSee;
import kr.hs.emirim.s2019s40.soulmateproject.Dress.OverFitShortSleeve;


public class SunnySSTopAdapter extends PagerAdapter {

    private List<DressViewPager_Model> models;
    private LayoutInflater layoutInflater;
    private Context context;


    public SunnySSTopAdapter(List<DressViewPager_Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.dress_item, container, false);

        ImageView imageView;
        TextView title;

        imageView = view.findViewById(R.id.image);
        title = view.findViewById(R.id.title);

        imageView.setImageResource(models.get(position).getImage());
        title.setText(models.get(position).getTitle());


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    Intent intent = new Intent(context, FourSeasonLooseShortSleeve.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 1){
                    Intent intent = new Intent(context, IfCanSee.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(context, OverFitShortSleeve.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 3){
                    Intent intent = new Intent(context, Dots.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
            }
        });

        container.addView(view, 0);
        return view;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
