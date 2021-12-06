package com.engdacomp.angieworkout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.engdacomp.angieworkout.databinding.FragmentExerciciosBinding

class ExerciciosFragment : Fragment() {

    private var _binding: FragmentExerciciosBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExerciciosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }
}