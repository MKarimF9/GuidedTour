class Temperature {

    private var currentTemperature: Double = 0.0

    fun getTemp(type: TempType) = when (type) {
        TempType.CELSIUS -> getTempINCelsius()
        TempType.FAHRENHEIT -> getTempInFar()
        TempType.KELVIN -> getTempInKelvin(currentTemperature)

    }


   private fun getTempINCelsius() = currentTemperature - 273.15

    private fun getTempInFar(): Double = (currentTemperature -32) * 5/9

    private fun getTempInKelvin(temp: Double) = currentTemperature


}