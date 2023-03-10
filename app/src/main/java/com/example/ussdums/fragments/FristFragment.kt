package com.example.ussdums.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.adapters.RvAdapter
import com.example.ussdums.R
import com.models.USSD_data
import com.example.ussdums.databinding.FragmentFristBinding

class FristFragment : Fragment() {
    private lateinit var binding:FragmentFristBinding
    lateinit var rvAdapter: RvAdapter
    lateinit var data: ArrayList<USSD_data>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFristBinding.inflate(layoutInflater)
        loadData()
        return binding.root
    }
    private fun loadData() {

        data = ArrayList()

        data = ArrayList()
        data.add(USSD_data("Mobi 20", "*111*120#", "20.000 so'm", "Mobi 20"))
        data.add(USSD_data("Mobi 25", "*111*102#", "25.000 so'm", "Mobi 25"))
        data.add(USSD_data("Mobi 30+", "*111*128#", "30.000 so'm", "Mobi 30+"))
        data.add(USSD_data("Mobi 40", "*111*122#", "40.000 so'm", "Mobi 40"))
        data.add(USSD_data("Mobi 50", "*111*129#", "50.000 so'm", "Mobi 50"))
        data.add(USSD_data("Mobi 70", "*111*131#", "70.000 so'm", "Mobi 70"))
        data.add(USSD_data("Mobi 90", "*111*132#", "90.000 so'm", "Mobi 90"))
        data.add(USSD_data("Mobi 110", "*111*133#", "110.000 so'm", "Mobi 110"))
        data.add(USSD_data("Mobi 150", "*111*134#", "150.000 so'm", "Mobi 150"))
        data.add(USSD_data("Terminal", "*111*112#", "12.000 so'm", "Terminal"))
        data.add(USSD_data("Chilla lite", "*111*042#", "20.000 so'm", "Chilla lite"))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvAdapter = RvAdapter(data, object : RvAdapter.OnItemClickListener {
            override fun onItemClick(data: USSD_data, position: Int) {

                val bundle = Bundle()

                bundle.putSerializable("a", data)

                findNavController().navigate(R.id.secondFragment, bundle)

            }
        })


        binding.rv.adapter = rvAdapter

    }
}