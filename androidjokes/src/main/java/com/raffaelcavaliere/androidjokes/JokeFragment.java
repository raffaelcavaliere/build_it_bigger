package com.raffaelcavaliere.androidjokes;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class JokeFragment extends Fragment {


    public JokeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle extras = getActivity().getIntent().getExtras();
        String joke = "";

        if (extras != null) {
            joke = extras.getString("joke");
        }

        View rootView = inflater.inflate(R.layout.fragment_joke, container, false);
        TextView textView = (TextView)rootView.findViewById(R.id.txtJoke);
        textView.setText(joke);
        return rootView;
    }


}
