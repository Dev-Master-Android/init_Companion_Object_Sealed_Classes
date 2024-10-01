fun selectedMenu(): Coffee {
    println("Выберите кофе:\n1. Americano\n2. Cappuccino\n3. Latte")
    val coffeeType = readln().toInt()

    println("Количество сахара:")
    val sugar = readln().toInt()

    println("Объем кофе:")
    val volume = readln().toDouble()

    return when (coffeeType) {
        Coffee.AMERICANO -> Coffee.Americano(sugar, volume)
        Coffee.CAPPUCCINO -> {
            println("Количество молока:")
            val milk = readln().toDouble()
            Coffee.Cappuccino(sugar, volume, milk)
        }
        Coffee.LATTE -> Coffee.Latte(sugar, volume)
        else -> throw IllegalArgumentException("Неверный выбор")
    }
}