class Square(_name : String, length : Double, heigth : Double) : Shape(_name) {

    var length : Double = length
    var height : Double = heigth

    fun setDimensions(_length : Double, _height : Double){
        length = _length
        height = _height
    }

    override fun getArea() : Double{
        return length * height
    }

}