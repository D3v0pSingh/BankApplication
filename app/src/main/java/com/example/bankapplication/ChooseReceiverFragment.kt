package com.example.bankapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_choose_receiver.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.sendbtn

class ChooseReceiverFragment : Fragment(R.layout.fragment_choose_receiver) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sendbtn.setOnClickListener {

            //SENDING DATA USING BUNDLES :-

//            val receiverName = receivername.text.toString()
//
//            val args = Bundle()
//            args.putString("name",receiverName)
//
//            findNavController().navigate(R.id.sendCashFragment,args)

            val receiverName = receivername.text.toString()

            val action = ChooseReceiverFragmentDirections.actionChooseReceiverFragmentToSendCashFragment()
            findNavController().navigate(action)
        }


    }


}