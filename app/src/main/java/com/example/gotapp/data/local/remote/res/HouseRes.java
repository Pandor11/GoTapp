package com.example.gotapp.data.local.remote.res;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import static com.example.gotapp.extensions.StringExtensions.lastSegment;

public class HouseRes {
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("region")
    @Expose
    public String region;
    @SerializedName("coatOfArms")
    @Expose
    public String coatOfArms;
    @SerializedName("words")
    @Expose
    public String words;
    @SerializedName("titles")
    @Expose
    public List<String> titles = null;
    @SerializedName("seats")
    @Expose
    public List<String> seats = null;
    @SerializedName("currentLord")
    @Expose
    public String currentLord;
    @SerializedName("heir")
    @Expose
    public String heir;
    @SerializedName("overlord")
    @Expose
    public String overlord;
    @SerializedName("founded")
    @Expose
    public String founded;
    @SerializedName("founder")
    @Expose
    public String founder;
    @SerializedName("diedOut")
    @Expose
    public String diedOut;
    @SerializedName("ancestralWeapons")
    @Expose
    public List<String> ancestralWeapons = null;
    @SerializedName("cadetBranches")
    @Expose
    public List<String> cadetBranches = null;
    @SerializedName("swornMembers")
    @Expose
    public List<String> swornMembers = null;

    public String getHouseId(){
        return lastSegment(url);
    }
    public List<String> getMembersId(){
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < swornMembers.size(); i++) {
           result.add(lastSegment(swornMembers.get(i)));
        }
        return result;
    }
}

