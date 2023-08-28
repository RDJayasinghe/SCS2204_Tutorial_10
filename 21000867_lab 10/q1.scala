object q1{
    def main(args: Array[String]): Unit={
    val input = List(0.0, 10.0, 20.0, 30.0)
    var avg = calculatetAvg(input)
    println(avg)
}
    def calculatetAvg(temperature: List[Double]): Double={
        val fahrenheitTemperatures = temperature.map(celsius => (celsius*9/5)+32)
        val totalFahrenheit = fahrenheitTemperatures.reduce(_+_)
        val averageFahrenheit = totalFahrenheit/temperature.length.toDouble
        averageFahrenheit
    }
}



