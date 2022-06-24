package com.banrossyn.hbl.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.banrossyn.hbl.R;
import com.banrossyn.hbl.RainView.EmojiRainLayout;

public class Four_Fragment extends Fragment {
    private EmojiRainLayout emojifour;

    public Four_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View four = inflater.inflate(R.layout.fragment_four, container, false);
        emojifour = four.findViewById(R.id.four_fragment);



        emojifour.addEmoji(R.drawable.e_hand);
        emojifour.addEmoji(R.drawable.e_hand);
        emojifour.addEmoji(R.drawable.e_hand);
        emojifour.addEmoji(R.drawable.e_hand);
        emojifour.setPer(8);
        emojifour.setDuration(4500);
        emojifour.setDropDuration(2400);
        emojifour.setDropFrequency(500);
        emojifour.startDropping();
        return four;
    }
}