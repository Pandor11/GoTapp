package com.example.gotapp.extensions;

public class StringExtensions {
    public static String lastSegment(String uri){
        String[] dividedString = uri.split("/");
        return dividedString[dividedString.length - 1];
    }
}
