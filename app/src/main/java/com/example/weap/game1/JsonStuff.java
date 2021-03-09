package com.example.weap.game1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class JsonStuff   {
    public static double oxygen = 0;
    public static int level = 0;
    public static int gems = 0;
    public static void main(String[] args){

        System.out.println("Hello World");



    }
    public void DeployJson(String AllJson) {

        try {
            JSONObject object = new JSONObject(AllJson);

            JSONObject oxygen = object.getJSONObject("agac-1");
            String agac = oxygen.getString("agac-name");
            Log.d("TAGDC", agac.toString());

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    public  void jsonSave(SharedPreferences savejson) {


    }
}
