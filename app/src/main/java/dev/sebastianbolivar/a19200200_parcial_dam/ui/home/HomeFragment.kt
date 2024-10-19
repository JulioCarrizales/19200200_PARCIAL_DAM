package dev.sebastianbolivar.a19200200_parcial_dam.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.isDigitsOnly
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dev.sebastianbolivar.a19200200_parcial_dam.R
import dev.sebastianbolivar.a19200200_parcial_dam.databinding.FragmentHomeBinding




class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)


        val btnCalcular: Button = view.findViewById(R.id.btnCalcular)
        val etIngreso: EditText = view.findViewById(R.id.etIngreso)
        val etGastoFijo: EditText = view.findViewById(R.id.etGastoFijo)
        val etGastoVariable: EditText = view.findViewById(R.id.etGastoVariable)
        val txtResult: TextView = view.findViewById(R.id.txtResult)

        btnCalcular.setOnClickListener {

            val ctIngreso = etIngreso.text.toString().toDouble()
            val ctGastoFijo = etGastoFijo.text.toString().toDouble()
            val ctGastoVariable = etGastoVariable.text.toString().toDouble()

            val resultado = ctIngreso - (ctGastoFijo + ctGastoVariable)
            txtResult.text = "$resultado USD"

        }
        return view

    }
}




