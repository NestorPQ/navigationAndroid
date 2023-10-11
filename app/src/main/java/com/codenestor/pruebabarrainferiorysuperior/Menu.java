package com.codenestor.pruebabarrainferiorysuperior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class Menu extends AppCompatActivity {

   private Button btmainAcitvity;
   Toolbar bttoobar;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_menu);

      loadUI();

      bttoobar.setNavigationOnClickListener(view -> {
         startActivity(new Intent(getApplicationContext(),MainActivity.class));
      });

      btmainAcitvity.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
         }
      });
   }

   private void loadUI() {
      btmainAcitvity = findViewById(R.id.btMainActivity);
      bttoobar = findViewById(R.id.menuToolbar);
   }
}