package com.one24apps.navigationdraw;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {

    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Toolbar toolbar = findViewById(R.id.toolbar);
//       setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.draw_layout);

        NavigationView navigationView = findViewById(R.id.nav_music);
//        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.nav_draw_open, R.string.nav_draw_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        actionBarDrawerToggle.syncState();
        /*
        * */

//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,  new Music()).commit();
//            navigationView.setCheckedItem(R.id.nav_music);
//        }
    }

    @Override
    public boolean onNavigationItemSelected (@NonNull MenuItem item) {
        Toast.makeText(this, item.getItemId(), Toast.LENGTH_LONG);
//        switch (item.getItemId()) {
//            case R.id.nav_br:
////                getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,  new Menu1()).commit();
//                Toast.makeText(this, "Helow Nagate Menu", Toast.LENGTH_SHORT);
//                break;
//            case R.id.nav_music:
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,  new Music()).commit();
//                break;
//            case R.id.nav_music_item:
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,  new Music()).commit();
//                break;
//            case R.id.nav_menu_item:
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,  new Menu1()).commit();
//                break;
//        }
//        drawerLayout.closeDrawer(GravityCompat.START);
//        return true;
        return false;
    }

    @Override
    public void onBackPressed () {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    /*
    * */
}
