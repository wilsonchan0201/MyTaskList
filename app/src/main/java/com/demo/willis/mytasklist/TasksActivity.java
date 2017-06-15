package com.demo.willis.mytasklist;


import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

public class TasksActivity extends AppCompatActivity {

    DrawerLayout mDrawer;
    NavigationView mNavView;
    FloatingActionButton mFloatingButton;
    Toolbar mToobar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks_list);
        mDrawer = (DrawerLayout)findViewById(R.id.layout_drawer);
        mNavView = (NavigationView)findViewById(R.id.nav_view);
        mFloatingButton = (FloatingActionButton)findViewById(R.id.fab_add_task);
        mToobar = (Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(mToobar);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        mNavView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Log.i("todo.demo", "menu " + menuItem.getTitle() + " clicked.");
                return true;
            }
        });

    }
}
