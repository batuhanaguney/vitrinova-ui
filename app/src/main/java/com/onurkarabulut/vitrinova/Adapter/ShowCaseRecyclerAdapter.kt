package com.onurkarabulut.vitrinova.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onurkarabulut.vitrinova.Model.EditorShop.Shop
import com.onurkarabulut.vitrinova.Model.NewShop.NShop
import com.onurkarabulut.vitrinova.Model.ShowCase
import com.onurkarabulut.vitrinova.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.categories_item.view.*
import kotlinx.android.synthetic.main.showcase_item.view.*

class ShowCaseRecyclerAdapter(val showCaseList : List<Shop>):RecyclerView.Adapter<ShowCaseRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.showcase_item,parent,false)
        return ViewHolder(view)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (showCaseList.get(position).cover == null){
            holder.itemView.showCaseImg.setImageResource(R.drawable.logo)
        }else{
            Picasso.get()
                .load(showCaseList.get(position).cover!!.url)
                .fit()
                .into(holder.itemView.showCaseImg)
        }
       if (showCaseList.get(position).logo == null){
           holder.itemView.showCaseShopImg.visibility = View.GONE
           holder.itemView.showCaseShopButton.visibility = View.VISIBLE
           holder.itemView.showCaseShopButton.setText(showCaseList.get(position).name.take(1))
       }else{
           Picasso.get()
               .load(showCaseList.get(position).logo!!.url)
               .fit()
               .into(holder.itemView.showCaseShopImg)
       }
        holder.itemView.showCaseTitleTxt.setText(showCaseList.get(position).name)
        holder.itemView.showCaseExpTxt.setText(showCaseList.get(position).definition)
        holder.itemView.showCaseItemCountTxt.setText("${showCaseList.get(position).product_count} ÜRÜN")

    }


    override fun getItemCount(): Int {
        return showCaseList.size
    }
}