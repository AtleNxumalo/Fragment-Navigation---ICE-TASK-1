package com.example.fragmentexample

// Import core Android and Fragment libraries
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

/**
 * Fragment that displays a UI section with a button to navigate
 * to another fragment. This is part of a fragment navigation demo.
 */
class YoungJusticeFragment : Fragment() {

    /**
     * Called to inflate the layout for this fragment.
     * @param inflater The LayoutInflater object that can be used to inflate any views.
     * @param container If non-null, this is the parent view that the fragment's UI should be attached to.
     * @param savedInstanceState If non-null, this fragment is being re-constructed from a previous state.
     * @return The View for the fragment's UI.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout XML (fragment_young_justice.xml) and return it as this fragment's view
        return inflater.inflate(R.layout.fragment_young_justice, container, false)
    }

    /**
     * Called immediately after the view is created. Ideal for setting up UI components.
     * @param view The View returned by onCreateView().
     * @param savedInstanceState A Bundle with previously saved state, if any.
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 🦇 Find the navigation button from the layout by its ID
        val btnGoToB = view.findViewById<Button>(R.id.btnGoToB)

        // Set up click listener for the button
        btnGoToB.setOnClickListener {
            /*
             * Begin a fragment transaction to replace the current fragment
             * with FragmentB. This adds the transaction to the back stack,
             * allowing user to press "Back" and return here.
             */
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentB()) // Replace container with new fragment
                .addToBackStack(null) // Add to back stack for back navigation
                .commit() // Commit the transaction
        }
    }
}

