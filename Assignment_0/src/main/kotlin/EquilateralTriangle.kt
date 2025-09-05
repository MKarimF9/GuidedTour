class EquilateralTriangle (_name : String, side : Double ) : Triangle(_name, side, side, side) {

    fun setDimensions(_side : Double){
        side_one = _side
        side_two = _side
        side_three = _side
    }

    override fun printDimensions(){
        println("Side: $side_one")
    }

    override fun getArea() : Double = (Math.sqrt(3.0)/4) * side_one * side_one
}