package br.com.estudos.concessionaire.template

data class Concessionaire(
    val address: AddressCommercial,
    val cars: List<Car>,
    val client: List<People>
)