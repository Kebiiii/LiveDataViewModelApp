package com.kebii.livedataviewmodelapp;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kebii.livedataviewmodelapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MainViewModel mainViewModel;
//    TextView tvScoreA, tvScoreB;
//    Button btnPlayerA, btnPlayerB;
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mBinding.tvScoreA.setText(String.valueOf(mainViewModel.getCurrentCountA()));
        mBinding.tvScoreB.setText(String.valueOf(mainViewModel.getCurrentCountB()));
        mBinding.btnUserActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_user_activity:
                startActivity(new Intent(getApplicationContext(),UserActivity.class));
                break;
        }
    }
}
