import kotlinx.coroutines.delay

suspend fun selectMenu(menu: Coffee) {
    println("Приготовление кофе...")
    for (i in 1..10) {
        delay(500L)
        println("${i * 10}%")
    }

    when (menu) {
        is Coffee.Americano ->
            println("Ваш кофе готов: Americano, сахар: ${menu.sugar} ложки, объем: ${menu.volume} грамм")
        is Coffee.Cappuccino ->
            println("Ваш кофе готов: Cappuccino, сахар: ${menu.sugar} ложки, объем: ${menu.volume} грамм, молоко: ${menu.milk} грамм")
        is Coffee.Latte ->
            println("Ваш кофе готов: Latte, сахар: ${menu.sugar} ложки, объем: ${menu.volume} грамм")
    }
}