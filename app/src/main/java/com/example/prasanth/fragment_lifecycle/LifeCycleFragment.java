package com.example.prasanth.fragment_lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class LifeCycleFragment extends Fragment {

    public void onAttach(Activity activity)
    {
     super.onAttach(activity);
        Toast.makeText(getActivity(),"onAttach() called",Toast.LENGTH_SHORT).show();
    }

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(),"onCreate() called",Toast.LENGTH_SHORT).show();
    }

    public View onCreateView(LayoutInflater layoutInflater,ViewGroup viewGroup,Bundle savedInstanceState)
    {
        Toast.makeText(getActivity(),"onCreateView() called",Toast.LENGTH_SHORT).show();

        return layoutInflater.inflate(R.layout.fragment_layout,viewGroup,false);
    }

    public void onActivityCreated(Bundle savedInstanceState)
    {
       super.onActivityCreated(savedInstanceState);
        Toast.makeText(getActivity(),"onActivityCreated() called",Toast.LENGTH_SHORT).show();
    }

    public void onStart()
    {
        super.onStart();
        Toast.makeText(getActivity(),"onStart() called",Toast.LENGTH_SHORT).show();
    }

    public void onResume()
    {
    super.onResume();
    Toast.makeText(getActivity(),"onResume() called",Toast.LENGTH_SHORT).show();
    }

    public void onPause()
    {
        super.onPause();
        Toast.makeText(getActivity(),"onPause() called",Toast.LENGTH_SHORT).show();
    }

    public void onStop()
    {
    super.onStop();
    Toast.makeText(getActivity(),"onStop() called",Toast.LENGTH_SHORT).show();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        Toast.makeText(getActivity(),"onDestroyView() called",Toast.LENGTH_SHORT).show();
    }

    public void onDetach()
    {
        super.onDetach();
        Toast.makeText(getActivity(),"onDetach",Toast.LENGTH_SHORT).show();
    }

    public void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(getActivity(),"onDestroy() called",Toast.LENGTH_SHORT).show();
    }
}
