package com.akash.myutils;

import android.graphics.Color;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomBottom {

    public static void changeTextColor(String activeColor, String deActiveColor, TextView tvActive, TextView tvDeactivie1, TextView tvDeactivie2, TextView tvDeactivie3, TextView tvDeactivie4, TextView tvDeactivie5, TextView tvDeactivie6) {
        if (tvActive != null) {
            tvActive.setTextColor(Color.parseColor(activeColor));
        }
        if (tvDeactivie1 != null) {
            tvDeactivie1.setTextColor(Color.parseColor(deActiveColor));
        }
        if (tvDeactivie2 != null) {
            tvDeactivie2.setTextColor(Color.parseColor(deActiveColor));
        }
        if (tvDeactivie3 != null) {
            tvDeactivie3.setTextColor(Color.parseColor(deActiveColor));
        }
        if (tvDeactivie4 != null) {
            tvDeactivie4.setTextColor(Color.parseColor(deActiveColor));
        }
        if (tvDeactivie5 != null) {
            tvDeactivie5.setTextColor(Color.parseColor(deActiveColor));
        }
        if (tvDeactivie6 != null) {
            tvDeactivie6.setTextColor(Color.parseColor(deActiveColor));
        }
    }

    public static void changeImageColor(String activeColor, String deActiveColor, ImageView imgActive, ImageView imgDeactivie1, ImageView imgDeactivie2, ImageView imgDeactivie3, ImageView imgDeactivie4, ImageView imgDeactivie5, ImageView imgDeactivie6) {
        if (imgActive != null) {
            imgActive.setColorFilter(Color.parseColor(activeColor));
        }
        if (imgDeactivie1 != null) {
            imgDeactivie1.setColorFilter(Color.parseColor(deActiveColor));
        }
        if (imgDeactivie2 != null) {
            imgDeactivie2.setColorFilter(Color.parseColor(deActiveColor));
        }
        if (imgDeactivie3 != null) {
            imgDeactivie3.setColorFilter(Color.parseColor(deActiveColor));
        }
        if (imgDeactivie4 != null) {
            imgDeactivie4.setColorFilter(Color.parseColor(deActiveColor));
        }
        if (imgDeactivie5 != null) {
            imgDeactivie5.setColorFilter(Color.parseColor(deActiveColor));
        }
        if (imgDeactivie6 != null) {
            imgDeactivie6.setColorFilter(Color.parseColor(deActiveColor));
        }
    }

}

