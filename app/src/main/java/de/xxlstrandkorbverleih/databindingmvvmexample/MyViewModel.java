package de.xxlstrandkorbverleih.databindingmvvmexample;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    String TAG = "MyViewModel";
    public MutableLiveData<String> _number = new MutableLiveData<>("test");

    public void onClick() {
        Log.d(TAG, "onClick()");
    }
}
