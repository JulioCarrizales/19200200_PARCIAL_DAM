package dev.sebastianbolivar.a19200200_parcial_dam.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.sebastianbolivar.a19200200_parcial_dam.EquiposModel
import dev.sebastianbolivar.a19200200_parcial_dam.R
import dev.sebastianbolivar.a19200200_parcial_dam.databinding.FragmentSlideshowBinding
import dev.sebastianbolivar.a19200200_parcial_dam.ui.adapter.EquipoAdapter

class SlideshowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_slideshow, container, false)

        val rvEquipos: RecyclerView = view.findViewById(R.id.rvEquipos)
        rvEquipos.layoutManager = LinearLayoutManager(requireContext())
        rvEquipos.adapter = EquipoAdapter(getEquipos())
        return view

    }

    private fun getEquipos(): List<EquiposModel>{
        val lstEquipos: ArrayList<EquiposModel> = ArrayList()
        lstEquipos.add(
            EquiposModel(1, R.drawable.asus, "asus", "M415"
                , "$4999")
        )
        lstEquipos.add(
            EquiposModel(2, R.drawable.hp, "HP", "FDL0008LA"
                , "$3999")
        )
        lstEquipos.add(
            EquiposModel(3, R.drawable.lenovo, "LENOVO", "IdePad 0x1"
                , "$2999")
        )

        return lstEquipos
    }
}