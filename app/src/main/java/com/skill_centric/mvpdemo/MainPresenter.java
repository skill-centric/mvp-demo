package com.skill_centric.mvpdemo;

public class MainPresenter {

    MainActivity view;
    private final StudentRepository studentRepository;

    public MainPresenter() {

        studentRepository = new StudentRepository();
    }

    public MainActivity getView() {
        return view;
    }

    public void setView(MainActivity view) {
        this.view = view;
    }

    public void onFabClick() {

        studentRepository.saveStudentToDb();

        view.confirmStudentSaved();
    }
}
