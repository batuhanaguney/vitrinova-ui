package com.onurkarabulut.vitrinova.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onurkarabulut.vitrinova.Model.Collections.Collections
import com.onurkarabulut.vitrinova.R
import com.squareup.picasso.Picasso
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
        Picasso.get()
            .load(collectionList.get(position).cover.url)
            .fit()
            .into(holder.itemView.collectionsImg)
        holder.itemView.collectionsTitle.setText(collectionList.get(position).title)
        holder.itemView.collectionsSubTitle.setText(collectionList.get(position).definition)
    }


    override fun getItemCount(): Int {
        return collectionList.size
    }
}