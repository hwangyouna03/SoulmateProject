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

import kr.hs.emirim.s2019s40.soulmateproject.Food.Amar;
import kr.hs.emirim.s2019s40.soulmateproject.Food.ArongStarTable;
import kr.hs.emirim.s2019s40.soulmateproject.Food.BaconEggCup;
import kr.hs.emirim.s2019s40.soulmateproject.Food.BeefVegetableMari;
import kr.hs.emirim.s2019s40.soulmateproject.Food.BlueberryYogurtSmoothie;
import kr.hs.emirim.s2019s40.soulmateproject.Food.Brownie;
import kr.hs.emirim.s2019s40.soulmateproject.Food.BugerLab;
import kr.hs.emirim.s2019s40.soulmateproject.Food.ChickenCompany;
import kr.hs.emirim.s2019s40.soulmateproject.Food.ChickenSoup;
import kr.hs.emirim.s2019s40.soulmateproject.Food.ChopSteak;
import kr.hs.emirim.s2019s40.soulmateproject.Food.DoChef;
import kr.hs.emirim.s2019s40.soulmateproject.Food.DongGiGan;
import kr.hs.emirim.s2019s40.soulmateproject.Food.GinMaratang;
import kr.hs.emirim.s2019s40.soulmateproject.Food.HongKongBanjeom;
import kr.hs.emirim.s2019s40.soulmateproject.Food.KimchiFriedRice;
import kr.hs.emirim.s2019s40.soulmateproject.Food.Koyako;
import kr.hs.emirim.s2019s40.soulmateproject.Food.MorningBreadHambuger;
import kr.hs.emirim.s2019s40.soulmateproject.Food.MukMyeokSanBang;
import kr.hs.emirim.s2019s40.soulmateproject.Food.Okonomiyaki;
import kr.hs.emirim.s2019s40.soulmateproject.Food.PannePasta;
import kr.hs.emirim.s2019s40.soulmateproject.Food.PikachuPorkcutlet;
import kr.hs.emirim.s2019s40.soulmateproject.Food.PorkBellyKimbap;
import kr.hs.emirim.s2019s40.soulmateproject.Food.PotatoPizza;
import kr.hs.emirim.s2019s40.soulmateproject.Food.StrawBerryAde;
import kr.hs.emirim.s2019s40.soulmateproject.Food.Suchiichiza;

public class Cloudy_Food_ViewPager_Adapter extends PagerAdapter {

    private List<ViewPager_Model> models;
    private LayoutInflater layoutInflater;
    private Context context;


    public Cloudy_Food_ViewPager_Adapter(List<ViewPager_Model> models, Context context) {
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
                if (position==0) {
                    Intent intent = new Intent(context, PotatoPizza.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==1){
                    Intent intent = new Intent(context, KimchiFriedRice.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==2){
                    Intent intent = new Intent(context, ChickenSoup.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==3){
                    Intent intent = new Intent(context, StrawBerryAde.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==4){
                    Intent intent = new Intent(context, MorningBreadHambuger.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==5){
                    Intent intent = new Intent(context, BaconEggCup.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==6){
                    Intent intent = new Intent(context, Brownie.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==7){
                    Intent intent = new Intent(context, BlueberryYogurtSmoothie.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==8){
                    Intent intent = new Intent(context, PannePasta.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==9){
                    Intent intent = new Intent(context, PorkBellyKimbap.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==10){
                    Intent intent = new Intent(context, BeefVegetableMari.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==11){
                    Intent intent = new Intent(context, Okonomiyaki.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==12){
                    Intent intent = new Intent(context, ChopSteak.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==13){
                    Intent intent = new Intent(context, PikachuPorkcutlet.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==14){
                    Intent intent = new Intent(context, ChickenCompany.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==15){
                    Intent intent = new Intent(context, DoChef.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==16){
                    Intent intent = new Intent(context, DongGiGan.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==17){
                    Intent intent = new Intent(context, MukMyeokSanBang.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==18){
                    Intent intent = new Intent(context, BugerLab.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==19){
                    Intent intent = new Intent(context, Suchiichiza.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==20){
                    Intent intent = new Intent(context, ArongStarTable.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==21){
                    Intent intent = new Intent(context, Amar.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==22){
                    Intent intent = new Intent(context, GinMaratang.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==23){
                    Intent intent = new Intent(context, Koyako.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position==24){
                    Intent intent = new Intent(context, HongKongBanjeom.class);
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
