package com.aoinc.pl_daggerhilt_25min

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("String3") testString3: String
) : ViewModel() {

//    @Inject
//    @Named("String2")

    init {
        Log.d("ViewModel", "Test string from ViewModel: $testString3")
    }
}