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
            Tip("Day 1 - Oatmeal with Berries and Nuts", R.drawable.oatmeal, "Whole grain oats provide fiber, while berries add antioxidants, and nuts contribute healthy fats."),
            Tip("Day 2 - Avocado Toast", R.drawable.avocado_sandwich, "Creamy avocados, rich in healthy fats, are served on toasted bread, offering a delicious and nutritious base."),
            Tip("Day 3 - Scrambled Eggs with Spinach and Tomatoes", R.drawable.pexels_markusspiske_192319, "Eggs provide high-quality protein, complemented by nutrient-dense spinach and juicy tomatoes for added flavor."),
            Tip("Day 4 - Greek Yogurt Parfait", R.drawable.oats_2, "Creamy Greek yogurt is layered with crunchy granola and fresh fruits, combining protein, fiber, and vitamins."),
            Tip("Day 5 - Overnight Oats", R.drawable.overnight_oats, "Rolled oats soak in milk or yogurt overnight, allowing them to soften while infusing with flavors and nutrients."),

            Tip("Day 6 - Chicken Salad Sandwich", R.drawable.chicken_sandwich, "Shredded chicken mixed with creamy dressing and vegetables creates a satisfying sandwich filling."),
            Tip("Day 7 - Leftover Stir-Fry", R.drawable.stir_fry_1, "Protein-rich tuna is mixed with mayo and seasonings, wrapped in a tortilla with fresh vegetables for a portable lunch."),
            Tip("Day 8 - Tuna Salad Wrap", R.drawable.salmon, "A hearty blend of seasonal vegetables simmered in broth provides comfort and essential nutrients."),
            Tip("Day 9 - Vegetable Soup", R.drawable.soup, "Nutritious quinoa is topped with a medley of roasted vegetables, making for a colorful and filling meal."),
            Tip("Day 10 - Quinoa Bowl with Roasted Vegetables", R.drawable.quina, "Practice mindful breathing for 5 minutes."),

            Tip("Day 11 - Spaghetti", R.drawable.spaghetti, "Pasta served with savory meatballs in marinara sauce creates a classic and hearty Italian dish."),
            Tip("Day 12 - Chicken Fajitas", R.drawable.chicken_fajitas, "Seasoned chicken with sautéed peppers and onions wrapped in tortillas offers a vibrant and customizable dinner. "),
            Tip("Day 13 - Salmon ", R.drawable.salmon, "Tender salmon paired with roasted asparagus provides a light, nutritious meal full of omega-3s. "),
            Tip("Day 14 - Beef Stir-Fry", R.drawable.beef_stir, "Quick-cooking beef stir-fried with fresh vegetables in a savory sauce creates a flavorful and satisfying dish. "),
            Tip("Day 15 - Vegetable Curry", R.drawable.vegetable_curry, "A blend of spices, vegetables, and creamy coconut milk delivers a warm, aromatic dish that’s both filling and comforting. "),

            Tip("Day 16 - Fruit Salad", R.drawable.fruit_salad, "A colorful mix of seasonal fruits offers a refreshing, naturally sweet snack rich in vitamins."),
            Tip("Day 17 - Hummus and Pita Bread", R.drawable.hummus_and_pita_bread, "Creamy hummus, made from chickpeas, is served with soft pita for a protein-rich snack."),
            Tip("Day 18 - Trail Mix", R.drawable.trail_mix, "A blend of nuts, dried fruits, and optional chocolate creates a customizable snack full of energy and nutrients."),
            Tip("Day 19 - Greek Yogurt", R.drawable.oats_2, "Creamy yogurt drizzled with honey and topped with nuts provides a sweet and crunchy protein boost."),
            Tip("Day 20 - Hard-Boiled Eggs", R.drawable.hard_boiled_eggs, "Simple and portable, hard-boiled eggs are a nutritious snack rich in protein and essential nutrients."),

            Tip("Day 21 - Chocolate Chips Cookie", R.drawable.chocolate_chip_cookies, " Soft and chewy, these cookies are filled with sweet chocolate chips for a classic treat."),
            Tip("Day 22 - Fruit Tart", R.drawable.fruit_tart, "A buttery crust filled with fresh fruits and creamy custard offers a delightful balance of flavors and textures."),
            Tip("Day 23 - Ice Cream Sundae", R.drawable.ice_cream_sundae, "A scoop of ice cream topped with various toppings creates a customizable dessert experience."),
            Tip("Day 24 - Cheesecake Bars", R.drawable.cheesecake_bars, "Creamy cheesecake filling on a graham cracker crust offers a rich dessert in a convenient bar form."),
            Tip("Day 25 - Chocolate Mousse", R.drawable.chocolate_mousse, "Light and airy, this dessert combines whipped chocolate and cream for a luxurious finish.\n"),

            Tip("Day 26 - Ramen Noodles", R.drawable.ramen_noodles, "Instant noodles cooked with broth and toppings create a fast, satisfying meal option."),
            Tip("Day 27 - Grilled Cheese Sandwich", R.drawable.grilled_cheese_sandwich, "Melty cheese between crispy, toasted bread makes for a comforting classic."),
            Tip("Day 28 - Mac and Cheese", R.drawable.mac_and_cheese, "Creamy pasta combined with cheese sauce provides a quick and comforting dish loved by many."),
            Tip("Day 29 - Pizza Rolls", R.drawable.pizza, "Bite-sized rolls filled with pizza flavors make for a fun and quick snack or meal."),
            Tip("Day 30 - Chicken Nuggets", R.drawable.chicken_nuggets, "Crispy chicken pieces, popular with both kids and adults, are a convenient and satisfying meal option."),


        )

        recyclerView.adapter = object : RecyclerView.Adapter<TipViewHolder>() {

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
                val layout = LinearLayout(parent.context).apply {
                    orientation = LinearLayout.VERTICAL
                    layoutParams = ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    )
                    setPadding(16, 0, 16, 0)
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
                }

                val descriptionTextView = TextView(parent.context).apply {
                    layoutParams = LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    )
                    textSize = 16f
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
