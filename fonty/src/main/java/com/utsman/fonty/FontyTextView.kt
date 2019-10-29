package com.utsman.fonty

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView

class FontyTextView(context: Context, attrs: AttributeSet?) : TextView(context, attrs) {

    init {
        if (attrs != null) {
            val a = getContext().obtainStyledAttributes(attrs, R.styleable.FontyTextView)
            val fontName = a.getString(R.styleable.FontyTextView_fonty)

            try {
                if (fontName != null) {
                    val fontyTypeface =
                        Typeface.createFromAsset(getContext().assets, "fonts/$fontName")
                    typeface = fontyTypeface
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

            a.recycle()
        }
    }
}