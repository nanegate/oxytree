package com.example.weap.game1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Model {
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

    public int agacsayisi;

    public String agacname;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int level;

    public int getAgac_fiyat() {
        return agac_fiyat;
    }

    public void setAgac_fiyat(int agac_fiyat) {
        this.agac_fiyat = agac_fiyat;
    }

    public int agac_fiyat;

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public Drawable image;


}
