package com.codenestor.pruebabarrainferiorysuperior.wifi;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codenestor.pruebabarrainferiorysuperior.R;

public class wifi extends Fragment {

   private WifiViewModel mViewModel;

   public static wifi newInstance() {
      return new wifi();
   }

   @Override
   public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                            @Nullable Bundle savedInstanceState) {
      return inflater.inflate(R.layout.fragment_wifi, container, false);
   }

   @Override
   public void onActivityCreated(@Nullable Bundle savedInstanceState) {
      super.onActivityCreated(savedInstanceState);
      mViewModel = new ViewModelProvider(this).get(WifiViewModel.class);
      // TODO: Use the ViewModel
   }

}