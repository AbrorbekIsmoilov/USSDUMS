package com.example.ussdums.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.adapters.DaqiqaAdapter
import com.example.ussdums.R
import com.models.USSD_data
import com.example.ussdums.databinding.FragmentDaqiqaBinding

class daqiqa : Fragment() {
    lateinit var rvAdapter: DaqiqaAdapter
    lateinit var data: ArrayList<USSD_data>
   private lateinit var binding : FragmentDaqiqaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentDaqiqaBinding.inflate(layoutInflater)
        loadData()
        return binding.root

    }
    private fun loadData() {

        data = ArrayList()

        data = ArrayList()
        data.add(USSD_data("«60 daqiqalik to‘plam»", "*103*60#", "4 000 so‘m", "616020 raqamiga 60"))
        data.add(USSD_data("«120 daqiqalik to‘plam»", "*103*120#", "7 000 so‘m", "616020 raqamiga 120"))
        data.add(USSD_data("«180 daqiqalik to‘plam»", "*103*180#", "10 000 so‘m", "616020 raqamiga 180"))
        data.add(USSD_data("«300 daqiqalik to‘plam»", "*103*300#", "16 000 so‘m", "616020 raqamiga 300"))
        data.add(USSD_data("«900 daqiqalik to‘plam»", "*103*900#", "37 000 so‘m", "616020 raqamiga 900"))
        data.add(USSD_data("«1200 daqiqalik to‘plam»", "*103*1200#", "45 000 so‘m", "616020 raqamiga 1200"))
        data.add(USSD_data("«1800 daqiqalik to‘plam»", "*103*1800#", "62 000 so‘m", "616020 raqamiga 1800"))

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvAdapter = DaqiqaAdapter(data, object : DaqiqaAdapter.OnItemClickListener {
            override fun onItemClick(data: USSD_data, position: Int) {

                val bundle = Bundle()

                bundle.putSerializable("a", data)

                findNavController().navigate(R.id.secondFragment, bundle)

            }
        })


        binding.rv.adapter = rvAdapter

    }

}