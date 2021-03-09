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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAgacsayisi() {
        return agacsayisi;
    }

    public void setAgacsayisi(String agacsayisi) {
        this.agacsayisi = agacsayisi;
    }

    public String agacsayisi;

    public String agacname;
    public String level;



    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public Drawable image;


}
