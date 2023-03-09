package br.com.estudos.concessionaire.test


import br.com.estudos.concessionaire.template.*

fun main() {
    val addressCommercial = AddressCommercial(
        "Rua Icaro Silva",
        121,
        "Jd Ipiranga",
        "Osasco",
        "São Paulo",
        "00000-000",
        "Concessionaria"
    )
    val concessionaire1 = Concessionaire(addressCommercial, listSuvs, listClients)
    concessionaire1.printWithMarkersConcessionaireCar()


}