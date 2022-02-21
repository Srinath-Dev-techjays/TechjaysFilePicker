package com.techjays.filepicker.models.sort

import com.techjays.filepicker.models.Document
import java.util.*

class NameComparator : Comparator<Document> {
    override fun compare(o1: Document, o2: Document): Int {
        return o1.name.toLowerCase(Locale.getDefault()).compareTo(o2.name.toLowerCase(Locale.getDefault()))
    }
}