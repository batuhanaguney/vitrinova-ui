package com.onurkarabulut.vitrinova.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onurkarabulut.vitrinova.Model.ShowCase
import com.onurkarabulut.vitrinova.R
import kotlinx.android.synthetic.main.showcase_item.view.*

class ShowCaseRecyclerAdapter(val showCaseList : List<ShowCase>):RecyclerView.Adapter<ShowCaseRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.showcase_item,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (showCaseList.get(position).imageUrl == null){
            holder.itemView.showCaseImg.setImageResource(R.drawable.logo)
        }else{
            holder.itemView.showCaseImg.setImageResource(showCaseList.get(position).imageUrl!!)
        }
       if (showCaseList.get(position).shopImgUrl == null){
           holder.itemView.showCaseShopImg.setImageResource(R.drawable.shoplogo)
       }else{
           holder.itemView.showCaseShopImg.setImageResource(showCaseList.get(position).shopImgUrl!!)
       }
        holder.itemView.showCaseTitleTxt.setText(showCaseList.get(position).title)
        holder.itemView.showCaseExpTxt.setText(showCaseList.get(position).explain)
        holder.itemView.showCaseItemCountTxt.setText("${showCaseList.get(position).count} ÜRÜN")

    }

    override fun getItemCount(): Int {
        return showCaseList.size
    }
}