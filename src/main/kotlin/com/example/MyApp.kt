package com.example

import javafx.geometry.Pos
import javafx.scene.Scene
import tornadofx.*
import kotlin.random.Random

class MyView : View() {
    override val root = vbox {
        spacing = 25.0
        alignment = Pos.CENTER

        button("Click me for random colors") {
            action {
                style {
                    textFill = c(Random.nextInt(0, 255), Random.nextInt(0, 255), Random.nextInt(0, 255))
                    borderColor += box(c(Random.nextInt(0, 255), Random.nextInt(0, 255), Random.nextInt(0, 255)))
                    backgroundInsets += box(5.px)
                    borderRadius += box(5.px)
                    backgroundColor += c(Random.nextInt(0, 255), Random.nextInt(0, 255), Random.nextInt(0, 255))
                }
            }
        }
    }
}

class MyApp : App(MyView::class) {
    override fun createPrimaryScene(view: UIComponent) = Scene(view.root, 320.0, 320.0)
}

fun main(args: Array<String>) {
    launch<MyApp>(args)
}