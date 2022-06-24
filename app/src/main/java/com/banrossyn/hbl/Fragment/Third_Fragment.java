package com.banrossyn.hbl.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.banrossyn.hbl.R;
import com.banrossyn.hbl.RainView.EmojiRainLayout;

public class Third_Fragment extends Fragment {
    private EmojiRainLayout emojithree;

    public Third_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View third = inflater.inflate(R.layout.fragment_third, container, false);
        emojithree = third.findViewById(R.id.third_fragment);

        emojithree.addEmoji(R.drawable.e_toung);
        emojithree.addEmoji(R.drawable.e_toung);
        emojithree.addEmoji(R.drawable.e_toung);
        emojithree.addEmoji(R.drawable.e_toung);
        emojithree.setPer(8);
        emojithree.setDuration(4500);
        emojithree.setDropDuration(2400);
        emojithree.setDropFrequency(500);
        emojithree.startDropping();
        return third;
    }
}