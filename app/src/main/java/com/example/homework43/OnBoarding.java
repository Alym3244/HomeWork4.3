package com.example.homework43;

import android.icu.text.CaseMap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OnBoarding#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OnBoarding extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
private TextView txtTitle,txtDescription;
private ImageView itemImage;







    // TODO: Rename and change types of parameters

    private String mTitle;
    private String mDescription;
    private int mImage;


    public OnBoarding() {
        // Required empty public constructor
    }



    public static OnBoarding newInstance(String title,String description,int image) {
        OnBoarding fragment = new OnBoarding();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, title);
        args.putString(ARG_PARAM2, description);
        args.putInt(ARG_PARAM3, image);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mTitle = getArguments().getString(ARG_PARAM1);
            mDescription = getArguments().getString(ARG_PARAM2);
            mImage= getArguments().getInt(ARG_PARAM3);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_on_boarding, container, false);
        txtTitle=view.findViewById(R.id.item_title);
        txtDescription=view.findViewById(R.id.item_description);
        itemImage=view.findViewById(R.id.item_img);
        txtTitle.setText(mTitle);
        txtDescription.setText(mDescription);
       itemImage.setImageResource(mImage);
        return view;
    }
}