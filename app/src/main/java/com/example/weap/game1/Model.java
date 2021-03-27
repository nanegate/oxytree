package com.example.weap.game1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Model {



    public int agaclevel;
    public String agacname;
    public double agacarpani;
    public double agacfiyat;
    public Drawable image;
    public int agacsayisi;
    
    public String getAgacname() {
        return agacname;
    }

    public void setAgacname(String agacname) {
        this.agacname = agacname;
    }
    //
    public int getAgaclevel() {
        return agaclevel;
    }

    public void setAgaclevel(int agaclevel) {
        this.agaclevel = agaclevel;
    }

    //

    public double getAgacarpani() {
        return agacarpani;
    }

    public void setAgacarpani(double agacarpani) {
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
    public double getAgacfiyat() {
        return agacfiyat;
    }

    public void setAgacfiyat(double agacfiyat) {
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
