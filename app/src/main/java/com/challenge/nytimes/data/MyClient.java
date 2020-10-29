package com.challenge.nytimes.data;

import com.challenge.nytimes.model.ArticleModel;
import com.challenge.nytimes.model.ResultsItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyClient {
    private static final String myUrl = "https://api.nytimes.com/svc/mostpopular/v2/";
    private static final String myApiKey = "JF3w7xXLcG427imEAKRuWspH3OQ6BM0c";
    private ArticleInterface articleInterface;
    private static MyClient INSTANCE;

    public MyClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(myUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        articleInterface = retrofit.create(ArticleInterface.class);
    }

    public static MyClient getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new MyClient();
        }
        return INSTANCE;
    }


    public Call<ArticleModel> getArticles() {
        return articleInterface.getArticle();
    }


}
