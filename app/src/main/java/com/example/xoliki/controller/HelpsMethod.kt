package com.example.xoliki.controller

open class HelpsMethod {

    open fun notWiner(arrXO: CharArray): Boolean {
        if (arrXO[0] !== ' ' && arrXO[1] !== ' ' && arrXO[2] !== ' ' && arrXO[3] !== ' ' &&
            arrXO[4] !== ' ' && arrXO[5] !== ' ' && arrXO[6] !== ' ' && arrXO[7] !== ' ' && arrXO[8] !== ' ') {
            return true
        } else {
            return false
        }
    }

    open fun checkXO(arrXO: CharArray, position: Int, simba: Char): Boolean {
        var tf = true
        when (position) {
            0 -> {
                if (arrXO[0] == simba && arrXO[1] == simba && arrXO[2] == simba) {
                    tf = false
                } else if (arrXO[0] == simba && arrXO[3] == simba && arrXO[6] == simba) {
                    tf = false
                } else if (arrXO[0] == simba && arrXO[4] == simba && arrXO[8] == simba) {
                    tf = false
                } else {
                    tf = true
                }
            }
            1 -> {
                if (arrXO[0] == simba && arrXO[1] == simba && arrXO[2] == simba) {
                    tf = false
                } else if (arrXO[1] == simba && arrXO[4] == simba && arrXO[7] == simba) {
                    tf = false
                } else {
                    tf = true
                }
            }
            2 -> {
                if (arrXO[0] == simba && arrXO[1] == simba && arrXO[2] == simba) {
                    tf = false
                } else if (arrXO[2] == simba && arrXO[5] == simba && arrXO[8] == simba) {
                    tf = false
                } else if (arrXO[2] == simba && arrXO[4] == simba && arrXO[6] == simba) {
                    tf = false
                } else {
                    tf = true
                }
            }
            3 -> {
                if (arrXO[0] == simba && arrXO[3] == simba && arrXO[6] == simba) {
                    tf = false
                } else if (arrXO[3] == simba && arrXO[4] == simba && arrXO[5] == simba) {
                    tf = false
                } else {
                    tf = true
                }
            }
            4 -> {
                if (arrXO[3] == simba && arrXO[4] == simba && arrXO[5] == simba) {
                    tf = false
                } else if (arrXO[1] == simba && arrXO[4] == simba && arrXO[7] == simba) {
                    tf = false
                } else if (arrXO[0] == simba && arrXO[4] == simba && arrXO[8] == simba) {
                    tf = false
                } else if (arrXO[2] == simba && arrXO[4] == simba && arrXO[6] == simba) {
                    tf = false
                } else {
                    tf = true
                }
            }
            5 -> {
                if (arrXO[2] == simba && arrXO[5] == simba && arrXO[8] == simba) {
                    tf = false
                } else if (arrXO[3] == simba && arrXO[4] == simba && arrXO[5] == simba) {
                    tf = false
                } else {
                    tf = true
                }
            }
            6 -> {
                if (arrXO[2] == simba && arrXO[4] == simba && arrXO[6] == simba) {
                    tf = false
                } else if (arrXO[6] == simba && arrXO[3] == simba && arrXO[0] == simba) {
                    tf = false
                } else if (arrXO[6] == simba && arrXO[7] == simba && arrXO[8] == simba) {
                    tf = false
                } else {
                    tf = true
                }
            }
            7 -> {
                if (arrXO[6] == simba && arrXO[7] == simba && arrXO[8] == simba) {
                    tf = false
                } else if (arrXO[1] == simba && arrXO[4] == simba && arrXO[7] == simba) {
                    tf = false
                } else {
                    tf = true
                }
            }
            8 -> {
                if (arrXO[0] == simba && arrXO[4] == simba && arrXO[8] == simba) {
                    tf = false
                } else if (arrXO[2] == simba && arrXO[5] == simba && arrXO[8] == simba) {
                    tf = false
                } else if (arrXO[6] == simba && arrXO[7] == simba && arrXO[8] == simba) {
                    tf = false
                } else {
                    tf = true
                }
            }

        }
        return tf
    }


}