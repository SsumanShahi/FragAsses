package com.suman.fragasses.ui.tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.suman.fragasses.R;

public class ToolsFragment extends Fragment implements View.OnClickListener{

    private Button btnaut;
    private TextView tvaut;
    private EditText txaut;

    private ToolsViewModel toolsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        toolsViewModel =
                ViewModelProviders.of(this).get(ToolsViewModel.class);
        View view = inflater.inflate(R.layout.fragment_tools, container, false);

        tvaut = view.findViewById(R.id.tvaut);
        txaut = view.findViewById(R.id.txaut);
        btnaut = view.findViewById(R.id.btnaut);


        btnaut.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int a,square,counter=1;
        int n=Integer.parseInt(txaut.getText().toString());

        a=n;
        square=n*n;
        while (n!=0)
        {
            counter=counter*10;
            n=n/10;
        }
        if(square%counter==a){

            tvaut.setText("it is automorphic");

        }
        else{
            tvaut.setText("it is not automorphic");
        }

    }
    }
