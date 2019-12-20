package com.example.acrv00;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;


public class Status extends Fragment implements View.OnClickListener {

    private GridView grid;

    int[] performance ={R.drawable.stat1,R.drawable.stat2,R.drawable.stat3,R.drawable.stat4};
    String[] val={"data1","data2","data3","data4"};
    private ArrayAdapter<String> adapter;
    Activity act;

    ImageView alert,sleep,alarm,noti,mute,settings;








    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        act = getActivity();

        View V=inflater.inflate(R.layout.fragment_status , container ,false);

        alert =V.findViewById(R.id.alert);
        sleep =V.findViewById(R.id.sleep);
        alarm =V.findViewById(R.id.alarm);
        noti =V.findViewById(R.id.noti);
        mute =V.findViewById(R.id.mute);
        settings =V.findViewById(R.id.settings);


        GridView G=V.findViewById(R.id.grid);

        status_cust_adapter adapter= new status_cust_adapter(act,performance,val);

        G.setAdapter(adapter);

        alert.setOnClickListener(this);
        sleep.setOnClickListener(this);
        alarm.setOnClickListener(this);
        noti.setOnClickListener(this);
        mute.setOnClickListener(this);
        settings.setOnClickListener(this);








        return V;



    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.alert:
                Intent intent = new Intent(getActivity(), alert_main.class);
                startActivity(intent);
                break;
            case R.id.sleep:
                Intent intent1 = new Intent(getActivity(), sleep_main.class);
                startActivity(intent1);
                break;
            case R.id.alarm:
                Intent intent2 = new Intent(getActivity(), alarm_main.class);
                startActivity(intent2);
                break;
            case R.id.noti:
                Intent intent3 = new Intent(getActivity(), notification_main.class);
                startActivity(intent3);
                break;
            case R.id.mute:
                Intent intent4 = new Intent(getActivity(), mute_main.class);
                startActivity(intent4);
                break;
            case R.id.settings:
                Intent intent5 = new Intent(getActivity(), settings_main.class);
                startActivity(intent5);
                break;

            default:
                break;
        }

    }
}
