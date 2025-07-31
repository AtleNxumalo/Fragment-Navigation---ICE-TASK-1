package com.example.fragmentexample

// Required imports for fragment lifecycle methods
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Simple fragment that represents a second screen in the navigation flow.
 */
class FragmentB : Fragment() {

    /**
     * Inflates the layout for FragmentB when it's displayed.
     * @param inflater Used to inflate the layout XML.
     * @param container Optional parent view.
     * @param savedInstanceState State bundle if fragment is reloaded.
     * @return Inflated View for FragmentB.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate and return fragment_b.xml layout
        return inflater.inflate(R.layout.fragment_b, container, false)
    }
}
