fun main() {
   printFinalTemperature(27.0, "Celsius", "Fahrenheit", ::celsiusToFahrenheit)
   printFinalTemperature(350.0, "Kelvin", "Celsius", ::kelvinToCelsius)
   printFinalTemperature(10.0, "Fahrenheit", "Kelvin", ::fahrenheitToKelvin)
}

fun celsiusToFahrenheit(initialTemp: Double): Double {
    return ((9.0 / 5.0) * initialTemp) + 32
}

fun kelvinToCelsius(initialTemp: Double): Double {
    return initialTemp - 273.15
}

fun fahrenheitToKelvin(initialTemp: Double): Double {
    return (initialTemp + 459.67) * (5.0/9.0)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
