package com.databindingmedium

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("BookName")
fun setText(textView: TextView, name: String) {
    textView.text = "Book Name is $name"
}

@BindingAdapter("leftPadding", "rightPadding")
fun addPadding(view: View, leftPadding: Int, rightPadding: Int) {
    view.setPadding(leftPadding, view.paddingTop, rightPadding, view.paddingBottom)
}