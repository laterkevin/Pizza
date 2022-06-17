package de.syntax_institut.pizza

import android.widget.ImageView
import android.widget.TextView

open class PizzaRossa(
    mehl: String,
    wasser: String,
    hefe: String,
    val tomatensosse: String
) : Pizza(mehl, wasser, hefe){

    override fun bake(imageView: ImageView) {
        imageView.setImageResource(R.drawable.pizza_rossa)
    }

    override fun ingredients(zeile1: TextView, zeile2: TextView, zeile3: TextView) {
        super.ingredients(zeile1, zeile2, zeile3)
        zeile2.text = tomatensosse
        zeile3.text = ""
    }
}