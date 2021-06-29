package com.onurkarabulut.vitrinova.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onurkarabulut.vitrinova.Model.Categories
import com.onurkarabulut.vitrinova.Model.EditorsShop
import com.onurkarabulut.vitrinova.R
import kotlinx.android.synthetic.main.categories_item.view.*
import kotlinx.android.synthetic.main.editor_item.view.*

class EditorShopRecyclerAdapter (var editorShopList : List<EditorsShop>) : RecyclerView.Adapter<EditorShopRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.editor_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.editorImgProfile.setImageResource(editorShopList.get(position).profileImg)
        holder.itemView.editorShopTitle.setText(editorShopList.get(position).title)
        holder.itemView.editorShopDesc.setText(editorShopList.get(position).subTitle)
        holder.itemView.editorShopImg1.setImageResource(editorShopList.get(position).img1)
        holder.itemView.editorShopImg2.setImageResource(editorShopList.get(position).img2)
        holder.itemView.editorShopImg3.setImageResource(editorShopList.get(position).img3)
    }

    override fun getItemCount(): Int {
        return editorShopList.size
    }
}