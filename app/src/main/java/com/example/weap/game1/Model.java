package com.example.weap.game1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Model {

    public int level;
    public String agacname;
    public float agacarpani;
    public int agacfiyat;
    public Drawable image;
    public int agacsayisi;
    
    public String getAgacname() {
        return agacname;
    }

    public void setAgacname(String agacname) {
        this.agacname = agacname;
    }
    //

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    //

    public float getAgacarpani() {
        return agacarpani;
    }

    public void setAgacarpani(float agacarpani) {
        this.agacarpani = agacarpani;
    }

    //
    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    //
    public int getAgacfiyat() {
        return agacfiyat;
    }

    public void setAgacfiyat(int agacfiyat) {
        this.agacfiyat = agacfiyat;
    }
    //

    public int getAgacsayisi() {
        return agacsayisi;
    }

    public void setAgacsayisi(int agacsayisi) {
        this.agacsayisi = agacsayisi;
    }

}
