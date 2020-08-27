package com.example.gotapp.ui.fragments;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gotapp.R;

public class PageFragment extends Fragment {
    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    int pageNumber;


    public static PageFragment newInstance(int page) {
        PageFragment pageFragment = new PageFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page);
        pageFragment.setArguments(arguments);
        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_test, null);

        TextView tvPage = (TextView) view.findViewById(R.id.tvPage);
        tvPage.setText("John Snow");
        tvPage.setTextColor(getResources().getColor(R.color.grey_char_name));

        return view;
    }
}
