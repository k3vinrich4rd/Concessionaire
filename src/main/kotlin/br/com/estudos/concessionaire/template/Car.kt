package br.com.estudos.concessionaire.template

abstract class Car(
    val name: String,
    val color: String,
    val plateNumber: String,
    val model: String,
    val brand: String? = null,
    val amountOfPorts: Int,
    val amountOfWindows: Int
)