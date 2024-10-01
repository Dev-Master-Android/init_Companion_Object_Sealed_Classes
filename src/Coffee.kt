sealed class Coffee(val sugar: Int, val volume: Double) {
    init {
        println("Заказ ${this::class.simpleName} принят, ожидайте")
    }

    class Americano(sugar: Int, volume: Double) : Coffee(sugar, volume)
    class Cappuccino(sugar: Int, volume: Double, val milk: Double) : Coffee(sugar, volume)
    class Latte(sugar: Int, volume: Double) : Coffee(sugar, volume)

    companion object {
        const val AMERICANO = 1
        const val CAPPUCCINO = 2
        const val LATTE = 3
    }
}