package com.tocaboca.tocalifeworlda.dxssdf
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import android.content.Context
import com.tocaboca.tocalifeworlda.R


class Jisoskosijxzc : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.gtokkodsxc, container, false)
    }
    private lateinit var ckcokvkocjicvij: Context
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        findNavController().navigate(R.id.mbkkivcjuhchuds)

    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        ckcokvkocjicvij=context
    }



}