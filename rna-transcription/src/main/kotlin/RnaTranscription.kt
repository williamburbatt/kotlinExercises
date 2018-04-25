fun transcribeToRna(dna: String): String {
    var fin = "";
    var temp = dna
    var finlength = temp.length
    while(finlength > 0) {
        when (temp.substring(0, 1)) {
            "G" -> fin = fin + "C"
            "C" -> fin = fin + "G"
            "T" -> fin = fin + "A"
            "A" -> fin = fin + "U"
            else -> {
                "Invalid Letter"
            }

        }
        if(temp.length > 1)
        temp = temp.substring(1)
        else
            break
    }
    return fin
}

fun main(args : Array<String>) {
    var fin = transcribeToRna("ACGTGGTCTTAA")
    println(fin)
}
