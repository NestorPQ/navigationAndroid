package com.codenestor.pruebabarrainferiorysuperior.home;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codenestor.pruebabarrainferiorysuperior.R;

public class home extends Fragment {

   private HomeViewModel mViewModel;

   public static home newInstance() {
      return new home();
   }

   @Override
   public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                            @Nullable Bundle savedInstanceState) {
      return inflater.inflate(R.layout.fragment_home, container, false);
   }

   @Override
   public void onActivityCreated(@Nullable Bundle savedInstanceState) {
      super.onActivityCreated(savedInstanceState);
      mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
      // TODO: Use the ViewModel
   }

}