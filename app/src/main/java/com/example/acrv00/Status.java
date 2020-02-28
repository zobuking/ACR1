package com.example.acrv00;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;


public class Status extends Fragment  {

    private GridView grid;

    int[] performance ={R.drawable.alert,R.drawable.sleep,R.drawable.alarm,R.drawable.message,R.drawable.mute};
    String[] val={"data11","data22","data33","data44","data44"};
    private ArrayAdapter<String> adapter;
    Activity act;








    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        act = getActivity();

        View V=inflater.inflate(R.layout.fragment_status,container,false);

        GridView G=V.findViewById(R.id.grid);

        status_cust_adapter adapter= new status_cust_adapter(act,performance,val);

        G.setAdapter(adapter);





        G.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                if(position==0) {
                    Intent intent = new Intent(getActivity(), alert_main.class);
                    startActivity(intent);
                }
                else if(position==1)
                {
                    Intent intent = new Intent(getActivity(), sleep_main.class);
                    startActivity(intent);

                }
                else if(position==2)
                {
                    Intent intent = new Intent(getActivity(), alarm_main.class);
                    startActivity(intent);

                }
                else if(position==4)
                {
                    Intent intent = new Intent(getActivity(), notification_main.class);
                    startActivity(intent);

                }
                else if(position==3)
                {
                    Intent intent = new Intent(getActivity(), mute_main.class);
                    startActivity(intent);

                }

                //Toast.makeText(GridViewExampleActivity.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });





        return V;



    }



   }
