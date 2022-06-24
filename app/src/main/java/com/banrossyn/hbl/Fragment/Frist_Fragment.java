package com.banrossyn.hbl.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.banrossyn.hbl.R;
import com.banrossyn.hbl.RainView.EmojiRainLayout;


public class Frist_Fragment extends Fragment {
    public EmojiRainLayout emojione;

    public Frist_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frist, container, false);

        emojione = view.findViewById(R.id.frist_fragment);


        emojione.addEmoji(R.drawable.e_eye_love);
        emojione.addEmoji(R.drawable.e_eye_love);
        emojione.addEmoji(R.drawable.e_eye_love);
        emojione.addEmoji(R.drawable.e_eye_love);
        emojione.setPer(8);
        emojione.setDuration(4500);
        emojione.setDropDuration(2400);
        emojione.setDropFrequency(500);
        emojione.startDropping();
        return view;
    }


}