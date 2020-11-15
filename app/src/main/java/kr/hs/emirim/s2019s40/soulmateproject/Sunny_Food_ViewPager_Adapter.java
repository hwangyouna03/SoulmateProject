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

import kr.hs.emirim.s2019s40.soulmateproject.Food.AlexsPlace;
import kr.hs.emirim.s2019s40.soulmateproject.Food.AllThePlate;
import kr.hs.emirim.s2019s40.soulmateproject.Food.AppleHouse;
import kr.hs.emirim.s2019s40.soulmateproject.Food.BimBom;
import kr.hs.emirim.s2019s40.soulmateproject.Food.BisonBurger;
import kr.hs.emirim.s2019s40.soulmateproject.Food.BltStake;
import kr.hs.emirim.s2019s40.soulmateproject.Food.DesigneryCafe;
import kr.hs.emirim.s2019s40.soulmateproject.Food.FearlessRabbit_Kit;
import kr.hs.emirim.s2019s40.soulmateproject.Food.HeartyMeal;
import kr.hs.emirim.s2019s40.soulmateproject.Food.ItaliPaPa;
import kr.hs.emirim.s2019s40.soulmateproject.Food.Lasiestar;
import kr.hs.emirim.s2019s40.soulmateproject.Food.LegsHouse;
import kr.hs.emirim.s2019s40.soulmateproject.Food.LogHouseDakgalbi;
import kr.hs.emirim.s2019s40.soulmateproject.Food.MountainFarm;
import kr.hs.emirim.s2019s40.soulmateproject.Food.NipongNaepong;
import kr.hs.emirim.s2019s40.soulmateproject.Food.Otoya;
import kr.hs.emirim.s2019s40.soulmateproject.Food.PFChangs;
import kr.hs.emirim.s2019s40.soulmateproject.Food.PremiumSum;
import kr.hs.emirim.s2019s40.soulmateproject.Food.RedBrick;
import kr.hs.emirim.s2019s40.soulmateproject.Food.SuhebokMaratang;
import kr.hs.emirim.s2019s40.soulmateproject.Food.TanksTakbogi;
import kr.hs.emirim.s2019s40.soulmateproject.Food.TheMeltingPot;
import kr.hs.emirim.s2019s40.soulmateproject.Food.TokyoWalk;
import kr.hs.emirim.s2019s40.soulmateproject.Food.TwoDotsBakery;
import kr.hs.emirim.s2019s40.soulmateproject.Food.VaultSteakHouse;
import kr.hs.emirim.s2019s40.soulmateproject.Food.WolfgangsSteakHouse;
import kr.hs.emirim.s2019s40.soulmateproject.Food.YankeeChicken;
import kr.hs.emirim.s2019s40.soulmateproject.Food.ZeroNineKitchen;

public class Sunny_Food_ViewPager_Adapter extends PagerAdapter {

    private List<ViewPager_Model> models;
    private LayoutInflater layoutInflater;
    private Context context;


    public Sunny_Food_ViewPager_Adapter(List<ViewPager_Model> models, Context context) {
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


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    Intent intent = new Intent(context, TwoDotsBakery.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);

                }
                else if(position == 1){
                    Intent intent = new Intent(context, BltStake.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(context, FearlessRabbit_Kit.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 3){
                    Intent intent = new Intent(context, NipongNaepong.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 4){
                    Intent intent = new Intent(context, LegsHouse.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 5){
                    Intent intent = new Intent(context, TheMeltingPot.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 6){
                    Intent intent = new Intent(context, TokyoWalk.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 7){
                    Intent intent = new Intent(context, HeartyMeal.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 8){
                    Intent intent = new Intent(context, DesigneryCafe.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 9){
                    Intent intent = new Intent(context, Lasiestar.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 10){
                    Intent intent = new Intent(context, RedBrick.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 11){
                    Intent intent = new Intent(context, BisonBurger.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 12){
                    Intent intent = new Intent(context, VaultSteakHouse.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 13){
                    Intent intent = new Intent(context, BimBom.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 14){
                    Intent intent = new Intent(context, MountainFarm.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 15){
                    Intent intent = new Intent(context, SuhebokMaratang.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 16){
                    Intent intent = new Intent(context, AlexsPlace.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 17){
                    Intent intent = new Intent(context, AppleHouse.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 18){
                    Intent intent = new Intent(context, YankeeChicken.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 19){
                    Intent intent = new Intent(context, ZeroNineKitchen.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 20){
                    Intent intent = new Intent(context, Otoya.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 21){
                    Intent intent = new Intent(context, AllThePlate.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 22){
                    Intent intent = new Intent(context, WolfgangsSteakHouse.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 23){
                    Intent intent = new Intent(context, ItaliPaPa.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 24){
                    Intent intent = new Intent(context, TanksTakbogi.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 25){
                    Intent intent = new Intent(context, LogHouseDakgalbi.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 26){
                    Intent intent = new Intent(context, PremiumSum.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 27){
                    Intent intent = new Intent(context, PFChangs.class);
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
