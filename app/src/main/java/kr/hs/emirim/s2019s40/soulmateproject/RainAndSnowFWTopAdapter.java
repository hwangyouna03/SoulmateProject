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

import kr.hs.emirim.s2019s40.soulmateproject.Dress.AutumnSheep;
import kr.hs.emirim.s2019s40.soulmateproject.Dress.BigTwist;
import kr.hs.emirim.s2019s40.soulmateproject.Dress.GimoV;
import kr.hs.emirim.s2019s40.soulmateproject.Dress.LamWools;
import kr.hs.emirim.s2019s40.soulmateproject.Dress.Mohe;
import kr.hs.emirim.s2019s40.soulmateproject.Dress.OverFitFluff;
import kr.hs.emirim.s2019s40.soulmateproject.Dress.SheepGimo;


public class RainAndSnowFWTopAdapter extends PagerAdapter {

    private List<DressViewPager_Model> models;
    private LayoutInflater layoutInflater;
    private Context context;


    public RainAndSnowFWTopAdapter(List<DressViewPager_Model> models, Context context) {
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
                    Intent intent = new Intent(context, OverFitFluff.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 1){
                    Intent intent = new Intent(context, SheepGimo.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(context, GimoV.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 3){
                    Intent intent = new Intent(context, AutumnSheep.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 4){
                    Intent intent = new Intent(context, LamWools.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 5){
                    Intent intent = new Intent(context, Mohe.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 6){
                    Intent intent = new Intent(context, BigTwist.class);
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
