package com.challenge.nytimes;

import com.challenge.nytimes.data.MyClient;
import com.challenge.nytimes.model.ArticleModel;

import org.junit.Test;

import java.io.IOException;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Response;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void canListArticles() {
        //here we will test out call to get data from API
        MyClient myClient = MyClient.getINSTANCE();
        Call<ArticleModel> call = myClient.getArticles();
        try {
            Response<ArticleModel> response = call.execute();
            ArticleModel myResponse = response.body();
            assertTrue(
                    response.isSuccessful() &&
                            Objects.requireNonNull(myResponse)
                                    .getStatus()
                                    .equals("OK")
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}