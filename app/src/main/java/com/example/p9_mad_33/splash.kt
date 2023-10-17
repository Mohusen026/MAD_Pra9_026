package com.example.p9_mad_33

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val img2: ImageView =findViewById(R.id.imageView3);
        val ad= AnimationDrawable();
        val f1=resources.getDrawable(R.drawable.uvpce_logo_1,null);
        val f2=resources.getDrawable(R.drawable.uvpce_logo_2,null);
        val f3=resources.getDrawable(R.drawable.uvpce_logo_3,null);
        val f4=resources.getDrawable(R.drawable.uvpce_logo_4,null);
        val f5=resources.getDrawable(R.drawable.uvpce_logo_5,null);
        val f6=resources.getDrawable(R.drawable.uvpce_logo_6,null);
        val f7=resources.getDrawable(R.drawable.uvpce_logo_7,null);
        val f8=resources.getDrawable(R.drawable.uvpce_logo,null);
        ad.addFrame(f1,500);
        ad.addFrame(f2,500);
        ad.addFrame(f3,500);
        ad.addFrame(f4,500);
        ad.addFrame(f5,500);
        ad.addFrame(f6,500);
        ad.addFrame(f7,500);
        ad.addFrame(f8,500);
        img2.background=ad
        ad.start()
        Handler().postDelayed(
            {

                val i = Intent(this, MainActivity::class.java)
                startActivity(i)
                finish()
            }, 4000)
    }
}