package hoge.hogehoge.navigationcomponentsample.trantisionwitharg

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import hoge.hogehoge.navigationcomponentsample.databinding.FragmentArg2Binding

class Fragment2 : Fragment() {

    val args: Fragment2Args by navArgs()

    private lateinit var binding: FragmentArg2Binding

    //region lifecycle

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentArg2Binding.inflate(inflater)

        val amount = args.args
        binding.textView.text = amount.toString()


        return binding.root
    }

    //endregion
}