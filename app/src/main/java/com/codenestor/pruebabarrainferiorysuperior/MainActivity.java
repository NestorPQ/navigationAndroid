package com.codenestor.pruebabarrainferiorysuperior;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
//import android.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import androidx.appcompat.widget.Toolbar;

import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      // Configura la Toolbar
      Toolbar toolbar = findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);

//      getSupportActionBar().hide();
//      getSupportActionBar().setDisplayHomeAsUpEnabled(false);
//      getSupportActionBar().setDisplayShowHomeEnabled(false);
//      getSupportActionBar().setDisplayShowTitleEnabled(false);

//
      FragmentManager fragmentManager = getSupportFragmentManager();
      NavHostFragment navHostFragment = (NavHostFragment) fragmentManager.findFragmentById(R.id.nav_host_fragment);
      NavController navController = navHostFragment.getNavController();
//
//      // Configura la navegación del BottomNavigationView
      BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
//
//
      NavigationUI.setupWithNavController(bottomNav, navController);
//      NavigationUI.setupActionBarWithNavController(this, navController);


   }
}
