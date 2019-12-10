package com.suman.fragasses.ui.gallery;

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

public class GalleryFragment extends Fragment implements  View.OnClickListener{

    private Button btnpal;
    private TextView tvpalin;
    private EditText txpalin;


    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        btnpal = view.findViewById(R.id.btnpal);
        tvpalin = view.findViewById(R.id.tvpalin);
        txpalin = view.findViewById(R.id.txpalin);

btnpal.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
int pnumber, showresult;

pnumber = Integer.parseInt(txpalin.getText().toString());

palindrome pp = new palindrome();
        {
            showresult = pp.back(pnumber);

            if(showresult == pnumber)
            {
                tvpalin.setText(Integer.toString(pnumber)+" is a Palindrome Number");
            }
            else {
                tvpalin.setText(Integer.toString(pnumber)+"is not palindrome number");
            }
        }

    }
}