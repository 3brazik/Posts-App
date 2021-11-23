package com.example.fackbookv2.UI.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fackbookv2.R;
import com.example.fackbookv2.pojo.PostModel;

import java.util.ArrayList;
import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {
    private List<PostModel> postsList = new ArrayList<>();

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false));
}

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {

        holder.tvTitle.setText(postsList.get(position).getTitle());
        holder.tvUser.setText(postsList.get(position).getUserId());
        holder.tvBody.setText(postsList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    public void setList(List<PostModel> postsList) {
        this.postsList = postsList;
        notifyDataSetChanged();
    }

public class PostViewHolder extends RecyclerView.ViewHolder {
    TextView tvTitle,tvUser,tvBody;

    public PostViewHolder(@NonNull View itemView) {

        super(itemView);
        tvTitle=itemView.findViewById(R.id.title);
        tvUser=itemView.findViewById(R.id.userId);
        tvBody=itemView.findViewById(R.id.body);

    }
}
}
