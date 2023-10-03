fun main() {
    val age = 20
    val layers = 5
    
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printCakeCandles(age: Int){
    repeat(age){
        print(",")
    }
    println()
    repeat(age){
        print("|")
    }
    println()
}

fun printCakeTop(age: Int){
    repeat(age){
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int){
    repeat(layers){
        repeat(age){
            print("@")
        }
        println()
    }
}
