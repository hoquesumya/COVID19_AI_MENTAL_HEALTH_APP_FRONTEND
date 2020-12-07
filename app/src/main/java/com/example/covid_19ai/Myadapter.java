package com.example.covid_19ai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myadapter extends RecyclerView.Adapter<Myadapter.Myviewholder> {
    String data1[];
    int imges[];
    Context context;
    public Myadapter(Context ci, String s1[],int images[]){
        context=ci;
        data1=s1;
        imges=images;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.my_row,parent,false);
        return new Myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
        holder.view1.setText(data1[position]);
        holder.myimage.setImageResource(imges[position]);
    }

    @Override
    public int getItemCount() {
        return imges.length;
    }

    public class Myviewholder extends RecyclerView.ViewHolder {
        TextView view1;
        ImageView myimage;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            view1=itemView.findViewById(R.id.CounselingNAme);
            myimage=itemView.findViewById(R.id.MyimageView);
        }
    }
}
