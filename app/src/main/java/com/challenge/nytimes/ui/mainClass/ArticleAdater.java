package com.challenge.nytimes.ui.mainClass;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.challenge.nytimes.R;
import com.challenge.nytimes.model.ResultsItem;
import com.challenge.nytimes.ui.ArticleDetails.ArticleDetails;

import java.util.ArrayList;
import java.util.List;


//RecyclerView Adapter
class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.MyViewHolder> {
    private List<ResultsItem> ArticleList = new ArrayList<>();
    private Context context;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.article_card, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(ArticleList.get(position).getTitle());
        holder.byline.setText(ArticleList.get(position).getByline());
        holder.published_date.setText(ArticleList.get(position).getPublishedDate());
        holder.name.setText(ArticleList.get(position).getSection());
        holder.id.setText(ArticleList.get(position).getId());
        holder.itemClickable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, ArticleDetails.class);
                i.putExtra("id",ArticleList.get(position).getId());
                i.putExtra("title",ArticleList.get(position).getTitle());
                i.putExtra("byline",ArticleList.get(position).getByline());
                i.putExtra("abstract",ArticleList.get(position).getabstractText());//
                i.putExtra("section",ArticleList.get(position).getSection());
                i.putExtra("subsection",ArticleList.get(position).getSubsection());
                i.putExtra("type",ArticleList.get(position).getType());
                i.putExtra("date",ArticleList.get(position).getPublishedDate());
                i.putExtra("url",ArticleList.get(position).getUrl());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ArticleList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title, byline, published_date, name, id;
        ConstraintLayout itemClickable;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.artId);
            title = itemView.findViewById(R.id.title);
            byline = itemView.findViewById(R.id.byline);
            published_date = itemView.findViewById(R.id.published_date);
            name = itemView.findViewById(R.id.name);
            itemClickable = itemView.findViewById(R.id.itemArticle);
        }
    }

    public void setArticleList(List<ResultsItem> list) {
        this.ArticleList = list;
        notifyDataSetChanged();
    }

    public void setContext(Context context) {
        this.context = context;

    }

}
