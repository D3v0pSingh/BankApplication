package com.example.bankapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()

        balbtn.setOnClickListener {
       //  Step 1 to navigate without giving lines in navGraph :-
        //  navController.navigate(R.id.balanceFragment)

       //  Step 2 to navigate after giving lines in navGraph :-
        //  navController.navigate(R.id.action_homeFragment_to_balanceFragment)

        //Step 3 and recommended one using direction class which helps to pass data:-
            val action = HomeFragmentDirections.actionHomeFragmentToBalanceFragment()
            navController.navigate(action)

        }

        sendbtn.setOnClickListener {
           //Step 1:-
            // navController.navigate(R.id.chooseReceiverFragment)
           //Step 2:=
        // navController.navigate(R.id.action_homeFragment_to_chooseReceiverFragment)
            //Step 3:-
            val action = HomeFragmentDirections.actionHomeFragmentToChooseReceiverFragment()
            navController.navigate(action)
        }

        transbtn.setOnClickListener {
           //Step 1:-
            // navController.navigate(R.id.transactionFragment)

            //Step 2:-
        // navController.navigate(R.id.action_homeFragment_to_transactionFragment)

            //Step 3:-
            val action = HomeFragmentDirections.actionHomeFragmentToTransactionFragment()
            navController.navigate(action)
        }

    }


}