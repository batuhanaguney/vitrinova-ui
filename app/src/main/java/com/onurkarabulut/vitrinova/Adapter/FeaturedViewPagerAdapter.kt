package com.onurkarabulut.vitrinova.Adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.onurkarabulut.vitrinova.Model.Featured
import com.onurkarabulut.vitrinova.R
import com.squareup.picasso.Picasso

class FeaturedViewPagerAdapter(var data : ArrayList<Featured>, var context: Context) : PagerAdapter() {
    lateinit var layoutInflater : LayoutInflater
    override fun getCount(): Int {
        return data.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view.equals(`object`)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = LayoutInflater.from(context)
        var view : View = layoutInflater.inflate(R.layout.featured_item,container,false)
        val image = view.findViewById<ImageView>(R.id.featuredImageView) as ImageView
        val title = view.findViewById<TextView>(R.id.feauredTitle) as TextView
        val explain = view.findViewById<TextView>(R.id.featuredExplain) as TextView
        title.setText(data.get(position).title)
        explain.setText(data.get(position).explain)
        image.setImageResource(data.get(position).imageUrl)
        container.addView(view,0)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}