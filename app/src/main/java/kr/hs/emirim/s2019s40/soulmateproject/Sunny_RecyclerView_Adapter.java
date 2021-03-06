package kr.hs.emirim.s2019s40.soulmateproject;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import kr.hs.emirim.s2019s40.soulmateproject.Place.ArtVillage;
import kr.hs.emirim.s2019s40.soulmateproject.Place.Botania;
import kr.hs.emirim.s2019s40.soulmateproject.Place.CheeseTemapark;
import kr.hs.emirim.s2019s40.soulmateproject.Place.FlyingGyeonju;
import kr.hs.emirim.s2019s40.soulmateproject.Place.HwanseonCave;
import kr.hs.emirim.s2019s40.soulmateproject.Place.JadenGarden;
import kr.hs.emirim.s2019s40.soulmateproject.Place.PrettyFrance;
import kr.hs.emirim.s2019s40.soulmateproject.Place.SongdoMarineCableCar;
import kr.hs.emirim.s2019s40.soulmateproject.Place.SwissTemapark;
import kr.hs.emirim.s2019s40.soulmateproject.Place.WindHill;

public class Sunny_RecyclerView_Adapter extends RecyclerView.Adapter<Sunny_RecyclerView_Adapter.ViewHolder> {
    Context context;
    List<RecyclerView_Model> items;
    int item_layout;

    public Sunny_RecyclerView_Adapter(Context context, List<RecyclerView_Model> items, int item_layout) {
        this.context = context;
        this.items = items;
        this.item_layout = item_layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.place_item, null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.image.setImageResource(items.get(position).getImage());
        holder.title.setText(items.get(position).getTitle());
        holder.desc.setText(items.get(position).getDesc());

        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    Intent intent = new Intent(v.getContext(), WindHill.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    v.getContext().startActivity(intent);
                }
                else if(position == 1){
                    Intent intent = new Intent(v.getContext(), Botania.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    v.getContext().startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(v.getContext(), ArtVillage.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    v.getContext().startActivity(intent);
                }
                else if(position == 3){
                    Intent intent = new Intent(v.getContext(), PrettyFrance.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    v.getContext().startActivity(intent);
                }
                else if(position == 4){
                    Intent intent = new Intent(v.getContext(), SongdoMarineCableCar.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    v.getContext().startActivity(intent);
                }
                else if(position == 5){
                    Intent intent = new Intent(v.getContext(), SwissTemapark.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    v.getContext().startActivity(intent);
                }
                else if(position == 6){
                    Intent intent = new Intent(v.getContext(), CheeseTemapark.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    v.getContext().startActivity(intent);
                }
                else if(position == 7){
                    Intent intent = new Intent(v.getContext(), JadenGarden.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    v.getContext().startActivity(intent);
                }

                else if(position == 8){
                    Intent intent = new Intent(v.getContext(), FlyingGyeonju.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    v.getContext().startActivity(intent);
                }
                else if(position == 9){
                    Intent intent = new Intent(v.getContext(), HwanseonCave.class);
                    //intent.putExtra("param", models.get(position).getTitle());
                    v.getContext().startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title, desc;
        CardView cardview;

        public ViewHolder(View view) {
            super(view);
            image = (ImageView) view.findViewById(R.id.image);
            title = (TextView) view.findViewById(R.id.title);
            desc = (TextView) view.findViewById(R.id.desc);
            cardview = (CardView) view.findViewById(R.id.Sunny_place_cardView);
        }
    }
}