package br.com.estudos.concessionaire.test

import br.com.estudos.concessionaire.template.listSuvs
import br.com.estudos.concessionaire.template.printWithMarkersCar

fun main() {

    listSuvs.sortedBy { it.brand }.printWithMarkersCar()
}