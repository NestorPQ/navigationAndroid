package com.codenestor.pruebabarrainferiorysuperior.profile;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codenestor.pruebabarrainferiorysuperior.R;

public class profile extends Fragment {

   private ProfileViewModel mViewModel;

   public static profile newInstance() {
      return new profile();
   }

   @Override
   public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                            @Nullable Bundle savedInstanceState) {
      return inflater.inflate(R.layout.fragment_profile, container, false);
   }

   @Override
   public void onActivityCreated(@Nullable Bundle savedInstanceState) {
      super.onActivityCreated(savedInstanceState);
      mViewModel = new ViewModelProvider(this).get(ProfileViewModel.class);
      // TODO: Use the ViewModel
   }

}