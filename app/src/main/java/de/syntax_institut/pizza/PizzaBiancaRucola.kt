package de.syntax_institut.pizza

import android.widget.ImageView
import android.widget.TextView

open class PizzaBiancaRucola(
    mehl: String,
    wasser: String,
    hefe: String,
    val rucola: String
) : Pizza(mehl, wasser, hefe){

    override fun bake(imageView: ImageView) {
        imageView.setImageResource(R.drawable.pizza_bianca_rucola)
    }

    override fun ingredients(zeile1: TextView, zeile2: TextView, zeile3: TextView) {
        super.ingredients(zeile1, zeile2, zeile3)
        zeile2.text = rucola
        zeile3.text = ""
    }
}