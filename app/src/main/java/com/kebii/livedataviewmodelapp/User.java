package com.kebii.livedataviewmodelapp;

import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class User {
    private String name;
    private String password;
    private String avator;

    public User(String name, String password, String avator) {
        this.name = name;
        this.password = password;
        this.avator = avator;
    }

//    @BindingAdapter("bind:avator")
//    public static void getImage(ImageView view, String url) {
//        Glide.with(view.getContext()).load(url).into(view);
//    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }
}
