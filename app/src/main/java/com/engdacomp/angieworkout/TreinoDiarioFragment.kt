package com.engdacomp.angieworkout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.engdacomp.angieworkout.databinding.FragmentTreinoDiarioBinding

class TreinoDiarioFragment : Fragment() {
    private var _binding: FragmentTreinoDiarioBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTreinoDiarioBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }
}