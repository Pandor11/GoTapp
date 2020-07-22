package com.example.gotapp.ui.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharacterListAdapter extends RecyclerView.Adapter<CharacterListAdapter.CharacterViewHolder>{


    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class CharacterViewHolder extends RecyclerView.ViewHolder {
        public CharacterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
