package com.onurkarabulut.vitrinova.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onurkarabulut.vitrinova.Model.Categories
import com.onurkarabulut.vitrinova.Model.Collections
import com.onurkarabulut.vitrinova.R
import kotlinx.android.synthetic.main.categories_item.view.*
import kotlinx.android.synthetic.main.collection_item.view.*

class CollectionsRecyclerAdapter(var collectionList : List<Collections>) : RecyclerView.Adapter<CollectionsRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.collection_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.collectionsImg.setImageResource(collectionList.get(position).imgUrl)
        holder.itemView.collectionsTitle.setText(collectionList.get(position).title)
        holder.itemView.collectionsSubTitle.setText(collectionList.get(position).subTitle)
    }

    override fun getItemCount(): Int {
        return collectionList.size
    }
}