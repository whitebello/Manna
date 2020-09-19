package com.andriod.manna;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {


    //Variables
    Animation topAnim, bottomAnim;
    ImageView top_img, bottom_img;
    Button btn_start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.intro_layout); //xml , java 소스 연결

        //Animations
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animaition);

        top_img = findViewById(R.id.top_img);
        bottom_img = findViewById(R.id.bottom_img);
        btn_start = findViewById(R.id.btn_start);

        top_img.setAnimation(topAnim);
        bottom_img.setAnimation(bottomAnim);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable(){
//            @Override
//            public void run() {
//                Intent intent = new Intent (getApplicationContext(), LoginActivity.class);
//                startActivity(intent); //다음화면으로 넘어감
//                finish();
//            }
//        },5000); //5초 뒤에 Runner객체 실행하도록 함
    }

//    @Override
//    protected void onPause(){
//        super.onPause();
//        finish();
//    }
}