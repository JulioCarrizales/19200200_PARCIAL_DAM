package dev.sebastianbolivar.a19200200_parcial_dam.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dev.sebastianbolivar.a19200200_parcial_dam.R
import dev.sebastianbolivar.a19200200_parcial_dam.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_gallery, container, false)

        val tareas = arrayOf(
            "Salir a pasear",
            "Caminar",
            "Hacer las compras",
            "Ir a la universidad",
            "Lavar el auto"
        )

        val listView: ListView = view.findViewById(R.id.lvTareas)

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, tareas)
        listView.adapter = adapter

        return view
    }
}