package com.skill_centric.mvpdemo;


import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter<MoxyView> {

    private final StudentRepository studentRepository;

    public MainPresenter() {

        studentRepository = new StudentRepository();
    }


    public void onFabClick() {

        studentRepository.saveStudentToDb();

        getViewState().confirmStudentSaved();
    }
}
