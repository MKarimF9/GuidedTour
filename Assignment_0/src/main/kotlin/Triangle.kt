open class Triangle(_name : String, side_one : Double, side_two : Double, side_three : Double) : Shape(_name) {

    var side_one : Double = side_one
    var side_two : Double = side_two
    var side_three : Double = side_three

    fun setDimensions(_side_one : Double, _side_two : Double, _side_three : Double){
        side_one = _side_one
        side_two = _side_two
        side_three = _side_three
    }
     override fun printDimensions(){
        println("Side one: $side_one, Side two: $side_two, Side three: $side_three")
    }


    override fun getArea() : Double{
        val s = (side_one + side_two + side_three) / 2
        val area = Math.sqrt(s * (s - side_one) * (s - side_two) * (s - side_three))
        return area
    }
}