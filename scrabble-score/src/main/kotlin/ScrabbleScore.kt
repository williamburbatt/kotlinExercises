object ScrabbleScore {

    fun scoreWord(word: String): Int {
        var score = 0
        var letters = word.length
        for (i in 0 until letters) {
            when (word.substring(i, i + 1).toUpperCase()) {
                "A", "E", "I", "O", "U", "L", "N", "R", "S", "T" -> score += 1
                "D", "G" -> score += 2
                "B", "C", "M", "P" -> score += 3
                "F", "H", "V", "W", "Y" -> score += 4
                "K" -> score += 5
                "J", "X" -> score += 8
                "Q", "Z" -> score += 10

            }

        }
        return score

    }

}