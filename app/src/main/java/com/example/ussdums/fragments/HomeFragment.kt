package com.example.ussdums.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ussdums.R
import com.example.ussdums.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentHomeBinding.inflate(layoutInflater)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.tariflarId.setOnClickListener {

            findNavController().navigate(R.id.firstFragment)

        }
        binding.daqiqalarId.setOnClickListener {

            findNavController().navigate(R.id.firstFragment)

        }
        binding.internetId.setOnClickListener {

            findNavController().navigate(R.id.firstFragment)

        }



    }

}