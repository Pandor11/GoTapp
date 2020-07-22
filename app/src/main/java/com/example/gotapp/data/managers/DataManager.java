package com.example.gotapp.data.managers;

import android.app.Application;
import android.app.Service;
import android.content.Context;

import com.example.gotapp.data.local.remote.res.NetworkService;
import com.example.gotapp.data.local.remote.res.ResService;

public class DataManager {
    private static DataManager INSTANCE = null;

    private Context context;
    private ResService resService;

    public DataManager(){
        this.resService = NetworkService.createNetworkService(ResService.class);
    }
}
