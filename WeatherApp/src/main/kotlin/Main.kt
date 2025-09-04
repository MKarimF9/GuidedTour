fun main(args: Array<String>) {
    println("Hello World!")

    val temperature = Temperature()

    println("Temperature in Celsius: ${temperature.getTemp(TempType.CELSIUS)}")
}