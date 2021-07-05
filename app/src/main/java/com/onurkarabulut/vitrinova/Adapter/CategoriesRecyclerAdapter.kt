package com.onurkarabulut.vitrinova.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onurkarabulut.vitrinova.Model.Categories.Categories
import com.onurkarabulut.vitrinova.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.categories_item.view.*
import kotlinx.android.synthetic.main.new_products_item.view.*

class CategoriesRecyclerAdapter(var categoriList : List<Categories>) : RecyclerView.Adapter<CategoriesRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.categories_item,parent,false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        Picasso.get()
            .load(categoriList.get(position).logo.url)
            .fit()
            .into(holder.itemView.categoriesImg)
        holder.itemView.categoriesTitle.setText(categoriList.get(position).name)
    }


    override fun getItemCount(): Int {
        return categoriList.size
    }
}