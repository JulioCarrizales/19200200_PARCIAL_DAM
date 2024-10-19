package dev.sebastianbolivar.a19200200_parcial_dam.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.sebastianbolivar.a19200200_parcial_dam.EquiposModel
import dev.sebastianbolivar.a19200200_parcial_dam.R


class EquipoAdapter (private var lstEquipos: List<EquiposModel>) :
    RecyclerView.Adapter<EquipoAdapter.ViewHolder>()
    {

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            val ivlaptop: ImageView = itemView.findViewById(R.id.ivlaptop)
            val tvName: TextView = itemView.findViewById(R.id.tvName)
            val tvmarca: TextView = itemView.findViewById(R.id.tvMarca)
            val tvPrice: TextView = itemView.findViewById(R.id.tvPrice)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return ViewHolder(
                layoutInflater.inflate(
                    R.layout.item_laptop, parent, false
                )
            )
        }

        override fun getItemCount(): Int {
            return lstEquipos.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val itemEquipo = lstEquipos[position]
            holder.ivlaptop.setImageResource(itemEquipo.imagen)
            holder.tvName.text = itemEquipo.nombre
            holder.tvmarca.text = itemEquipo.marca
            holder.tvPrice.text = itemEquipo.costo
        }
    }