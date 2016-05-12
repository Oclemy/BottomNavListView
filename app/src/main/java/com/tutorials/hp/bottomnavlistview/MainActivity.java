package com.tutorials.hp.bottomnavlistview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.tutorials.hp.bottomnavlistview.mFragments.CrimeFragment;
import com.tutorials.hp.bottomnavlistview.mFragments.DocumentaryFragment;
import com.tutorials.hp.bottomnavlistview.mFragments.DramaFragment;


public class MainActivity extends AppCompatActivity implements AHBottomNavigation.OnTabSelectedListener{

    AHBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bottomNavigation= (AHBottomNavigation) findViewById(R.id.myBottomNavigation_ID);

        bottomNavigation.setOnTabSelectedListener(this);
        this.createNavItems();

    }

    private void createNavItems()
    {
        //CREATE ITEMS
        AHBottomNavigationItem crimeItem=new AHBottomNavigationItem("Crime",R.drawable.cr);
        AHBottomNavigationItem dramaItem=new AHBottomNavigationItem("Darama",R.drawable.ac);
        AHBottomNavigationItem docsItem=new AHBottomNavigationItem("Crime",R.drawable.dr);

        //ADD ITEMS TO BAR
        bottomNavigation.addItem(crimeItem);
        bottomNavigation.addItem(dramaItem);
        bottomNavigation.addItem(docsItem);

        //PROPERTIES
        bottomNavigation.setDefaultBackgroundColor(Color.parseColor("#FEFEFE"));

        bottomNavigation.setCurrentItem(0);

    }

    @Override
    public void onTabSelected(int position, boolean wasSelected) {
        if(position==0)
        {
            CrimeFragment crimeFragment=new CrimeFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id,crimeFragment).commit();
        }else if(position==1)
        {
            DramaFragment dramaFragment=new DramaFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id,dramaFragment).commit();
        }else if(position==2)
        {
            DocumentaryFragment documentaryFragment=new DocumentaryFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id,documentaryFragment).commit();
        }
    }
}
