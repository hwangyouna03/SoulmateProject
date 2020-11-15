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

public class Sunny_Dress_ViewPager_Adapter extends PagerAdapter {

    private List<ViewPager_Model> models;
    private LayoutInflater layoutInflater;
    private Context context;


    public Sunny_Dress_ViewPager_Adapter(List<ViewPager_Model> models, Context context) {
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
        View view = layoutInflater.inflate(R.layout.dress_food_item, container, false);

        ImageView imageView;
        TextView title, desc;

        imageView = view.findViewById(R.id.image);
        title = view.findViewById(R.id.title);
        desc = view.findViewById(R.id.desc);

        imageView.setImageResource(models.get(position).getImage());
        title.setText(models.get(position).getTitle());
        desc.setText(models.get(position).getDesc());


//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (position==0) {
//                    Intent intent = new Intent(context, TargetActivity.class);
//                    //intent.putExtra("param", models.get(position).getTitle());
//                    context.startActivity(intent);
//
//                }
//                else if(model.getTitle() == ""){
//                    Intent intent = new Intent(context, HomeActivity.class);
//                    //intent.putExtra("param", models.get(position).getTitle());
//                    context.startActivity(intent);
//                }
//                else if(model.getTitle() == ""){
//                    Intent intent = new Intent(context, MartActivity.class);
//                    //intent.putExtra("param", models.get(position).getTitle());
//                    context.startActivity(intent);
//                }
//                else if(model.getTitle() == ""){
//                    Intent intent = new Intent(context, CarActivity.class);
//                    //intent.putExtra("param", models.get(position).getTitle());
//                    context.startActivity(intent);
//                }
//            }
//        });

        container.addView(view, 0);
        return view;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
