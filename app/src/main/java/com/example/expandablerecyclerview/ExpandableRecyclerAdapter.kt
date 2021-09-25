package com.example.expandablerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExpandableRecyclerAdapter (val modelList: List<Model>):
    RecyclerView.Adapter<ExpandableRecyclerAdapter.AdapterVH>()
{
    class AdapterVH(itemView: View): RecyclerView.ViewHolder(itemView) {
        var nameTxt : TextView = itemView.findViewById(R.id.txt_name)
        var dateTxt : TextView = itemView.findViewById(R.id.txt_date)
        var apiTxt : TextView = itemView.findViewById(R.id.txt_api)
        var descriptionTxt : TextView = itemView.findViewById(R.id.description)
        var linearLayout : LinearLayout = itemView.findViewById(R.id.linearLayout)
        var expendableLayout : RelativeLayout = itemView.findViewById(R.id.expandable_layout)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterVH {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_expandable,parent,false)
        return AdapterVH(view)
    }

    override fun onBindViewHolder(holder: AdapterVH, position: Int) {
        val model :Model = modelList[position]
        holder.nameTxt.text = model.namehello
        holder.dateTxt.text = model.date
        holder.apiTxt.text = model.apilevel
        holder.descriptionTxt.text = model.description

        val isExpandable: Boolean = modelList[position].expandable
        holder.expendableLayout.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.linearLayout.setOnClickListener{
            val version = modelList[position]
            version.expandable = !model.expandable
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return modelList.size
    }
}