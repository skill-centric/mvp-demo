package com.skill_centric.mvpdemo.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.skill_centric.mvpdemo.presentation.view.HelperView;
import com.skill_centric.mvpdemo.presentation.presenter.HelperPresenter;

import com.arellomobile.mvp.MvpAppCompatActivity;

import com.skill_centric.mvpdemo.R;

import com.arellomobile.mvp.presenter.InjectPresenter;

public class HelperActivity extends MvpAppCompatActivity implements HelperView {
    public static final String TAG = "HelperActivity";
    @InjectPresenter
    HelperPresenter mHelperPresenter;


    public static Intent getIntent(final Context context) {
        Intent intent = new Intent(context, HelperActivity.class);

        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper);
    }
}
