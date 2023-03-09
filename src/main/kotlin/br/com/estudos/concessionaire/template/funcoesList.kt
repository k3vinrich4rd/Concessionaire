package br.com.estudos.concessionaire.template

fun List<Car>.printWithMarkersCar() {
    val textFormatListCar = this
        .joinToString(separator = "\n") {
            "- Brand: ${it.brand ?: "Brand unknown"}, Color: ${it.color} e Model: ${it.model}"
        }
    println("#### List de cars ####\n$textFormatListCar\n")
}

fun Concessionaire.printWithMarkersConcessionaireCar() {
    val addressCommercial = this.address

    val clientsTextFormat = client.joinToString(separator = "\n") {
        it.name
    }

    val carsTextFormat = cars.joinToString(separator = "\n") {
        "- Brand: ${it.brand ?: "Brand unknown"}, Color: ${it.color} e Model: ${it.model}"
    }
    println(
        "#### Address concessionaire:\nStreet: ${addressCommercial.publicPlace}\n" +
                "Neighborhood:${addressCommercial.neighborhood}\n" + "City: ${addressCommercial.city}\n"
                + "State: ${addressCommercial.state}\n" + "Number: ${addressCommercial.number}\n" + "\nCars: \n$carsTextFormat\n" +
                "\nClients:\n$clientsTextFormat"
    )
}

fun List<Client>.printWithMarkersConcessionaireClients() {
    val listTheClientsAndCars = listClients.joinToString(separator = "\n") {
        "Holder: ${it.name}\nCar(s):" + " ${
            it.cars.joinToString() { car: Car -> //forEach
                "\nName: ${car.name} \nModel: ${car.model}\nBrand: ${car.brand ?: "Brand unknown"}" +
                        "\nColor: ${car.color}\n"
            }
        }"
    }

    println(
        "#### Customer list and their cars ####:\n \n$listTheClientsAndCars\n"
    )

}