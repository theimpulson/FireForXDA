package dev.theimpulson.fireforxda.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import dev.theimpulson.fireforxda.R
import dev.theimpulson.fireforxda.databinding.FragmentHomeBinding

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val TAG = HomeFragment::class.java.simpleName
    private val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)

        viewModel.testFunction()
        viewModel.testResult.observe(viewLifecycleOwner, {
            Log.d(TAG, it.toString())
        })
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}