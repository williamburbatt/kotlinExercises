fun isPangram(word: String): Boolean {
    var letters = "abcdefghijklmnopqrstuvwxyz"
    var tempWord = word
    tempWord = tempWord.toLowerCase()
    var a  = letters.toList()
    var b = true;
    for(letter in a){
        if(letter !in tempWord){
            b = false
            break
        }
    }
return b;

}
