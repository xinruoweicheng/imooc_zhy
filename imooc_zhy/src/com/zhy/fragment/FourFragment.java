package com.zhy.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.zhy.R;
import com.zhy.activity.XUtilsTestActivity;
import com.zhy.changeskin.ChangeSkinActivity;
import com.zhy.recyclerview.RecyclerViewActivity;

public class FourFragment extends Fragment implements OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_four, container, false);
        view.findViewById(R.id.btn_RecyclerView).setOnClickListener(this);
        view.findViewById(R.id.btn_xUtils).setOnClickListener(this);
        view.findViewById(R.id.btn_ChangeSkin).setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btn_RecyclerView:
                intent = new Intent(getActivity(), RecyclerViewActivity.class);
                break;

            case R.id.btn_xUtils:
                intent = new Intent(getActivity(), XUtilsTestActivity.class);
                break;

            case R.id.btn_ChangeSkin:
                intent = new Intent(getActivity(), ChangeSkinActivity.class);
                break;

            default:
                break;
        }
        startActivity(intent);
    }

}
