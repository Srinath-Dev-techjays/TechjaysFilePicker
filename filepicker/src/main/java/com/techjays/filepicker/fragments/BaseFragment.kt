package com.techjays.filepicker.fragments

import androidx.fragment.app.Fragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

abstract class BaseFragment : Fragment() {

    open val uiScope = CoroutineScope(Dispatchers.Main)

    companion object {

        val FILE_TYPE = "FILE_TYPE"
    }
}//