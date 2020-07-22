package com.example.gotapp.viewmodels;

import androidx.lifecycle.ViewModel;

import com.example.gotapp.repositories.CharacterRepository;

public class CharacterViewModel extends ViewModel {
    private Object charRepository = new CharacterRepository();
}
