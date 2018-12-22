package com.example.saads.googlesignin;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    private DrawerLayout ndrawerLayout;
    private ActionBarDrawerToggle nToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        this.setTitle("AtoZ Shopping Mall");

        ndrawerLayout=(DrawerLayout)findViewById(R.id.drawerLayout);
        nToggle=new ActionBarDrawerToggle(this,ndrawerLayout,R.string.open,R.string.close);

        ndrawerLayout.addDrawerListener(nToggle);
        nToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(nToggle.onOptionsItemSelected(item))
        {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
