package br.com.estudos.concessionaire.template

abstract class Address(
    var publicPlace: String = "",
    var number: Int = 0,
    var neighborhood: String = "",
    var city: String = "",
    var state: String = "",
    var cep: String = "",
    var complement: String = ""
)