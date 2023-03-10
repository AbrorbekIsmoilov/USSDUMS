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
import com.example.ussdums.databinding.FragmentInternetBinding

class Internet : Fragment() {
    private lateinit var binding : FragmentInternetBinding
    lateinit var rvAdapter: RvAdapter
    lateinit var data: ArrayList<USSD_data>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInternetBinding.inflate(layoutInflater)
        return binding.root
        loadData()
    }
    private fun loadData() {

        data = ArrayList()

        data = ArrayList()
        data.add(USSD_data("«50 000 MB (5G)»", "*225*50000#", "75 000 so‘m", "50000 MB"))
        data.add(USSD_data("«50 000 MB »", "*102*50000#", "75 000 so‘m", "50000 MB"))
        data.add(USSD_data("«30 000 MB »", "*102*30000#", "65 000 so‘m", "30000 MB"))
        data.add(USSD_data("«20 000 MB »", "*102*20000#", "55 000 so‘m", "20000 MB"))
        data.add(USSD_data("«10 000 MB »", "*102*10000#", "50 000 so‘m", "10000 MB"))
        data.add(USSD_data("«5 000 MB »", "*102*5000#", "33 000 so‘m", "5000 MB"))
        data.add(USSD_data("«3 000 MB »", "*102*3000#", "25 000 so‘m", "3000 MB"))
        data.add(USSD_data("«2 000 MB »", "*102*2000#", "17 000 so‘m", "2000 MB"))
        data.add(USSD_data("«1 000 MB »", "*102*1000#", "11 000 so‘m", "1000 MB"))
        data.add(USSD_data("« 500 MB »", "*102*500#", "9 000 so‘m", "500 MB"))
        data.add(USSD_data("« 300 MB »", "*102*300#", "8 000 so‘m", "300 MB"))

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