
object Raindrops{

    fun convert(num: Int): String{
        var droptop = ""
        if(num%3 == 0)
            droptop += "Pling"

        if(num%5 == 0)
            droptop+="Plang"
        if(num%7 ==  0)
            droptop+="Plong"
        if(droptop == "")
            return "" + num
        return droptop

    }
}