package com.techastrum.myappcreater.fragmentdialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.techastrum.myappcreater.R;

public class MerchantInfo extends BottomSheetDialogFragment {

    public static MerchantInfo getInstance() {
        return new MerchantInfo();
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(STYLE_NORMAL, R.style. AppBottomSheetDialogTheme);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.merchant_info_bottomsheet, container, false);

        EditText merchantIdView = view.findViewById(R.id.merchantid);
        CardView okay = view.findViewById(R.id.okay);

        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (merchantIdView.getText().toString().length()<6){
                    Toast.makeText(getActivity(),"Enter a valid email",Toast.LENGTH_LONG).show();
                }else {
                    dismiss();

                }

            }
        });


        return view;
    }
}
