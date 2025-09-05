fun main(args: Array<String>) {

    println("height for square: ")
    val height = readLine()!!.toDouble()
    println("length for square: ")
    val length = readLine()!!.toDouble()

    val square = Square("Square", length, height)
    square.printDimensions()
    println("Area of square: ${square.getArea()}")

    println("radius for circle: ")
    val radius = readLine()!!.toDouble()
    val circle = Circle("Circle", radius)
    circle.printDimension()
    println("Area of circle: ${circle.getArea()}")

    println("side for equilateral triangle: ")
    val side = readLine()!!.toDouble()
    val equilateralTriangle = EquilateralTriangle("Equilateral Triangle", side)
    equilateralTriangle.printDimensions()
    println("Area of equilateral triangle: ${equilateralTriangle.getArea()}")

    println("side one for triangle: ")
    val side_one = readLine()!!.toDouble()
    println("side two for triangle: ")
    val side_two = readLine()!!.toDouble()
    println("side three for triangle: ")
    val side_three = readLine()!!.toDouble()
    val triangle = Triangle("Triangle", side_one, side_two, side_three)
    triangle.printDimensions()
    println("Area of triangle: ${triangle.getArea()}")



}