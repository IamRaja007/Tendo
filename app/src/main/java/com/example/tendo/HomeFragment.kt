package com.example.tendo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.example.tendo.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=
            DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)

        return binding.root
    }

    private fun flipperImages(image:Int){
        val imageView= ImageView(requireContext())
        imageView.setBackgroundResource(image)

        binding.viewFlipper.addView(imageView)
        binding.viewFlipper.flipInterval=4000  //4sec
        binding.viewFlipper.isAutoStart=true

        //some animations

        binding.viewFlipper.setInAnimation(requireContext(),android.R.anim.slide_in_left)
        binding.viewFlipper.setOutAnimation(requireContext(),android.R.anim.slide_out_right)


    }

    override fun onResume() {
        super.onResume()
        val imagesArray= arrayOf(R.drawable.ic_slideshow1,R.drawable.ic_slideshow2,R.drawable.ic_slideshow3)

        for(image in imagesArray){    // we have put this in OnResume because it is also called during onCreate
            flipperImages(image)
        }
    }
}