package com.example.festiwish;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.core.content.FileProvider;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;



public class ImageWishActivity extends AppCompatActivity {

    String sendername;
    public void shareimg (int pathX, String msg){

        Bitmap b = BitmapFactory.decodeResource(getResources(), pathX);
        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("image/jpeg");
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        b.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(getContentResolver(), b, "Title", null);
        Uri imageUri = Uri.parse(path);
        share.putExtra(Intent.EXTRA_STREAM, imageUri);
        share.putExtra(Intent.EXTRA_TEXT, msg);
        startActivity(Intent.createChooser(share, "Select"));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_wish);
        int c = getIntent().getExtras().getInt("value");
        CardView d1 = findViewById(R.id.diwali1);
        CardView d2 = findViewById(R.id.diwali2);
        CardView d3 = findViewById(R.id.diwali3);

        ImageView dI1 = findViewById(R.id.diwali1_img);
        ImageView dI2 = findViewById(R.id.diwali2img);
        ImageView dI3 = findViewById(R.id.diwali3img);

        CardView h1 = findViewById(R.id.holi1);
        CardView h2 = findViewById(R.id.holi2);
        CardView h3 = findViewById(R.id.holi3);

        ImageView hI1 = findViewById(R.id.holi1img);
        ImageView hI2 = findViewById(R.id.holi2img);
        ImageView hI3 = findViewById(R.id.holi3img);

        CardView i1 = findViewById(R.id.indep1);
        CardView i2 = findViewById(R.id.indep2);
        CardView i3 = findViewById(R.id.indep3);

        ImageView iI1 = findViewById(R.id.indep1img);
        ImageView iI2 = findViewById(R.id.indep2img);
        ImageView iI3 = findViewById(R.id.indep3img);

        CardView dus1 = findViewById(R.id.dus1);
        CardView dus2 = findViewById(R.id.dus2);
        CardView dus3 = findViewById(R.id.dus3);

        ImageView dusI1 = findViewById(R.id.dus1img);
        ImageView dusI2 = findViewById(R.id.dus2img);
        ImageView dusI3 = findViewById(R.id.dus3img);

        CardView c1 = findViewById(R.id.Christmas1);
        CardView c2 = findViewById(R.id.Christmas2);
        CardView c3 = findViewById(R.id.Christmas3);

        ImageView cI1 = findViewById(R.id.Christmas1img);
        ImageView cI2 = findViewById(R.id.Christmas2img);
        ImageView cI3 = findViewById(R.id.Christmas3img);

        AppCompatButton b1 = findViewById(R.id.button);
        EditText et = findViewById(R.id.editTextTextPersonName);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendername = et.getText().toString();
            }
        });





                switch (c) {
                    case 1:
                        h1.setVisibility(View.VISIBLE);
                        h2.setVisibility(View.VISIBLE);
                        h3.setVisibility(View.VISIBLE);

                        hI1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                shareimg(R.drawable.holiimg1, "Happy Holi !!\nFrom : " + sendername);
                            }
                        });
                        hI2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                shareimg(R.drawable.holiimg2, "Happy Holi !!\nFrom : " + sendername);
                            }
                        });
                        hI3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                shareimg(R.drawable.holiimg3, "Happy Holi !!\nFrom : " + sendername);
                            }
                        });
                        break;


                    case 2:
                        i1.setVisibility(View.VISIBLE);
                        i2.setVisibility(View.VISIBLE);
                        i3.setVisibility(View.VISIBLE);

                        iI1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                shareimg(R.drawable.indep1, "Happy Independence Day !!\nFrom : " + sendername);
                            }
                        });
                        iI2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                shareimg(R.drawable.indep2, "Happy Independence Day!!\nFrom : " + sendername);
                            }
                        });
                        iI3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                shareimg(R.drawable.indep3, "Happy Independence Day!!\nFrom : " + sendername);
                            }
                        });
                        break;

                    case 3:
                        dus1.setVisibility(View.VISIBLE);
                        dus2.setVisibility(View.VISIBLE);
                        dus3.setVisibility(View.VISIBLE);

                        dusI1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                shareimg(R.drawable.dusimg1, "Happy Dusshera !!\nFrom : " + sendername);
                            }
                        });
                        dusI2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                shareimg(R.drawable.dusimg2, "Happy Dusshera!!\nFrom : " + sendername);
                            }
                        });
                        dusI3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                shareimg(R.drawable.dusimg3, "Happy Dusshera!!\nFrom : " + sendername);
                            }
                        });
                        break;


                    case 4:
                        d1.setVisibility(View.VISIBLE);
                        d2.setVisibility(View.VISIBLE);
                        d3.setVisibility(View.VISIBLE);

                        dI1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                shareimg(R.drawable.diwali1, "Happy Diwali !!\nFrom : " + sendername);
                            }
                        });
                        dI2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                shareimg(R.drawable.diwali2, "Happy Diwali!!\nFrom : " + sendername);
                            }
                        });
                        dI3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                shareimg(R.drawable.diwali3, "Happy Diwali!!\nFrom : " + sendername);
                            }
                        });
                        break;

                    case 5:
                        c1.setVisibility(View.VISIBLE);
                        c2.setVisibility(View.VISIBLE);
                        c3.setVisibility(View.VISIBLE);

                        cI1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                shareimg(R.drawable.christmasimg1, "Happy Christmas !!\nFrom : " + sendername);
                            }
                        });
                        cI2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                shareimg(R.drawable.christmasimg2, "Happy Christmas!!\nFrom : " + sendername);
                            }
                        });
                        cI3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                shareimg(R.drawable.christmasimg3, "Happy Christmas!!\nFrom : " + sendername);
                            }
                        });

                }


       }
    }










