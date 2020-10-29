package com.challenge.nytimes.ui.ArticleDetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.challenge.nytimes.R;

import java.util.Objects;

public class ArticleDetails extends AppCompatActivity {

    String id;
    TextView title, byline, artAbstract, section, subSection, type, date, url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_details);

        //get data from extras and set in article details page
        id = Objects.requireNonNull(getIntent().getExtras()).getString("id");
        byline = findViewById(R.id.d_byline);
        section = findViewById(R.id.section);
        subSection = findViewById(R.id.subsection);
        type = findViewById(R.id.type);
        date = findViewById(R.id.date);
        url = findViewById(R.id.url);
        artAbstract = findViewById(R.id.ArtAbstract);
        title = findViewById(R.id.d_title);

        byline.setText(Objects.requireNonNull(getIntent().getExtras()).getString("byline"));
        section.setText(Objects.requireNonNull(getIntent().getExtras()).getString("section"));
        subSection.setText(Objects.requireNonNull(getIntent().getExtras()).getString("subsection"));
        type.setText(Objects.requireNonNull(getIntent().getExtras()).getString("type"));
        date.setText(Objects.requireNonNull(getIntent().getExtras()).getString("date"));
        url.setText(Objects.requireNonNull(getIntent().getExtras()).getString("url"));
        artAbstract.setText(Objects.requireNonNull(getIntent().getExtras()).getString("abstract"));
        title.setText(Objects.requireNonNull(getIntent().getExtras()).getString("title"));

        //On click article url open browser
        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url.getText().toString()));
                startActivity(intent);
            }
        });

    }
}