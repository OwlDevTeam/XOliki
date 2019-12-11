package com.example.xoliki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isInvisible
import com.example.xoliki.controller.HelpsMethod
import com.example.xoliki.controller.IIMethod
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

open class MainActivity : AppCompatActivity() {
    var arrXO = CharArray(9, { ' ' })
    var step = 0
    var position = 0
    var winner = 'O'
    var flagbot = 0
    var stepII = 0
    var stack = listOf(0, 1)
    var shag = stack.randomElement()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        flagbot = intent.getIntExtra("IIon", 0)


        if (flagbot == 1 && shag == 1) {
            arrXO[4] = 'X'
            printXO(arrXO)
            txt.text = "Поставьте O"
        } else {
            txt.text = "Поставьте X"
        }
    }

    open fun onClick(x: View) {
        when (x.id) {
            R.id.bt -> {
                play(0)
            }
            R.id.bt2 -> {
                play(1)
            }
            R.id.bt3 -> {
                play(2)
            }
            R.id.bt4 -> {
                play(3)
            }
            R.id.bt5 -> {
                play(4)
            }
            R.id.bt6 -> {
                play(5)
            }
            R.id.bt7 -> {
                play(6)
            }
            R.id.bt8 -> {
                play(7)
            }
            R.id.bt9 -> {
                play(8)
            }
            R.id.reStart -> {
                for (i in 0 until 9) {
                    arrXO[i] = ' '
                }
                printXO(arrXO)
                step = 0
                position = 0
                winner = 'O'
                reStart.isInvisible = true
                StartMenu.isInvisible = true
                Exit.isInvisible = true
                shag = stack.randomElement()
                if (flagbot == 1 && shag == 1) {
                    arrXO[4] = 'X'
                    printXO(arrXO)
                    txt.text = "Поставьте O"
                } else {
                    txt.text = "Поставьте X"
                }
                turnOffAll(true)
            }
            R.id.StartMenu -> {
                val randomIntent = Intent(this, AboutActivity::class.java)
                startActivity(randomIntent)
            }
            R.id.Exit -> {
                moveTaskToBack(true);
            }
        }
    }

    fun List<Int>.randomElement(): Int {
        return this[Random.nextInt(this.size)]
    }

    fun turnOffAll(en: Boolean) {
        if (en) {
            bt.visibility = 1
            bt2.visibility = 1
            bt3.visibility = 1
            bt4.visibility = 1
            bt5.visibility = 1
            bt6.visibility = 1
            bt7.visibility = 1
            bt8.visibility = 1
            bt9.visibility = 1
        } else {
            bt.isInvisible = true
            bt2.isInvisible = true
            bt3.isInvisible = true
            bt4.isInvisible = true
            bt5.isInvisible = true
            bt6.isInvisible = true
            bt7.isInvisible = true
            bt8.isInvisible = true
            bt9.isInvisible = true
        }
    }

    fun printXO(arrXO: CharArray) {
        when (arrXO[0]) {
            ' ' -> {
                bt.setImageResource(R.drawable.button)
            }
            'X' -> {
                bt.setImageResource(R.drawable.button_x)
            }
            'O' -> {
                bt.setImageResource(R.drawable.button_o)
            }
        }
        when (arrXO[1]) {
            ' ' -> {
                bt2.setImageResource(R.drawable.button)
            }
            'X' -> {
                bt2.setImageResource(R.drawable.button_x)
            }
            'O' -> {
                bt2.setImageResource(R.drawable.button_o)
            }
        }
        when (arrXO[2]) {
            ' ' -> {
                bt3.setImageResource(R.drawable.button)
            }
            'X' -> {
                bt3.setImageResource(R.drawable.button_x)
            }
            'O' -> {
                bt3.setImageResource(R.drawable.button_o)
            }
        }
        when (arrXO[3]) {
            ' ' -> {
                bt4.setImageResource(R.drawable.button)
            }
            'X' -> {
                bt4.setImageResource(R.drawable.button_x)
            }
            'O' -> {
                bt4.setImageResource(R.drawable.button_o)
            }
        }
        when (arrXO[4]) {
            ' ' -> {
                bt5.setImageResource(R.drawable.button)
            }
            'X' -> {
                bt5.setImageResource(R.drawable.button_x)
            }
            'O' -> {
                bt5.setImageResource(R.drawable.button_o)
            }
        }
        when (arrXO[5]) {
            ' ' -> {
                bt6.setImageResource(R.drawable.button)
            }
            'X' -> {
                bt6.setImageResource(R.drawable.button_x)
            }
            'O' -> {
                bt6.setImageResource(R.drawable.button_o)
            }
        }
        when (arrXO[6]) {
            ' ' -> {
                bt7.setImageResource(R.drawable.button)
            }
            'X' -> {
                bt7.setImageResource(R.drawable.button_x)
            }
            'O' -> {
                bt7.setImageResource(R.drawable.button_o)
            }
        }
        when (arrXO[7]) {
            ' ' -> {
                bt8.setImageResource(R.drawable.button)
            }
            'X' -> {
                bt8.setImageResource(R.drawable.button_x)
            }
            'O' -> {
                bt8.setImageResource(R.drawable.button_o)
            }
        }
        when (arrXO[8]) {
            ' ' -> {
                bt9.setImageResource(R.drawable.button)
            }
            'X' -> {
                bt9.setImageResource(R.drawable.button_x)
            }
            'O' -> {
                bt9.setImageResource(R.drawable.button_o)
            }
        }
    }

    fun play(p: Int) {
        if (flagbot == 0) {
            var simba: Char
            var printa: Char

            if (step % 2 == 0) {
                simba = 'X'
                printa = 'O'
            } else {
                simba = 'O'
                printa = 'X'
            }

            loopStep@ do {
                txt.text = "Поставьте $printa"
                var positionIn = p
                when (positionIn) {
                    in 0..8 -> {
                        when (arrXO.get(positionIn)) {
                            ' ' -> {
                                step++
                                winner = simba
                                position = positionIn
                                arrXO.set(positionIn, simba)
                                printXO(arrXO)
                                break@loopStep
                            }
                            'O' -> {
                                txt.text = "Тут уже стоит O"
                                break@loopStep
                            }
                            'X' -> {
                                txt.text = "Тут уже стоит X"
                                break@loopStep
                            }
                        }
                    }
                }

            } while (positionIn !in 0..8 || arrXO.get(positionIn) != ' ')

            if (!HelpsMethod().checkXO(arrXO, position, simba)) {
                txt.text = "Победил $winner!"
                turnOffAll(false)
                reStart.visibility = 1
                StartMenu.visibility = 1
                Exit.visibility = 1
            } else if (HelpsMethod().notWiner(arrXO)) {
                txt.text = "Ничья!"
                turnOffAll(false)
                reStart.visibility = 1
                StartMenu.visibility = 1
                Exit.visibility = 1
            }

        } else {
            if (shag == 0) {
                var simba: Char


                if (step % 2 == 0) {
                    simba = 'X'

                } else {
                    simba = 'O'

                }
                loopStep2@ do {
                    txt.text = "Поставьте X"
                    var positionIn = p
                    when (positionIn) {
                        in 0..8 -> {
                            when (arrXO.get(positionIn)) {
                                ' ' -> {
                                    step++
                                    winner = simba
                                    position = positionIn
                                    arrXO.set(positionIn, simba)
                                    printXO(arrXO)
                                    when (step) {
                                        1 -> {
                                            if (positionIn !== 4) {
                                                step++
                                                winner = 'O'
                                                arrXO.set(4, 'O')
                                                printXO(arrXO)
                                            } else {
                                                step++
                                                winner = 'O'
                                                var f = listOf(0, 2, 6, 8)
                                                arrXO.set(f.randomElement(), 'O')
                                                printXO(arrXO)
                                            }
                                        }
                                        3 -> {
                                            step++
                                            winner = 'O'
                                            stepII = IIMethod().checkII(arrXO, positionIn, 'X')
                                            arrXO.set(stepII, 'O')
                                            printXO(arrXO)

                                        }
                                        5 -> {
                                            step++
                                            winner = 'O'
                                            stepII = IIMethod().checkII(arrXO, positionIn, 'X')
                                            arrXO.set(stepII, 'O')
                                            printXO(arrXO)

                                        }
                                        7 -> {
                                            step++
                                            winner = 'O'
                                            stepII = IIMethod().checkII(arrXO, positionIn, 'X')
                                            arrXO.set(stepII, 'O')
                                            printXO(arrXO)

                                        }
                                    }
                                    break@loopStep2
                                }
                                'O' -> {
                                    txt.text = "Тут уже стоит O"
                                    break@loopStep2
                                }
                                'X' -> {
                                    txt.text = "Тут уже стоит X"
                                    break@loopStep2
                                }
                            }
                        }
                    }

                } while (positionIn !in 0..8 || arrXO.get(positionIn) != ' ')

                if (!HelpsMethod().checkXO(arrXO, position, simba)) {
                    txt.text = "Победил $simba!"
                    turnOffAll(false)
                    reStart.visibility = 1
                    StartMenu.visibility = 1
                    Exit.visibility = 1
                } else if (!HelpsMethod().checkXO(arrXO, stepII, 'O')) {
                    txt.text = "Победил O!"
                    turnOffAll(false)
                    reStart.visibility = 1
                    StartMenu.visibility = 1
                    Exit.visibility = 1
                } else if (HelpsMethod().notWiner(arrXO)) {
                    txt.text = "Ничья!"
                    turnOffAll(false)
                    reStart.visibility = 1
                    StartMenu.visibility = 1
                    Exit.visibility = 1
                }
            } else {
                var simba: Char

                step = 1
                if (step % 2 == 0) {
                    simba = 'X'

                } else {
                    simba = 'O'

                }
                loopStep2@ do {
                    txt.text = "Поставьте O"
                    var positionIn = p
                    when (positionIn) {
                        in 0..8 -> {
                            when (arrXO.get(positionIn)) {
                                ' ' -> {
                                    step++
                                    winner = simba
                                    position = positionIn
                                    arrXO.set(positionIn, simba)
                                    printXO(arrXO)

                                    when (step) {
                                        2 -> {
                                            step++
                                            winner = 'X'
                                            stepII = IIMethod().checkII(arrXO, positionIn, 'O')
                                            arrXO.set(stepII, 'X')
                                            printXO(arrXO)

                                        }
                                        4 -> {
                                            step++
                                            winner = 'X'
                                            stepII = IIMethod().checkII(arrXO, positionIn, 'O')
                                            arrXO.set(stepII, 'X')
                                            printXO(arrXO)

                                        }
                                        6 -> {
                                            step++
                                            winner = 'X'
                                            stepII = IIMethod().checkII(arrXO, positionIn, 'O')
                                            arrXO.set(stepII, 'X')
                                            printXO(arrXO)

                                        }
                                        8 -> {
                                            step++
                                            winner = 'X'
                                            stepII = IIMethod().checkII(arrXO, positionIn, 'O')
                                            arrXO.set(stepII, 'X')
                                            printXO(arrXO)
                                        }
                                    }
                                    break@loopStep2
                                }
                                'O' -> {
                                    txt.text = "Тут уже стоит O"
                                    break@loopStep2
                                }
                                'X' -> {
                                    txt.text = "Тут уже стоит X"
                                    break@loopStep2
                                }
                            }
                        }
                    }

                } while (positionIn !in 0..8 || arrXO.get(positionIn) != ' ')

                if (!HelpsMethod().checkXO(arrXO, position, simba)) {
                    txt.text = "Победил $simba!"
                    turnOffAll(false)
                    reStart.visibility = 1
                    StartMenu.visibility = 1
                    Exit.visibility = 1
                } else if (!HelpsMethod().checkXO(arrXO, stepII, 'X')) {
                    txt.text = "Победил X!"
                    turnOffAll(false)
                    reStart.visibility = 1
                    StartMenu.visibility = 1
                    Exit.visibility = 1
                } else if (HelpsMethod().notWiner(arrXO)) {
                    txt.text = "Ничья!"
                    turnOffAll(false)
                    reStart.visibility = 1
                    StartMenu.visibility = 1
                    Exit.visibility = 1
                }

            }
        }
    }
}




