package com.codenestor.pruebabarrainferiorysuperior;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import androidx.appcompat.widget.Toolbar;
//import androidx.legacy.app.ActionBarDrawerToggle;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

   private DrawerLayout drawerLayout;
   private ActionBarDrawerToggle actionBarDrawerToggle;


   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      // Configura la Toolbar
      Toolbar toolbar = findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);

      // Configura el Navigation Drawer
      drawerLayout = findViewById(R.id.drawer_layout);
      actionBarDrawerToggle = new ActionBarDrawerToggle(
          this,
          drawerLayout,
          toolbar,
          R.string.navigation_drawer_open,
          R.string.navigation_drawer_close
      );
      drawerLayout.addDrawerListener(actionBarDrawerToggle);
      actionBarDrawerToggle.syncState();

      // Configura la navegación del NavigationView (para el Navigation Drawer)
      NavigationView navigationView = findViewById(R.id.navigation_view);
      NavController navControllerDrawer = Navigation.findNavController(this, R.id.nav_host_fragment); // Cambio de nombre aquí
      AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(navControllerDrawer.getGraph())
          .setDrawerLayout(drawerLayout)
          .build();

//      NavigationUI.setupActionBarWithNavController(this, navControllerDrawer, appBarConfiguration);
      NavigationUI.setupWithNavController(navigationView, navControllerDrawer);


      // Configura la navegación del BottomNavigationView
      FragmentManager fragmentManager = getSupportFragmentManager();
      NavHostFragment navHostFragment = (NavHostFragment) fragmentManager.findFragmentById(R.id.nav_host_fragment);
      NavController navController = navHostFragment.getNavController();
      BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
      NavigationUI.setupWithNavController(bottomNav, navController);
//     NavigationUI.setupActionBarWithNavController(this, navController);


   }

   @Override
   public boolean onSupportNavigateUp() {
      NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

      return NavigationUI.navigateUp(navController, drawerLayout);
   }
}
