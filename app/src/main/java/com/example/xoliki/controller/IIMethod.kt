package com.example.xoliki.controller

import kotlin.random.Random

class IIMethod {

    fun List<Int>.randomElement() :Int {
        return   this[Random.nextInt(this.size)]
    }


    fun checkII   (arrXO: CharArray, position: Int , sim : Char) : Int  {
        var tf = -1
        when (position) {
            0 -> {
                if (arrXO[0] == sim && arrXO[1] == sim&& arrXO[2] == ' ')  {tf = 2}
                else if (arrXO[0] == sim&&arrXO[3] == sim&& arrXO[6] == ' ')  {tf = 6}
                else if (arrXO[0] == sim &&arrXO[2] == sim&& arrXO[1] == ' ') {tf = 1}
                else if (arrXO[0] == sim &&arrXO[6] == sim&& arrXO[3] == ' ') {tf = 3}
                else if (arrXO[0] == sim &&arrXO[4] == sim&& arrXO[8] == ' ') {tf = 8}
                else if (arrXO[0] == sim &&arrXO[8] == sim&& arrXO[4] == ' ') {tf = 4}
                else   if (arrXO[5]==' '&& arrXO[7]==' '){
                    var f= listOf(5,7)
                    tf = f.randomElement()}
                else if (arrXO[5]==' ') {tf =5}
                else if (arrXO[7]==' '){tf =7}
                else  {
                    var f = mutableListOf(1)
                    var sh =0
                    arrXO.forEach { if (it ==' ') {f.add(sh)}
                        sh++}
                    f.removeAt(0)
                    tf = f.randomElement()
                }

            }
            1-> {
                if (arrXO[1] == sim && arrXO[0] == sim&& arrXO[2] == ' ')  {tf = 2}
                else if (arrXO[1] == sim&&arrXO[2] == sim&& arrXO[0] == ' ')  {tf = 0}
                else if (arrXO[1] == sim &&arrXO[4] == sim&& arrXO[7] == ' ') {tf = 7}
                else if (arrXO[1] == sim &&arrXO[7] == sim&& arrXO[4] == ' ') {tf = 4}
                else   if (arrXO[5]==' '&& arrXO[3]==' '&& arrXO[6]==' '&& arrXO[8]==' '){
                    var f= listOf(3,5,6,8)
                    tf = f.randomElement()}
                else  if (arrXO[8]==' ') {tf =8}
                else  if (arrXO[3]==' ') {tf =3}
                else  if (arrXO[5]==' ') {tf =5}
                else  if (arrXO[6]==' ') {tf =6}
                else  {
                    var f = mutableListOf(1)
                    var sh =0
                    arrXO.forEach { if (it ==' ') {f.add(sh)}
                        sh++}
                    f.removeAt(0)
                    tf = f.randomElement()
                }
            }
            2-> {
                if (arrXO[2] == sim && arrXO[0] == sim&& arrXO[1] == ' ')  {tf = 1}
                else if (arrXO[2] == sim&&arrXO[1] == sim&& arrXO[0] == ' ')  {tf = 0}
                else if (arrXO[2] == sim &&arrXO[5] == sim&& arrXO[8] == ' ') {tf = 8}
                else if (arrXO[2] == sim &&arrXO[8] == sim&& arrXO[5] == ' ') {tf = 5}
                else if (arrXO[2] == sim &&arrXO[4] == sim&& arrXO[6] == ' ') {tf = 6}
                else if (arrXO[2] == sim &&arrXO[6] == sim&& arrXO[4] == ' ') {tf = 4}
                else  if (arrXO[3]==' '&& arrXO[7]==' '){
                    var f= listOf(3,7)
                    tf = f.randomElement()}
                else if (arrXO[3]==' ') {tf =3}
                else if (arrXO[7]==' '){tf =7}
                else  {
                    var f = mutableListOf(1)
                    var sh =0
                    arrXO.forEach { if (it ==' ') {f.add(sh)}
                        sh++}
                    f.removeAt(0)
                    tf = f.randomElement()
                }

            }
            3-> {
                if (arrXO[3] == sim && arrXO[0] == sim&& arrXO[6] == ' ')  {tf = 6}
                else if (arrXO[3] == sim&&arrXO[6] == sim&& arrXO[0] == ' ')  {tf = 0}
                else if (arrXO[3] == sim &&arrXO[4] == sim&& arrXO[5] == ' ') {tf = 5}
                else if (arrXO[3] == sim &&arrXO[5] == sim&& arrXO[4] == ' ') {tf = 4}
                else if (arrXO[1]==' '&& arrXO[2]==' '&& arrXO[7]==' '&& arrXO[8]==' '){
                    var f= listOf(1,2,7,8)
                    tf = f.randomElement()}
                else  if (arrXO[8]==' ') {tf =8}
                else  if (arrXO[1]==' ') {tf =1}
                else  if (arrXO[2]==' ') {tf =2}
                else  if (arrXO[7]==' ') {tf =7}
                else  {
                    var f = mutableListOf(1)
                    var sh =0
                    arrXO.forEach { if (it ==' ') {f.add(sh)}
                        sh++}
                    f.removeAt(0)
                    tf = f.randomElement()
                }
            }
            4-> {
                if (arrXO[4] == sim && arrXO[1] == sim&& arrXO[7] == ' ')  {tf = 7}
                else if (arrXO[4] == sim&&arrXO[7] == sim&& arrXO[1] == ' ')  {tf = 1}
                else if (arrXO[4] == sim &&arrXO[3] == sim&& arrXO[5] == ' ') {tf = 5}
                else if (arrXO[4] == sim &&arrXO[5] == sim&& arrXO[3] == ' ') {tf = 3}
                else if (arrXO[4] == sim &&arrXO[0] == sim&& arrXO[8] == ' ') {tf = 8}
                else if (arrXO[4] == sim &&arrXO[8] == sim&& arrXO[0] == ' ') {tf = 0}
                else if (arrXO[4] == sim &&arrXO[2] == sim&& arrXO[6] == ' ') {tf = 6}
                else if (arrXO[4] == sim &&arrXO[6] == sim&& arrXO[2] == ' ') {tf = 2}
                else  {
                    var f = mutableListOf(1)
                    var sh =0
                    arrXO.forEach { if (it ==' ') {f.add(sh)}
                        sh++}
                    f.removeAt(0)
                    tf = f.randomElement()
                }
            }
            5-> {
                if (arrXO[5] == sim && arrXO[2] == sim&& arrXO[8] == ' ')  {tf = 8}
                else if (arrXO[5] == sim&&arrXO[8] == sim&& arrXO[2] == ' ')  {tf = 2}
                else if (arrXO[5] == sim &&arrXO[4] == sim&& arrXO[3] == ' ') {tf = 3}
                else if (arrXO[5] == sim &&arrXO[3] == sim&& arrXO[4] == ' ') {tf = 4}
                else  if (arrXO[1]==' '&& arrXO[6]==' '&& arrXO[7]==' '){
                    var f= listOf(1,7,6)
                    tf = f.randomElement()}
                else  if (arrXO[6]==' ') {tf =6}
                else  if (arrXO[1]==' ') {tf =1}
                else  if (arrXO[7]==' ') {tf =7}
                else  {
                    var f = mutableListOf(1)
                    var sh =0
                    arrXO.forEach { if (it ==' ') {f.add(sh)}
                        sh++}
                    f.removeAt(0)
                    tf = f.randomElement()
                }

            }
            6-> {
                if (arrXO[6] == sim && arrXO[3] == sim&& arrXO[0] == ' ')  {tf = 0}
                else if (arrXO[6] == sim&&arrXO[0] == sim&& arrXO[3] == ' ')  {tf = 3}
                else if (arrXO[6] == sim &&arrXO[7] == sim&& arrXO[8] == ' ') {tf = 8}
                else if (arrXO[6] == sim &&arrXO[8] == sim&& arrXO[7] == ' ') {tf = 7}
                else if (arrXO[6] == sim &&arrXO[4] == sim&& arrXO[2] == ' ') {tf = 2}
                else if (arrXO[6] == sim &&arrXO[2] == sim&& arrXO[4] == ' ') {tf = 4}
                else   if (arrXO[1]==' '&& arrXO[5]==' '){
                    var f= listOf(1,5)
                    tf = f.randomElement()}
                else  if (arrXO[1]==' ') {tf =1}
                else  if (arrXO[5]==' ') {tf =5}
                else  {
                    var f = mutableListOf(1)
                    var sh =0
                    arrXO.forEach { if (it ==' ') {f.add(sh)}
                        sh++}
                    f.removeAt(0)
                    tf = f.randomElement()
                }

            }
            7-> {
                if (arrXO[7] == sim && arrXO[6] == sim&& arrXO[8] == ' ')  {tf = 8}
                else if (arrXO[7] == sim&&arrXO[8] == sim&& arrXO[6] == ' ')  {tf = 6}
                else if (arrXO[7] == sim &&arrXO[4] == sim&& arrXO[1] == ' ') {tf = 1}
                else if (arrXO[7] == sim &&arrXO[1] == sim&& arrXO[4] == ' ') {tf = 4}
                else   if (arrXO[0]==' '&& arrXO[2]==' '&& arrXO[3]==' '&& arrXO[5]==' '){
                    var f= listOf(1,2,3,5)
                    tf = f.randomElement()}
                else  if (arrXO[1]==' ') {tf =1}
                else  if (arrXO[5]==' ') {tf =5}
                else  if (arrXO[2]==' ') {tf =2}
                else  if (arrXO[3]==' ') {tf =3}
                else  {
                    var f = mutableListOf(1)
                    var sh =0
                    arrXO.forEach { if (it ==' ') {f.add(sh)}
                        sh++}
                    f.removeAt(0)
                    tf = f.randomElement()
                }

            }
            8-> {
                if (arrXO[8] == sim && arrXO[5] == sim&& arrXO[2] == ' ')  {tf = 2}
                else if (arrXO[8] == sim&&arrXO[2] == sim&& arrXO[5] == ' ')  {tf = 5}
                else if (arrXO[8] == sim &&arrXO[7] == sim&& arrXO[6] == ' ') {tf = 6}
                else if (arrXO[8] == sim &&arrXO[6] == sim&& arrXO[7] == ' ') {tf = 7}
                else if (arrXO[8] == sim &&arrXO[4] == sim&& arrXO[0] == ' ') {tf = 0}
                else if (arrXO[8] == sim &&arrXO[0] == sim&& arrXO[4] == ' ') {tf = 4}
                else   if (arrXO[1]==' '&& arrXO[3]==' '){
                    var f= listOf(1,3)
                    tf = f.randomElement()}
                else  if (arrXO[1]==' ') {tf =1}
                else  if (arrXO[3]==' ') {tf =3}
                else  {
                    var f = mutableListOf(1)
                    var sh =0
                    arrXO.forEach { if (it ==' ') {f.add(sh)}
                        sh++}
                    f.removeAt(0)
                    tf = f.randomElement()
                }

            }

        }
        return tf
    }
}