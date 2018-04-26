object Acronym{
    fun generate(phrase: String): String {
        var count = 0
        var acronym = phrase.substring(0,1);
        while(count < phrase.length) {
            if (phrase.substring(count, count + 1) == " " || phrase.substring(count,count+1) == "-") {
                acronym += phrase.substring(count + 1, count + 2).toUpperCase()
            }
            count++
        }
        return acronym
    }
}