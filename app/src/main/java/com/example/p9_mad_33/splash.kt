package com.example.p9_mad_33

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val img2: ImageView =findViewById(R.id.imageView3);
        val move=AnimationUtils.loadAnimation(this,R.anim.rotation);
      //  val scale_center_in=AnimationUtils.loadAnimation(this,R.anim.scale_center_in);
        //val scale_center_out=AnimationUtils.loadAnimation(this,R.anim.scale_center_out);
        img2.setBackgroundResource(R.drawable.animation_list);
        var frame_by_frame:AnimationDrawable=img2.background as AnimationDrawable
        frame_by_frame.start();
        img2.startAnimation(move)
       // img2.startAnimation(scale_center_in)
       // img2.startAnimation(scale_center_out)
        Handler().postDelayed(
            {
                val i = Intent(this, MainActivity::class.java)
                startActivity(i)
                finish()
            }, 3000)
    }
}