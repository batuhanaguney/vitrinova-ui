package com.onurkarabulut.vitrinova.Adapter

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.animation.AnimationUtils
import com.onurkarabulut.vitrinova.Model.NewProducts.NewProducts
import com.onurkarabulut.vitrinova.Model.Products
import com.onurkarabulut.vitrinova.R
import com.onurkarabulut.vitrinova.Util.createPlaceHolder
import com.onurkarabulut.vitrinova.Util.loadImage
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_discover.view.*
import kotlinx.android.synthetic.main.new_products_item.view.*

class NewProductsRecyclerAdapter(val productList : List<NewProducts>) : RecyclerView.Adapter<NewProductsRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.new_products_item,parent,false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Picasso.get()
            .load(productList.get(position).images!!.first().medium!!.url)
            .fit()
            .into( holder.itemView.newProductsImg)
        val title = productList.get(position).title
        if (productList.get(position).title!!.length > 20){
            val newTitle = productList.get(position).title!!.take(20) + "..."
            holder.itemView.newProductsTitle.text = newTitle
        }else{
            holder.itemView.newProductsTitle.text = productList.get(position).title
        }
        holder.itemView.newProductsSubTitle.text = productList.get(position).shop!!.name
        val price = productList.get(position).price!!.toString() + " TL"
        holder.itemView.newProductsNewPrice.text =  price

        if (productList.get(position).old_price == null){
            holder.itemView.newProductsOldPrice.text = ""
        }else{
            val oldPrice = productList.get(position).old_price!!.toString() + " TL"
            holder.itemView.newProductsOldPrice.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
            holder.itemView.newProductsOldPrice.text = oldPrice
        }
    }


    override fun getItemCount(): Int {
        return productList.size
    }
}