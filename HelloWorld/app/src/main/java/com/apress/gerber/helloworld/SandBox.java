package com.apress.gerber.helloworld;


import android.graphics.drawable.shapes.RectShape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kangkang on 2016/3/24.
 */
public class SandBox extends RectShape {


    private List<String> mkang = new ArrayList<String>();

    public List<String> getMkang() {
        return mkang;
    }

    public void add(int location, String object) {
        mkang.add(location, object);
    }

    public boolean add(String object) {
        System.out.print("wo");
        return mkang.add(object);
    }

    @Override
    public String toString() {
        return "SandBox{" +
                "mkang=" + mkang +


                '}';
    }

    @Override
    public boolean hasAlpha() {
        return true;
    }

    public void setMkang(List<String> mkang) {
        this.mkang = mkang;
    }
}
