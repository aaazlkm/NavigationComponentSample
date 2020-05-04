package hoge.hogehoge.navigationcomponentsample.transitionanimation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.transition.TransitionInflater
import hoge.hogehoge.navigationcomponentsample.databinding.FragmentAnimation2Binding

class FragmentAnimation2 : Fragment() {

    private lateinit var binding: FragmentAnimation2Binding

    //region lifecycle

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentAnimation2Binding.inflate(inflater)
        sharedElementEnterTransition =
            TransitionInflater.from(context).inflateTransition(android.R.transition.move)

        startPostponedEnterTransition()
        return binding.root
    }

    //endregion
}