package com.example.sensei.interfacefi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OneFragment extends Fragment {
    public OneFragment(){
        ///
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup
            container,Bundle savedInstanceState){
        return inflater.inflate(R.layout.content_main,container,false);
    }
}
