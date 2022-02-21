package com.techjays.filepicker.fragments

interface PhotoPickerFragmentListener {
    fun onItemSelected()
    fun setToolbarTitle(count: Int)
}