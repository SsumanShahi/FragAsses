package com.suman.fragasses.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.suman.fragasses.R;

public class HomeFragment extends Fragment implements  View.OnClickListener{

    private EditText txnum;
    private Button btnarea;
    private TextView tvarea;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        txnum = view.findViewById(R.id.txnum);
        tvarea = view.findViewById(R.id.tvarea);
        btnarea= view.findViewById(R.id.btnarea);


        btnarea.setOnClickListener(this);
        return view;

    }


    @Override
    public void onClick(View v) {
        int num = Integer.parseInt(txnum.getText().toString());
        int area = (22/7)* num * num;

        tvarea.setText("Area of circle is:" + Integer.toString(area));

        Toast.makeText(getActivity(), "Area of circle is:" + area, Toast.LENGTH_LONG).show();
    }

}
