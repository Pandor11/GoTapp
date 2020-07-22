package com.example.gotapp.data.local.remote.res;


import java.util.List;

import com.example.gotapp.extensions.StringExtensions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import static com.example.gotapp.extensions.StringExtensions.lastSegment;

public class CharacterRes {
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("gender")
    @Expose
    public String gender;
    @SerializedName("culture")
    @Expose
    public String culture;
    @SerializedName("born")
    @Expose
    public String born;
    @SerializedName("died")
    @Expose
    public String died;
    @SerializedName("titles")
    @Expose
    public List<String> titles = null;
    @SerializedName("aliases")
    @Expose
    public List<String> aliases = null;
    @SerializedName("father")
    @Expose
    public String father;
    @SerializedName("mother")
    @Expose
    public String mother;
    @SerializedName("spouse")
    @Expose
    public String spouse;
    @SerializedName("allegiances")
    @Expose
    public List<String> allegiances = null;
    @SerializedName("books")
    @Expose
    public List<String> books = null;
    @SerializedName("povBooks")
    @Expose
    public List<Object> povBooks = null;
    @SerializedName("tvSeries")
    @Expose
    public List<String> tvSeries = null;
    @SerializedName("playedBy")
    @Expose
    public List<String> playedBy = null;



    public String getCharacterId() {
        return lastSegment(url);
    }

    public String getMotherId() {
        return lastSegment(mother);
    }

    public String getFatherId() {
        return lastSegment(father);
    }
}
