package com.hanseltritama.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class EmojifyButtonFragment extends Fragment {

    private String mBtnText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.emojify_button_fragment, container, false);
        Button emojifyBtn = view.findViewById(R.id.emojify_me_btn_fragment);
        emojifyBtn.setText(mBtnText);
        return view;
    }

    public void setBtnText(String btnText) {

        mBtnText = btnText;

    }
}
