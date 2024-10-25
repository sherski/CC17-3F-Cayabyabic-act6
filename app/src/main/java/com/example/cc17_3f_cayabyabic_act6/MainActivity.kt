package com.example.cc17_3f_cayabyabic_act6

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    data class Tip(val day: String, val imageResId: Int, val description: String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val tips = listOf(
            Tip("Day 1", R.drawable.avocado_sandwich, "Stay hydrated by drinking at least 8 glasses of water."),
            Tip("Day 2", R.drawable.hard_boiled_eggs, "Take a 10-minute walk to clear your mind and stretch your legs."),
            Tip("Day 3", R.drawable.cheesecake_bars, "Practice mindful breathing for 5 minutes."),
            Tip("Day 4", R.drawable.chicken_fajitas, "Take a 10-minute walk to clear your mind and stretch your legs."),
            Tip("Day 5", R.drawable.chicken_nuggets, "Practice mindful breathing for 5 minutes."),
            Tip("Day 6", R.drawable.chicken_sandwich, "Stay hydrated by drinking at least 8 glasses of water."),
            Tip("Day 7", R.drawable.chocolate_chip_cookies, "Take a 10-minute walk to clear your mind and stretch your legs."),
            Tip("Day 8", R.drawable.chocolate_mousse, "Practice mindful breathing for 5 minutes."),
            Tip("Day 9", R.drawable.fruit_salad, "Take a 10-minute walk to clear your mind and stretch your legs."),
            Tip("Day 10", R.drawable.fruit_tart, "Practice mindful breathing for 5 minutes.")
        )

        recyclerView.adapter = object : RecyclerView.Adapter<TipViewHolder>() {

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
                val layout = LinearLayout(parent.context).apply {
                    orientation = LinearLayout.VERTICAL
                    layoutParams = ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    )
                    setPadding(16, 1, 16, 16)
                }

                val iconImageView = ImageView(parent.context).apply {
                    layoutParams = LinearLayout.LayoutParams(
                        1000, // Width
                        1000  // Height
                    )
                }

                val dayTextView = TextView(parent.context).apply {
                    layoutParams = LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    )
                    textSize = 18f
                    setPadding(0, 1, 0, 0) // Padding above the text
                }

                val descriptionTextView = TextView(parent.context).apply {
                    layoutParams = LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    )
                    textSize = 16f
                    setPadding(0, 1, 0, 0) // Padding above the text
                }
                layout.addView(iconImageView)
                layout.addView(dayTextView)
                layout.addView(descriptionTextView)

                return TipViewHolder(layout, iconImageView, dayTextView, descriptionTextView)
            }

            override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
                val tip = tips[position]
                holder.dayTextView.text = tip.day
                holder.descriptionTextView.text = tip.description
                holder.iconImageView.setImageResource(tip.imageResId)
            }

            override fun getItemCount(): Int = tips.size
        }
    }

    inner class TipViewHolder(
        view: View,
        val iconImageView: ImageView,
        val dayTextView: TextView,
        val descriptionTextView: TextView
    ) : RecyclerView.ViewHolder(view)
}
