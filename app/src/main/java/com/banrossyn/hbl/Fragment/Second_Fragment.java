package com.banrossyn.hbl.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.banrossyn.hbl.R;
import com.banrossyn.hbl.RainView.EmojiRainLayout;

public class Second_Fragment extends Fragment {
    private EmojiRainLayout emojitwo;
    public Second_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View second = inflater.inflate(R.layout.fragment_second, container, false);
        emojitwo = second.findViewById(R.id.second_fragment);


        emojitwo.addEmoji(R.drawable.e_love);
        emojitwo.addEmoji(R.drawable.e_love);
        emojitwo.addEmoji(R.drawable.e_love);
        emojitwo.addEmoji(R.drawable.e_love);
        emojitwo.addEmoji(R.drawable.e_love);

        emojitwo.setPer(8);
        emojitwo.setDuration(4500);
        emojitwo.setDropDuration(2400);
        emojitwo.setDropFrequency(500);
        emojitwo.startDropping();
        return second;
    }
}