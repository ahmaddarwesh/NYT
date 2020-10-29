package com.challenge.nytimes.ui.mainClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.challenge.nytimes.R;
import com.challenge.nytimes.model.ArticleModel;
import com.challenge.nytimes.ui.ArticleViewModel;

public class MainActivity extends AppCompatActivity {


    ArticleViewModel articleViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //The ViewModel class
        articleViewModel = ViewModelProvider
                .AndroidViewModelFactory
                .getInstance(getApplication())
                .create(ArticleViewModel.class);
        articleViewModel.getArticle();

        //RecyclerView Configuration
        RecyclerView recyclerView = findViewById(R.id.myRecy);
        ArticleAdapter articleAdapter = new ArticleAdapter();
        articleAdapter.setContext(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(articleAdapter);

        //Fill data in ui (mutable Live Data) using adapter
        articleViewModel.mutableLiveData.observe(this, new Observer<ArticleModel>() {
            @Override
            public void onChanged(ArticleModel articleModel) {
                articleAdapter.setArticleList(articleModel.getResults());
            }
        });
    }
}