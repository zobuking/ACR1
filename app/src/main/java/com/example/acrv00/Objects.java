package com.example.acrv00;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;


public class Objects extends Fragment {


    private GridView grid;

    int[] performance ={R.drawable.alarm,R.drawable.stat2,R.drawable.stat3,R.drawable.stat4,R.drawable.stat4,R.drawable.stat4,R.drawable.stat4};
    String[] val={"data11","data22","data33","data44","data44","data44","data44"};

    Activity act;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        act = getActivity();

        View V=inflater.inflate(R.layout.fragment_objects,container,false);

        GridView G=V.findViewById(R.id.grid);

        status_cust_adapter adapter= new status_cust_adapter(act,performance,val);

        G.setAdapter(adapter);


        return V;



    }
}
