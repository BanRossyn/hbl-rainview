package com.banrossyn.hbl.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.banrossyn.hbl.R;
import com.banrossyn.hbl.RainView.EmojiRainLayout;

public class Five_Fragment extends Fragment {
    private EmojiRainLayout emojifive;

    public Five_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View five = inflater.inflate(R.layout.fragment_five, container, false);
        emojifive = five.findViewById(R.id.five_fragment);


        emojifive.addEmoji(R.drawable.e_bday);
        emojifive.addEmoji(R.drawable.e_bday);
        emojifive.addEmoji(R.drawable.e_bday);
        emojifive.addEmoji(R.drawable.e_bday);

        emojifive.setPer(8);
        emojifive.setDuration(4500);
        emojifive.setDropDuration(2400);
        emojifive.setDropFrequency(500);
        emojifive.startDropping();
        return five;
    }
}