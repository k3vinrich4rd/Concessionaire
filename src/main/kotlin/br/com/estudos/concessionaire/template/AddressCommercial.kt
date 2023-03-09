package br.com.estudos.concessionaire.template

class AddressCommercial(
    publicPlace: String = "",
    number: Int = 0,
    neighborhood: String = "",
    city: String = "",
    state: String = "",
    cep: String = "",
    complement: String = ""
) : Address(
    publicPlace = publicPlace,
    number = number,
    neighborhood = neighborhood,
    city = city,
    state = state,
    cep = cep,
    complement = complement
)