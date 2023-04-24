// Jaime Rafael Fraile Bautista
fun main(args: Array<String>) {
  var sigueBucle = true
    while (sigueBucle ){
        var int1 = (1..100).random()
        var int2 = (1..100).random()
        println("Los numeros son $int1 y $int2")
        if(Conversion.divisible(int1, int2)){
            sigueBucle = false
        }

    }
}