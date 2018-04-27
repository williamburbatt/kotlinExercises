class Squares(num: Int) {
    val inNum = num
    fun squareOfSum(): Int {
        var tempNum = inNum
        var sum = 0
        while (tempNum > 0) {
            sum += tempNum
            tempNum--
        }
        sum *= sum
        return sum

    }

    fun sumOfSquares(): Int {
        var tempNum = inNum
        var sum = 0
        while (tempNum > 0) {
            sum += tempNum * tempNum
            tempNum--
        }

        return sum
    }

    fun difference(): Int {
        var diff = squareOfSum() - sumOfSquares()
        return diff
    }

}