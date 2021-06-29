package com.onurkarabulut.vitrinova.Animation

import android.view.View
import androidx.viewpager.widget.ViewPager

class ViewPagerAnimation : ViewPager.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        if (position < -1){
            page.alpha = 0f
        }
        else if (position <= 0){
            page.alpha = 1f
            page.translationX = 1f
            page.scaleX = 1f
            page.scaleY = 1f
        }
        else if (position <= 1){
            page.translationX = -position*1000
        }
        else{
            page.alpha = 0f
        }
    }
}