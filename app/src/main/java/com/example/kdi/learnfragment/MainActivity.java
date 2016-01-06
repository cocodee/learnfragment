package com.example.kdi.learnfragment;

import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends FragmentActivity  implements FirstFragment.OnFragmentInteractionListener,AnotherFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new FirstFragment()).commit();
        }
    }
    @Override
    public  void onFragmentInteraction(Uri uri) {

    }

}
