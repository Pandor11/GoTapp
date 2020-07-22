package com.example.gotapp.ui.fragments;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gotapp.R;

public class CharListFragment extends Fragment {

    public static PageFragment newInstance(int page) {
        PageFragment pageFragment = new PageFragment();
        Bundle arguments = new Bundle();
        pageFragment.setArguments(arguments);
        return pageFragment;
    }

    @Override


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_char_list, null);

        TextView tvPage = (TextView) view.findViewById(R.id.tvPage);

        return view;
    }
}
