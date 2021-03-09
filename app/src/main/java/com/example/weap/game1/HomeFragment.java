package com.example.weap.game1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    View view;
    RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private Context context;
    private List<Model> contactList  = new ArrayList<>();
    private String response;
    Button btn;
    @SuppressLint("NewApi")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.homefragment,container,false);
        context = getContext();
        mLayoutManager = new GridLayoutManager(context,1);
        mRecyclerView = (RecyclerView)view.findViewById(R.id.my_recycler_view);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        deploydata();
        return view;
    }

    public void deploydata(){

        for (int b = 0; b<=5;b++){
            Drawable vectorDrawable = VectorDrawableCompat.create(getResources(), R.drawable.ic_tree,  getContext().getTheme());

            Model model = new Model();
            model.setAgacname("Agaç");
            model.setLevel("0");
            model.setImage(vectorDrawable);
    contactList.add(b,model);
}
        MyAdapter rcAdapter = new MyAdapter(contactList,context);
        mRecyclerView.setAdapter(rcAdapter);
    }




}