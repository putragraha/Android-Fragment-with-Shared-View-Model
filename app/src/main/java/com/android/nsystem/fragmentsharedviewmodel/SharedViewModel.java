package com.android.nsystem.fragmentsharedviewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {

    private MutableLiveData<CharSequence> mText = new MutableLiveData<>();

    public void setText(CharSequence value) {
        mText.setValue(value);
    }

    public LiveData<CharSequence> getText() {
        return mText;
    }
}
