package br.com.estudos.concessionaire.template

class Client(
    name: String,
    age: Int,
    addressHome: AddressHome,
    cpf: String,
    val cars: List<Car>

) : People(
    name = name,
    age = age,
    addressHome = addressHome,
    cpf = cpf

)