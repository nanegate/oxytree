package com.example.weap.game1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Model {

    public int level;
    public String agacname;
    public float agacarpani;
    public int agac_fiyat;
    public Drawable image;
    public int agacsayisi;
    
    public String getAgacname() {
        return agacname;
    }

    public void setAgacname(String agacname) {
        this.agacname = agacname;
    }


    public int getAgacsayisi() {
        return agacsayisi;
    }

    public void setAgacsayisi(int agacsayisi) {
        this.agacsayisi = agacsayisi;
    }




    public float getAgacarpani() {
        return agacarpani;
    }

    public void setAgacarpani(float agacarpani) {
        this.agacarpani = agacarpani;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }



    public int getAgac_fiyat() {
        return agac_fiyat;
    }

    public void setAgac_fiyat(int agac_fiyat) {
        this.agac_fiyat = agac_fiyat;
    }


    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }



}
