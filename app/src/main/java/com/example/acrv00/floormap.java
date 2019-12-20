package com.example.acrv00;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class floormap extends Fragment implements  View.OnClickListener{


    private Button floor;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View v=inflater.inflate(R.layout.fragment_floormap,container,false);

        floor=v.findViewById(R.id.floormap);

        floor.setOnClickListener(this);
        return v;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.floormap:
                Intent intent = new Intent(getActivity(), floor_main.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
