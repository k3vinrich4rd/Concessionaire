package br.com.estudos.concessionaire.template

class Suv(
    name: String,
    color: String,
    plateNumber: String,
    model: String,
    amountOfPorts: Int,
    amountOfWindows: Int,
    brand: String?
) : Car(
    name = name,
    color = color,
    plateNumber = plateNumber,
    model = model,
    amountOfPorts = amountOfPorts,
    amountOfWindows = amountOfWindows,
    brand = brand

)