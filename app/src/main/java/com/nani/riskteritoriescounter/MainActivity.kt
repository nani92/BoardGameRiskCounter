package com.nani.riskteritoriescounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.CardView
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_territory.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupCardView(bluePlayerCardView, ContextCompat.getColor(this, R.color.blue), ContextCompat.getColor(this, R.color.blue_20))
        setupCardView(redPlayerCardView, ContextCompat.getColor(this, R.color.red), ContextCompat.getColor(this, R.color.red_20))
        setupCardView(greenPlayerCardView, ContextCompat.getColor(this, R.color.green), ContextCompat.getColor(this, R.color.green_20))
        setupCardView(yellowPlayerCardView, ContextCompat.getColor(this, R.color.yellow), ContextCompat.getColor(this, R.color.yellow_20))
        setupCardView(greyPlayerCardView, ContextCompat.getColor(this, R.color.grey), ContextCompat.getColor(this, R.color.grey_20))

        //setupRecyclerView()
    }

    private fun setupRecyclerView() {
        //territoriesRecyclerView.layoutManager = LinearLayoutManager(this);
        //territoriesRecyclerView.adapter = TerritoriesAdapter(this);
    }

    private fun setupCardView(parentCardView: CardView, color: Int, colorTransparent: Int) {
        parentCardView.territoriesLinearLayout.setBackgroundColor(colorTransparent)
        parentCardView.territoriesColorImageView.setBackgroundColor(color)
        parentCardView.territoriesMinusButton.setTextColor(color)
        parentCardView.territoriesPlusButton.setTextColor(color)

        parentCardView.territoriesPlusButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                var countEditTextString: String = parentCardView.territoriesCounterEditText.text.toString()
                var count: Int = countEditTextString.toInt()
                parentCardView.territoriesCounterEditText.setText((count + 1).toString())
            }
        })

        parentCardView.territoriesMinusButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                var countEditTextString: String = parentCardView.territoriesCounterEditText.text.toString()
                var count: Int = countEditTextString.toInt()
                parentCardView.territoriesCounterEditText.setText((count - 1).toString())
            }
        })

    }
}
