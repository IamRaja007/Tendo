package com.example.tendo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.tendo.databinding.FragmentAccountActivationBinding

class AccountActivationFragment : Fragment() {

    lateinit var binding:FragmentAccountActivationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_account_activation, container, false)
        return binding.root
    }

}