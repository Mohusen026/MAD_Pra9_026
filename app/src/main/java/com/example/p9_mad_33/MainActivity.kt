package com.example.p9_mad_33

import android.content.res.ColorStateList
import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        var img:ImageView=findViewById(R.id.imageView);
        var img_heart:ImageView=findViewById(R.id.img_heart);
        var set_alarm:MaterialButton=findViewById(R.id.set_alarm)
        var cancle_alarm:MaterialButton=findViewById(R.id.cancle_alarm)
        set_alarm.setOnClickListener(){
            set_alarm.setBackgroundColor(resources.getColor(R.color.blue))
            set_alarm.setTextColor(resources.getColor(R.color.white));
            cancle_alarm.setBackgroundColor(resources.getColor(R.color.white));
            cancle_alarm.setTextColor(resources.getColor(R.color.blue));
        }
        cancle_alarm.setOnClickListener(){
            set_alarm.setBackgroundColor(resources.getColor(R.color.white));
            set_alarm.setTextColor(resources.getColor(R.color.blue));
            cancle_alarm.setBackgroundColor(resources.getColor(R.color.blue));
            cancle_alarm.setTextColor(resources.getColor(R.color.white));
        }
      img.setBackgroundResource(R.drawable.main_activity_animation_list);
        var frame:AnimationDrawable=img.background as AnimationDrawable
        img_heart.setBackgroundResource(R.drawable.heart);
        var heart_animation:AnimationDrawable=img_heart.background as AnimationDrawable
        frame.start()
        heart_animation.start()
    }
}