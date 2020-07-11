/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.propertyanimation

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

// Property animation is, simply, the changing of property values over time.

// The Animator system in Android was specifically written to animate properties,
// meaning that it can animate anything (not just UI elements)
// that has a setter (and, in some cases, a getter)
// There are properties for position (called “translation”),
// rotation, scale, and transparency (called “alpha”)There are actually
// two different ways to access the properties,
// by regular setter/getter pairs, like setTranslateX()/getTranslateX(),
// and by static android.util.Property objects,
// like View.TRANSLATE_X (an object that has both a get() and a set() method).
// This primarily uses android.util.Propertyobjects,
// because it has less overhead internally along with better type-safety,
// but you can also use the setters and getters of any object

class MainActivity : AppCompatActivity() {

    lateinit var star: ImageView
    lateinit var rotateButton: Button
    lateinit var translateButton: Button
    lateinit var scaleButton: Button
    lateinit var fadeButton: Button
    lateinit var colorizeButton: Button
    lateinit var showerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        star = findViewById(R.id.star)
        rotateButton = findViewById<Button>(R.id.rotateButton)
        translateButton = findViewById<Button>(R.id.translateButton)
        scaleButton = findViewById<Button>(R.id.scaleButton)
        fadeButton = findViewById<Button>(R.id.fadeButton)
        colorizeButton = findViewById<Button>(R.id.colorizeButton)
        showerButton = findViewById<Button>(R.id.showerButton)

        rotateButton.setOnClickListener{rotater()}

        translateButton.setOnClickListener { translater() }

        scaleButton.setOnClickListener { scaler() }

        fadeButton.setOnClickListener { fader() }

        colorizeButton.setOnClickListener { colorizer() }

        showerButton.setOnClickListener { shower() }
    }

    private fun rotater() {
        // rotate clockwise around z axis pointing outward
        val animator = ObjectAnimator.ofFloat(star, View.ROTATION,-360f,0f)
        animator.duration = 1000
        animator.start()

    }

    private fun translater() {
    }

    private fun scaler() {
    }

    private fun fader() {
    }

    private fun colorizer() {
    }

    private fun shower() {
    }

}