package com.example.ussdums.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ussdums.databinding.FragmentDaBinding

class daFragment : Fragment() {
 private lateinit var binding:FragmentDaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentDaBinding.inflate(layoutInflater)
        return binding.root
    }


}