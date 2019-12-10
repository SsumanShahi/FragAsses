package com.suman.fragasses.ui.slideshow;

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

public class SlideshowFragment extends Fragment implements View.OnClickListener{

    private EditText txsw, txsw1;
    private Button btnswap;


    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View view = inflater.inflate(R.layout.fragment_slideshow, container, false);

        txsw1 = view.findViewById(R.id.txsw1);
        txsw = view.findViewById(R.id.txsw);
        btnswap = view.findViewById(R.id.btnswap);

btnswap.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int num1, num2;

        num1 = Integer.parseInt(txsw.getText().toString());
        num2 = Integer.parseInt(txsw1.getText().toString());


        txsw.setText(Integer.toString(num2));
        txsw1.setText(Integer.toString(num1));
    }
}