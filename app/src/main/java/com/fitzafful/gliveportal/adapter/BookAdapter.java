package com.fitzafful.gliveportal.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fitzafful.gliveportal.R;
import com.fitzafful.gliveportal.db.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akabah on 8/17/15.
 * This adapter is responsible or populating names of students alone
 *  @see RecyclerView for more info on Recycler Adapters
 */
public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    List<Book> tempClasses;
    Context context;
    public static final String DEFAULT = "N/A";

    public BookAdapter(List<Book> tempClasses, Context context)
    {
        this.tempClasses = new ArrayList<>();
        this.tempClasses.addAll(tempClasses);
        this.context = context;
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.library_item,parent,false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {
        Book tempClass = tempClasses.get(position);
        holder.textViewName.setText(tempClass.getName());
        holder.textViewClass.setText(tempClass.getAuthor());
        holder.textViewSchool.setText(tempClass.getGenre());
        holder.cardView.setRadius(20);

        if(tempClass.getId().equalsIgnoreCase("0")){
            holder.profilepic.setImageResource(R.drawable.img9);
        }else if(tempClass.getId().equalsIgnoreCase("1")){

            holder.profilepic.setImageResource(R.drawable.img7);
        }else if(tempClass.getId().equalsIgnoreCase("2")){

            holder.profilepic.setImageResource(R.drawable.img2);
        }else if(tempClass.getId().equalsIgnoreCase("3")){

            holder.profilepic.setImageResource(R.drawable.img3);
        }else if(tempClass.getId().equalsIgnoreCase("4")){

            holder.profilepic.setImageResource(R.drawable.img10);
        }else if(tempClass.getId().equalsIgnoreCase("5")){

            holder.profilepic.setImageResource(R.drawable.img5);
        }else if (tempClass.getId().equalsIgnoreCase("6")){

            holder.profilepic.setImageResource(R.drawable.img6);
        }else if(tempClass.getId().equalsIgnoreCase("7")){

            holder.profilepic.setImageResource(R.drawable.img7);
        }else if(tempClass.getId().equalsIgnoreCase("8")){

            holder.profilepic.setImageResource(R.drawable.img8);
        }else if(tempClass.getId().equalsIgnoreCase("9")){

            holder.profilepic.setImageResource(R.drawable.img9);
        }else if(tempClass.getId().equalsIgnoreCase("10")){

            holder.profilepic.setImageResource(R.drawable.img10);
        }

        if(!(tempClass.isReserved())) {
            holder.booked.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return tempClasses.size();
    }

    public static class BookViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView textViewName;
        TextView textViewClass;
        TextView textViewSchool;
        ImageView booked;
        ImageView profilepic;

        public BookViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cardWard);
            textViewName = (TextView) itemView.findViewById(R.id.wardname);
            textViewClass = (TextView) itemView.findViewById(R.id.textViewClass);
            textViewSchool = (TextView) itemView.findViewById(R.id.school);
            profilepic = (ImageView) itemView.findViewById(R.id.imageView12);
            booked = (ImageView) itemView.findViewById(R.id.booked);
        }
    }

}