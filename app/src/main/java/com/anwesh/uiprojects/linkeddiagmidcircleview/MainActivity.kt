package com.anwesh.uiprojects.linkeddiagmidcircleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.diagmidcircleview.DiagMidCircleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DiagMidCircleView.create(this)
    }
}
