package com.example.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.models.USSD_data
import com.example.ussdums.databinding.ItemUssdBinding

class RvAdapter(var umslist:ArrayList<USSD_data>, var onItemClickListener: OnItemClickListener):
    RecyclerView.Adapter<RvAdapter.Vh>(){
    inner class Vh(var binding: ItemUssdBinding): RecyclerView.ViewHolder(binding.root){

        fun onBind(data: USSD_data, position: Int){

            binding.titleId.text = data.titleData
            binding.shortId.text = data.shortData
            binding.codeId.text = data.code

            binding.root.setOnClickListener {

                onItemClickListener.onItemClick(data,position)

            }

        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemUssdBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(umslist[position],position)
    }

    override fun getItemCount(): Int {
        return umslist.size
    }

    interface OnItemClickListener{

        fun onItemClick(data: USSD_data, position: Int)

    }
}