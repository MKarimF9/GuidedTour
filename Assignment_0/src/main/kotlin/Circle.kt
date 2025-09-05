class Circle (_name : String, radius : Double) : Shape(_name){

    var radius : Double = radius
    fun setDimensions(_radius : Double){
        radius = _radius
    }

    fun printDimension (){
        println("Radius: $radius")
    }

    override fun getArea() : Double{
        return Math.PI * radius * radius
    }
}