package br.com.estudos.concessionaire.template

val addressHome1 = AddressHome(
    "Rua Milton Nascimento",
    121,
    "Jd silva",
    "Osasco",
    "São Paulo",
    "00000-000"
)

val addressHome2 = AddressHome(
    "Rua Djavan",
    121,
    "Jd Arte",
    "Osasco",
    "São Paulo",
    "00000-000"
)
val addressHome3 = AddressHome(
    "Rua Mano Brown",
    121,
    "Capão Redondo",
    "Osasco",
    "São Paulo",
    "00000-000"
)
val addressHome4 = AddressHome(
    "Rua Djonga",
    121,
    "Jd Leal",
    "Osasco",
    "São Paulo",
    "00000-000"
)
val client1 = Client(
    "Kevin Richard",
    20,
    addressHome1,
    "111.111.111-11",
    cars = listOf(suv1)
)

val client2 = Client(
    "Silvio Almeida",
    23,
    addressHome2,
    "222.222.222-22",
    cars = listOf(suv2)
)

val client3 = Client(
    "Malcom x",
    42,
    addressHome3,
    "333.333.333-33",
    cars = listOf(suv3)
)

val client4 = Client(
    "Muhammed Ali",
    44,
    addressHome4,
    "000.000.000-00",
    cars = listOf(suv4, suv5)
)


val listClients: List<Client> = listOf(client1, client2, client3, client4)