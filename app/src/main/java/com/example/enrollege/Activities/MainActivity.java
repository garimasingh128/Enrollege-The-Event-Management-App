package com.example.enrollege.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.example.enrollege.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {
    Spinner DocumentType;
    Spinner DocumentGenre;
    Spinner DocumentCategory;

    FloatingActionButton floatingActionNewPost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_navigation);

        DocumentGenre = findViewById(R.id.choose_genre_spinner);
        DocumentType = findViewById(R.id.choose_type_spinner);
        DocumentCategory = findViewById(R.id.choose_category_spinner);
        floatingActionNewPost = (FloatingActionButton) findViewById(R.id.floatingActionNewPost);

        final DrawerLayout dashboard = (DrawerLayout) findViewById(R.id.dashboardNavigationDrawer);
        ImageView toolbarNavigationOpenner = (ImageView) findViewById(R.id.toolbarNavigationOpenner);


        toolbarNavigationOpenner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dashboard.openDrawer(GravityCompat.START);
            }
        });
        floatingActionNewPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_post_popup);
                dialog.show();



            }
        });
    }


}
