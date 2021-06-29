package com.onurkarabulut.vitrinova.Adapter

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.animation.AnimationUtils
import com.onurkarabulut.vitrinova.Model.Products
import com.onurkarabulut.vitrinova.R
import com.onurkarabulut.vitrinova.Util.createPlaceHolder
import com.onurkarabulut.vitrinova.Util.loadImage
import kotlinx.android.synthetic.main.fragment_discover.view.*
import kotlinx.android.synthetic.main.new_products_item.view.*

class NewProductsRecyclerAdapter(val productList : List<Products>) : RecyclerView.Adapter<NewProductsRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.new_products_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemView.newProductsImg.setImageResource(productList.get(position).imageUrl)
        holder.itemView.newProductsTitle.setText(productList.get(position).title)
        holder.itemView.newProductsSubTitle.setText(productList.get(position).subTitle)
        holder.itemView.newProductsNewPrice.setText(productList.get(position).newPrice)
        if (productList.get(position) == null){
            holder.itemView.newProductsOldPrice.setText("")
        }else{
            holder.itemView.newProductsOldPrice.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
            holder.itemView.newProductsOldPrice.setText(productList.get(position).oldPrice)
        }

    }

    override fun getItemCount(): Int {
        return productList.size
    }

}