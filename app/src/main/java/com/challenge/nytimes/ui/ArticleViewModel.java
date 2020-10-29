package com.challenge.nytimes.ui;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.challenge.nytimes.data.MyClient;
import com.challenge.nytimes.model.ArticleModel;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArticleViewModel extends ViewModel {
    public  MutableLiveData<ArticleModel> mutableLiveData = new MutableLiveData<>();

    public void getArticle() {
        MyClient.getINSTANCE().getArticles().enqueue(new Callback<ArticleModel>() {
            @Override
            public void onResponse(@NonNull Call<ArticleModel> call, @NonNull Response<ArticleModel> response) {
                if (response.body() != null) {
                    Log.d("GettingData", " "+response.body().getResults().get(0).getPublishedDate());
                    mutableLiveData.setValue(response.body());
                } else {
                    Log.d("GettingData", response.message());
                }
            }

            @Override
            public void onFailure(Call<ArticleModel> call, Throwable t) {
                Log.d("GettingData", Objects.requireNonNull(t.getMessage()));
            }
        });
    }
}
