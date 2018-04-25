fun compute(dnaOne: String, dnaTwo: String): Int {

    if(dnaOne.length != dnaTwo.length) {
        throw IllegalArgumentException("left and right strands must be of equal length.")
        System.exit(0)
    }
    var total = 0
    var tempStrandOne = dnaOne.toList()
    var tempStrandTwo = dnaTwo.toList()
    var end = dnaOne.length-1
    while(end >=0) {
        println(tempStrandOne.get(end))
        println(tempStrandTwo.get(end))
        if (tempStrandOne.get(end) != tempStrandTwo.get(end))
            total++
    end--
    }
    return total
}

fun main(args: Array<String>){

    println(compute("AT", "CT"))
}