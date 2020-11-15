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

import kr.hs.emirim.s2019s40.soulmateproject.Food.AbalonePorridge;
import kr.hs.emirim.s2019s40.soulmateproject.Food.BeefBrisketbeanSprouts;
import kr.hs.emirim.s2019s40.soulmateproject.Food.CarbonaraTteokbokki;
import kr.hs.emirim.s2019s40.soulmateproject.Food.ChickenKebabs;
import kr.hs.emirim.s2019s40.soulmateproject.Food.ChickenSteak;
import kr.hs.emirim.s2019s40.soulmateproject.Food.CornCheese;
import kr.hs.emirim.s2019s40.soulmateproject.Food.CrabCroquette;
import kr.hs.emirim.s2019s40.soulmateproject.Food.Gambas;
import kr.hs.emirim.s2019s40.soulmateproject.Food.HotChocolate;
import kr.hs.emirim.s2019s40.soulmateproject.Food.JstyleSteamedEggs;
import kr.hs.emirim.s2019s40.soulmateproject.Food.JstyleStirfiryUdon;
import kr.hs.emirim.s2019s40.soulmateproject.Food.Kalguksu;
import kr.hs.emirim.s2019s40.soulmateproject.Food.KimchiBulgogiBurrtio;
import kr.hs.emirim.s2019s40.soulmateproject.Food.KkanpungTofu;
import kr.hs.emirim.s2019s40.soulmateproject.Food.MilkyouNabe;
import kr.hs.emirim.s2019s40.soulmateproject.Food.PotatoShirmpRice;
import kr.hs.emirim.s2019s40.soulmateproject.Food.RiceBuger;
import kr.hs.emirim.s2019s40.soulmateproject.Food.RiceCakeSkewer;
import kr.hs.emirim.s2019s40.soulmateproject.Food.RicePizza;
import kr.hs.emirim.s2019s40.soulmateproject.Food.Sangria;
import kr.hs.emirim.s2019s40.soulmateproject.Food.SeaFoodNurungjisoup;
import kr.hs.emirim.s2019s40.soulmateproject.Food.SirloinSteak;
import kr.hs.emirim.s2019s40.soulmateproject.Food.SquidStirfry;
import kr.hs.emirim.s2019s40.soulmateproject.Food.ToumbaPasta;

public class Rain_and_Snow_Food_ViewPager_Adapter extends PagerAdapter {

    private List<ViewPager_Model> models;
    private LayoutInflater layoutInflater;
    private Context context;


    public Rain_and_Snow_Food_ViewPager_Adapter(List<ViewPager_Model> models, Context context) {
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
                    Intent intent = new Intent(context, Gambas.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);

                }
                else if(position == 1){
                    Intent intent = new Intent(context, PotatoShirmpRice.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(context, KimchiBulgogiBurrtio.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 3){
                    Intent intent = new Intent(context, CrabCroquette.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 4){
                    Intent intent = new Intent(context, CarbonaraTteokbokki.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 5){
                    Intent intent = new Intent(context, ChickenKebabs.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 6){
                    Intent intent = new Intent(context, KkanpungTofu.class);
                   //intent.putExtra("param", models.get(position).getTitle());
                   context.startActivity(intent);
                }
                else if(position == 7){
                    Intent intent = new Intent(context, SirloinSteak.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 8){
                    Intent intent = new Intent(context, RiceCakeSkewer.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 9){
                    Intent intent = new Intent(context, MilkyouNabe.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 10){
                    Intent intent = new Intent(context, RiceBuger.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 11){
                    Intent intent = new Intent(context, RicePizza.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 12){
                    Intent intent = new Intent(context, Sangria.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 13){
                    Intent intent = new Intent(context, BeefBrisketbeanSprouts.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 14){
                    Intent intent = new Intent(context, SquidStirfry.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 15){
                    Intent intent = new Intent(context, JstyleStirfiryUdon.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 16){
                    Intent intent = new Intent(context, JstyleSteamedEggs.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 17){
                    Intent intent = new Intent(context, AbalonePorridge.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 18){
                    Intent intent = new Intent(context, ChickenSteak.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 19){
                    Intent intent = new Intent(context, Kalguksu.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 20){
                    Intent intent = new Intent(context, CornCheese.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 21){
                    Intent intent = new Intent(context, ToumbaPasta.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 22){
                    Intent intent = new Intent(context, HotChocolate.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    context.startActivity(intent);
                }
                else if(position == 23){
                    Intent intent = new Intent(context, SeaFoodNurungjisoup.class);
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
