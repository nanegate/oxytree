package com.example.weap.game1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class JsonStuff   {
    public static float oxygen = 0;
    public static int level = 0;
    public static int gems = 0;
    public static JSONObject alljson;
    public static void main(String[] args){

        System.out.println("Hello World");



    }
    public JSONObject getirjson() {


        return JsonStuff.alljson;
    }
    public void DeployJson(String AllJson) {

        try {
            JSONObject object = new JSONObject(AllJson);
            JsonStuff.alljson = object;
            JSONObject oxygen = object.getJSONObject("oxygen");
            String agac = oxygen.getString("agac-name");
            Log.d("TAGDC", agac.toString());

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    public  void jsonSave(SharedPreferences savejson) {


    }
}
