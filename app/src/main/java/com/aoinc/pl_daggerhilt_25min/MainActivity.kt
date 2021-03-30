package com.aoinc.pl_daggerhilt_25min

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint  // need when you to inject things, otherwise program will crash
// required for fragments AND parent activies
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("String2")
    lateinit var testString: String

    private val viewModel: TestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "Test string from MainActivity: $testString")
        viewModel
    }
}