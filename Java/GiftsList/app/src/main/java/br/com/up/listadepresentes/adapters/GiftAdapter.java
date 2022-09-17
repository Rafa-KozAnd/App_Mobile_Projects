package br.com.up.listadepresentes.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import br.com.up.listadepresentes.R;
import br.com.up.listadepresentes.models.Gift;

public class GiftAdapter extends
        RecyclerView.Adapter<GiftAdapter.GiftViewHolder> {

    private ArrayList<Gift> gifts;

    public GiftAdapter(ArrayList<Gift> gifts){
        this.gifts = gifts;
    }

    @NonNull
    @Override
    public GiftViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType) {

        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());

        View layout = layoutInflater.inflate(
                R.layout.view_item_gift,
                parent,
                false
        );

        return new GiftViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull GiftViewHolder holder
            , int position) {

        Gift gift = gifts.get(position);

        TextView textViewName =
                holder.itemView.findViewById(R.id.text_view_item_name);
        TextView textViewGift =
                holder.itemView.findViewById(R.id.text_view_item_gift);
        TextView textViewDescription =
                holder.itemView.findViewById(R.id.text_view_item_description);

        textViewName.setText(gift.getName());
        textViewGift.setText(gift.getGift());
        textViewDescription.setText(gift.getDescription());
    }

    @Override
    public int getItemCount() {
        return gifts.size();
    }

    public static class GiftViewHolder
            extends RecyclerView.ViewHolder{

        public GiftViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
