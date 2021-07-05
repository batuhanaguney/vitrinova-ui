package com.onurkarabulut.vitrinova.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onurkarabulut.vitrinova.Model.EditorShop.Shop
import com.onurkarabulut.vitrinova.Model.EditorsShop
import com.onurkarabulut.vitrinova.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.collection_item.view.*
import kotlinx.android.synthetic.main.editor_item.view.*

class EditorShopRecyclerAdapter (var editorShopList : List<Shop>) : RecyclerView.Adapter<EditorShopRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.editor_item,parent,false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Picasso.get()
            .load(editorShopList.get(position).logo!!.url)
            .fit()
            .into(holder.itemView.editorImgProfile)
        Picasso.get()
            .load(editorShopList.get(position).popular_products.get(0)!!.images!!.get(0)!!.url)
            .fit()
            .into(holder.itemView.editorShopImg1)
        Picasso.get()
            .load(editorShopList.get(position).popular_products.get(1)!!.images!!.get(0).url)
            .fit()
            .into(holder.itemView.editorShopImg2)
        Picasso.get()
            .load(editorShopList.get(position).popular_products.get(2)!!.images!!.get(0).url)
            .fit()
            .into(holder.itemView.editorShopImg3)
        val def = editorShopList.get(position).definition
        if (def.length > 50){
            holder.itemView.editorShopDesc.setText(def.take(60) + "...")
        }else{
            holder.itemView.editorShopDesc.setText(def)
        }
        holder.itemView.editorShopTitle.setText(editorShopList.get(position).name)
    }


    override fun getItemCount(): Int {
        return editorShopList.size
    }
}