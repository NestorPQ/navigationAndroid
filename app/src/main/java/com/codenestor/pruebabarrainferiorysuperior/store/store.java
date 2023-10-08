package com.codenestor.pruebabarrainferiorysuperior.store;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codenestor.pruebabarrainferiorysuperior.R;

public class store extends Fragment {

   private StoreViewModel mViewModel;

   public static store newInstance() {
      return new store();
   }

   @Override
   public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                            @Nullable Bundle savedInstanceState) {
      return inflater.inflate(R.layout.fragment_store, container, false);
   }

   @Override
   public void onActivityCreated(@Nullable Bundle savedInstanceState) {
      super.onActivityCreated(savedInstanceState);
      mViewModel = new ViewModelProvider(this).get(StoreViewModel.class);
      // TODO: Use the ViewModel
   }

}