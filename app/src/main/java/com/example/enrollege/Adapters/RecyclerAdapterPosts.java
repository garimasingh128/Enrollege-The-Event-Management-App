package com.example.enrollege.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.enrollege.Classes.posts;
import com.example.enrollege.R;

import java.util.List;



public class RecyclerAdapterPosts extends RecyclerView.Adapter<RecyclerAdapterPosts.ViewHolderPosts> {
    public List<posts> postsList;


    public class ViewHolderPosts extends RecyclerView.ViewHolder {
        public ImageView imageEvent;
        public TextView textViewName;
        public TextView textViewTime;
        public TextView textViewDate;
        public ImageView imageViewConfetti;
        public ImageView imageViewProfile;
        public TextView textViewUserName;


        public ViewHolderPosts(@NonNull View itemView) {
            super(itemView);

            imageEvent = itemView.findViewById(R.id.imageEvent);
            textViewName=itemView.findViewById(R.id.textViewName);
            textViewTime = itemView.findViewById(R.id.textViewTime);
            textViewDate=itemView.findViewById(R.id.textViewDate);
            imageViewConfetti=itemView.findViewById(R.id.imageViewConfetti);
            textViewUserName=itemView.findViewById(R.id.textViewUserName);
            imageViewProfile=itemView.findViewById(R.id.imageViewProfile);
        }
    }
    public RecyclerAdapterPosts(List<posts> postsList) {
        this.postsList = postsList;
    }
    @NonNull
    @Override
    public ViewHolderPosts onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.postsrecyclerview,viewGroup,false);
        return new ViewHolderPosts(view);
    }


    public posts setData(posts posts) {
        return posts;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPosts viewHolder, int i) {
        posts posts = postsList.get(i);
        viewHolder. textViewName.setText(posts.getTextViewName());
        viewHolder. textViewDate.setText(String.valueOf(posts.getTextViewDate()));
        viewHolder. textViewTime.setText(posts. getTextViewTime());
        viewHolder.textViewUserName.setText(posts.getTextViewUserName());


    }

    @Override
    public int getItemCount() {

        return postsList.size();
    }

}

