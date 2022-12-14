package com.android4you.space.utils

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat

fun Context.color(@ColorRes resource: Int): Int {
    return ContextCompat.getColor(this, resource)
}

fun Context.drawable(@DrawableRes resource: Int): Drawable? {
    return ContextCompat.getDrawable(this, resource)
}
