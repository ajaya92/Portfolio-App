package com.example.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView resumeFile, linkedIn, gitHub;
    TextView locationMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resumeFile = findViewById(R.id.resumeView);
        linkedIn = findViewById(R.id.linkedIn);
        gitHub = findViewById(R.id.gitHub);
        locationMap=findViewById(R.id.locationMap);

        resumeFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriResume = Uri.parse("https://drive.google.com/open?id=1F6dRX3ikqPZGDcbPiKzHerzrMJ6KM4-S");
                Intent r = new Intent(Intent.ACTION_VIEW, uriResume);
                startActivity(r);
            }
        });
        linkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriLinked = Uri.parse("https://www.linkedin.com/in/ajaya-s-a48143181/");
                Intent l = new Intent(Intent.ACTION_VIEW, uriLinked);
                startActivity(l);
            }
        });
        gitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriGit = Uri.parse("https://github.com/ajaya92");
                Intent g = new Intent(Intent.ACTION_VIEW, uriGit);
                startActivity(g);
            }
        });
        locationMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriLocation = Uri.parse("geo:0,0?q=3945 Lancaster Lane N, Plymouth, Minnesota");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uriLocation);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }
}
