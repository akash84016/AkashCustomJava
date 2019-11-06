package com.akash.myutils;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import java.io.File;
import java.io.IOException;


public class AkashCustom {

    public static final int CAMERA_ACTION_PICK_REQUEST_CODE = 1003;
    public static String currentPhotoPath = "";

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

    public static void openCamera(AppCompatActivity appCompatActivity) {
        Intent pictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        File file;
        try {
            file = getImageFile(); // 1
        } catch (Exception e) {
            e.printStackTrace();

            return;
        }
        Uri uri;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) // 2
            uri = FileProvider.getUriForFile(appCompatActivity, BuildConfig.APPLICATION_ID.concat(".provider"), file);
        else
            uri = Uri.fromFile(file); // 3
        pictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, uri); // 4
        appCompatActivity.startActivityForResult(pictureIntent, CAMERA_ACTION_PICK_REQUEST_CODE);
    }

    private static File getImageFile() throws IOException {
        String imageFileName = "JPEG_" + System.currentTimeMillis() + "_";
        File storageDir = new File(Environment.getExternalStoragePublicDirectory
                (Environment.DIRECTORY_DCIM), "Camera");
        System.out.println(storageDir.getAbsolutePath());
        if (storageDir.exists())
            System.out.println("File exists");
        else
            System.out.println("File not exists");
        File file = File.createTempFile(
                imageFileName, ".jpg", storageDir
        );
        currentPhotoPath = "file:" + file.getAbsolutePath();
        return file;
    }

}

