package com.example.p9_mad_33

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val img:ImageView=findViewById(R.id.imageView);
        val ad=AnimationDrawable();
        val f1=resources.getDrawable(R.drawable.alarm1,null);
        val f2=resources.getDrawable(R.drawable.alarm2,null);
        val f3=resources.getDrawable(R.drawable.alarm3,null);
        val f4=resources.getDrawable(R.drawable.alarm4,null);
        val f5=resources.getDrawable(R.drawable.alarm5,null);
        val f6=resources.getDrawable(R.drawable.alarm6,null);
        val f7=resources.getDrawable(R.drawable.alarm7,null);
        val f8=resources.getDrawable(R.drawable.alarm8,null);
        val f9=resources.getDrawable(R.drawable.alarm9,null);
        val f10=resources.getDrawable(R.drawable.alarm10,null);
        ad.addFrame(f1,500);
        ad.addFrame(f2,500);
        ad.addFrame(f3,500);
        ad.addFrame(f4,500);
        ad.addFrame(f5,500);
        ad.addFrame(f6,500);
        ad.addFrame(f7,500);
        ad.addFrame(f8,500);
        ad.addFrame(f9,500);
        ad.addFrame(f10,500);
        img.background=ad
    val btn:Button=findViewById(R.id.btn)
        btn.setOnClickListener(){
            ad.stop()
        }
        val btn1:Button=findViewById(R.id.btn1)
        btn1.setOnClickListener(){
            ad.start()
        }

    }
}