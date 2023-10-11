package com.codenestor.pruebabarrainferiorysuperior;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.core.view.GravityCompat;
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

      Menu menu = navigationView.getMenu();


      MenuItem menuItemOpenActivity = menu.findItem(R.id.activity_menu_item);
      MenuItem menuItemOPenActivity2 = menu.findItem(R.id.activity_menu_item_2);
      MenuItem menuItemOPenActivity3 = menu.findItem(R.id.perfilcondiseno);


      menuItemOPenActivity3.setOnMenuItemClickListener(menuItem -> {
         startActivity(new Intent(getApplicationContext(), perfildiseno.class));
         return false;
      });
      menuItemOPenActivity2.setOnMenuItemClickListener(menuItem -> {
         //  Ruta completa para evitar una coalisión de nombres con la clase del proyecto
         Intent intent = new Intent(MainActivity.this, com.codenestor.pruebabarrainferiorysuperior.Menu.class);
         startActivity(intent);

         return false;
      });
      menuItemOpenActivity.setOnMenuItemClickListener(menuItem -> {
         Intent intent = new Intent(MainActivity.this, perfil.class);
         startActivity(intent);

         drawerLayout.closeDrawer(GravityCompat.START);
         return false;
      });

      AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_home, R.id.nav_wifi, R.id.nav_store).setOpenableLayout(drawerLayout).build();
      NavigationUI.setupWithNavController(navigationView, navControllerDrawer);


      // Configura la navegación del BottomNavigationView
      FragmentManager fragmentManager = getSupportFragmentManager();
      NavHostFragment navHostFragment = (NavHostFragment) fragmentManager.findFragmentById(R.id.nav_host_fragment);
      NavController navController = navHostFragment.getNavController();
      BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
      NavigationUI.setupWithNavController(bottomNav, navController);


// Deselecciona cualquier elemento que esté seleccionado
      bottomNav.clearFocus(); // O bottomNav.setSelectedItemId(0); para establecer null como seleccionado
   }





   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }

   @Override
   public boolean onSupportNavigateUp() {
      NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

      return NavigationUI.navigateUp(navController, drawerLayout);
   }
}
