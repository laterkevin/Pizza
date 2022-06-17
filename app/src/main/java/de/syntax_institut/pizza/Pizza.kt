package de.syntax_institut.pizza

import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

open class Pizza(
    val mehl: String,
    val wasser: String,
    val hefe: String
) {

    open fun bake(imageView: ImageView) {
        imageView.setImageResource(R.drawable.teig)
    }

    open fun ingredients(zeile1: TextView, zeile2: TextView, zeile3: TextView){
        val teig = "$mehl $wasser $hefe"
        zeile1.text = teig
        zeile2.text = ""
        zeile3.text = ""
    }
}