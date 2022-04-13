package com.example.festiwish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.media.MediaPlayer;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       MediaPlayer player = MediaPlayer.create(MainActivity.this,R.raw.music);
        player.start();
        ConstraintLayout mainlayout = findViewById(R.id.mainlayout);
        AnimationDrawable animbg = (AnimationDrawable) mainlayout.getBackground();
        animbg.setEnterFadeDuration(1200);
        animbg.setExitFadeDuration(1200);
        animbg.start();
        animbg.setOneShot(false);

        CardView holi_card = findViewById(R.id.holi_card);
        LinearLayout holi_opt = findViewById(R.id.holi_opt);


        Button b_holi_text = findViewById(R.id.b_holi_text);
        Button b_holi_image = findViewById(R.id.b_holi_image);
        Button b_holi_fun = findViewById(R.id.b_holi_fun);
        holi_opt.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        holi_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holi_opt.getVisibility() == View.VISIBLE)
                {
                    holi_opt.setVisibility(View.GONE);
                    TransitionManager.beginDelayedTransition(holi_card,
                            new AutoTransition());


                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(holi_card,
                            new AutoTransition());
                    holi_opt.setVisibility(View.VISIBLE);

                }

                b_holi_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, InputDetailsActivity.class));
                    }
                });
                b_holi_image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, ImageWishActivity.class);
                        i.putExtra("value",1);
                        startActivity(i);
                    }
                });




            }
        });


        CardView   indep_card = findViewById(R.id.indep_card);
        LinearLayout indep_opt = findViewById(R.id.indep_opt);


        Button b_indep_text = findViewById(R.id.b_indep_text);
        Button b_indep_image = findViewById(R.id.b_indep_image);
        Button b_indep_fun = findViewById(R.id.b_indep_fun);
        indep_opt.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        indep_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(indep_opt.getVisibility() == View.VISIBLE)
                {
                    indep_opt.setVisibility(View.GONE);
                    TransitionManager.beginDelayedTransition(indep_card,
                            new AutoTransition());


                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(indep_card,
                            new AutoTransition());
                    indep_opt.setVisibility(View.VISIBLE);

                }

                b_indep_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, InputDetailsActivity.class));
                    }
                });
                b_indep_image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, ImageWishActivity.class);
                        i.putExtra("value",2);
                        startActivity(i);
                    }
                });




            }
        });CardView Dusshera_card = findViewById(R.id.Dusshera_card);
        LinearLayout Dusshera_opt = findViewById(R.id.Dusshera_opt);


        Button b_Dusshera_text = findViewById(R.id.b_Dusshera_text);
        Button b_Dusshera_image = findViewById(R.id.b_Dusshera_image);
        Button b_Dusshera_fun = findViewById(R.id.b_Dusshera_fun);
        Dusshera_opt.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        Dusshera_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Dusshera_opt.getVisibility() == View.VISIBLE)
                {
                    Dusshera_opt.setVisibility(View.GONE);
                    TransitionManager.beginDelayedTransition(Dusshera_card,
                            new AutoTransition());


                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(Dusshera_card,
                            new AutoTransition());
                    Dusshera_opt.setVisibility(View.VISIBLE);

                }

                b_Dusshera_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, InputDetailsActivity.class));
                    }
                });
                b_Dusshera_image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, ImageWishActivity.class);
                        i.putExtra("value",3);
                        startActivity(i);
                    }
                });




            }
        });CardView Diwali_card = findViewById(R.id.Diwali_card);
        LinearLayout Diwali_opt = findViewById(R.id.Diwali_opt);


        Button b_Diwali_text = findViewById(R.id.b_Diwali_text);
        Button b_Diwali_image = findViewById(R.id.b_Diwali_image);
        Button b_Diwali_fun = findViewById(R.id.b_Diwali_fun);
        Diwali_opt.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        Diwali_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Diwali_opt.getVisibility() == View.VISIBLE)
                {
                    Diwali_opt.setVisibility(View.GONE);
                    TransitionManager.beginDelayedTransition(Diwali_card,
                            new AutoTransition());


                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(Diwali_card,
                            new AutoTransition());
                    Diwali_opt.setVisibility(View.VISIBLE);

                }

                b_Diwali_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, InputDetailsActivity.class));
                    }
                });
                b_Diwali_image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, ImageWishActivity.class);
                        i.putExtra("value",4);
                        startActivity(i);
                    }
                });




            }
        });


        CardView Christmas_card = findViewById(R.id.Christmas_card);
        LinearLayout Christmas_opt = findViewById(R.id.Christmas_opt);


        Button b_Christmas_text = findViewById(R.id.b_Christmas_text);
        Button b_Christmas_image = findViewById(R.id.b_Christmas_image);
        Button b_Christmas_fun = findViewById(R.id.b_Christmas_fun);
        Christmas_opt.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        Christmas_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Christmas_opt.getVisibility() == View.VISIBLE)
                {
                    Christmas_opt.setVisibility(View.GONE);
                    TransitionManager.beginDelayedTransition(Christmas_card,
                            new AutoTransition());


                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(Christmas_card,
                            new AutoTransition());
                    Christmas_opt.setVisibility(View.VISIBLE);

                }

                b_Christmas_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, InputDetailsActivity.class));
                    }
                });
                b_Christmas_image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent i = new Intent(MainActivity.this, ImageWishActivity.class);
                        i.putExtra("value",5);
                        startActivity(i);
                    }
                });





            }
        });


    }
}