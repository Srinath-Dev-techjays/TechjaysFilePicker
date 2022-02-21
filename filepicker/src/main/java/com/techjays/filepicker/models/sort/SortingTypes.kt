package com.techjays.filepicker.models.sort

import com.techjays.filepicker.models.Document
import java.util.Comparator

enum class SortingTypes(val comparator: Comparator<Document>?) {
    NAME(NameComparator()), NONE(null);
}