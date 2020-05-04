package hoge.hogehoge.navigationcomponentsample.trantisionwitharg

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import hoge.hogehoge.navigationcomponentsample.databinding.FragmentArg1Binding

class Fragment1 : Fragment() {

    private lateinit var binding: FragmentArg1Binding

    //region lifecycle

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentArg1Binding.inflate(inflater)

        binding.button.setOnClickListener {
            val action =
                Fragment1Directions.actionFragment1ToFragment2(
                    3
                )
            findNavController().navigate(action)
        }

        return binding.root
    }

    //endregion
}