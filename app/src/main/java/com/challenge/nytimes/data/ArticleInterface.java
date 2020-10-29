package com.challenge.nytimes.data;

import com.challenge.nytimes.model.ArticleModel;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


public interface ArticleInterface {
    @GET("mostviewed/all-sections/7.json?api-key=JF3w7xXLcG427imEAKRuWspH3OQ6BM0c")
    Call<ArticleModel> getArticle ();
}
