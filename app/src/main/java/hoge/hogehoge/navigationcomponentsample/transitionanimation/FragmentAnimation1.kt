package hoge.hogehoge.navigationcomponentsample.transitionanimation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import hoge.hogehoge.navigationcomponentsample.databinding.FragmentAnimation1Binding

/**
 * 注意
 * 遷移元のViewと遷移先のViewに同じtransitionnameを指定すること
 */
class FragmentAnimation1 : Fragment() {

    private lateinit var binding: FragmentAnimation1Binding

    //region lifecycle

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentAnimation1Binding.inflate(inflater)

        binding.button2
            .setOnClickListener {
                val action = FragmentAnimation1Directions.actionFragmentAnimation1ToFragmentAnimation2()
                val extras = FragmentNavigatorExtras(
                    binding.imageView to "imageView"
                )

                findNavController().navigate(action, extras)
            }

        return binding.root
    }

    //endregion
}