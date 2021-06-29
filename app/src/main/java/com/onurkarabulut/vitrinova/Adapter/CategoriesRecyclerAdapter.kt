package com.onurkarabulut.vitrinova.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onurkarabulut.vitrinova.Model.Categories
import com.onurkarabulut.vitrinova.R
import kotlinx.android.synthetic.main.categories_item.view.*

class CategoriesRecyclerAdapter(var categoriList : List<Categories>) : RecyclerView.Adapter<CategoriesRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.categories_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.categoriesImg.setImageResource(categoriList.get(position).imgUrl)
        holder.itemView.categoriesTitle.setText(categoriList.get(position).title)
    }

    override fun getItemCount(): Int {
        return categoriList.size
    }
}