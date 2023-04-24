class Dado {
    var nCaras = 0
    private var resultados = ArrayList<Int>()
    private var vecestirado = 0
    companion object{
        var dadostirados = 0
        fun dadosTirados (){
            println("Los dados se han tirado $dadostirados veces")
        }
    }
    constructor()
    constructor(caras : Int){
        this.nCaras = caras
    }
/*    private fun calcularEstadistica(){
        var repetir = 1000
        var cara : Int
        var size = nCaras - 1

    }*/
    private fun hacerTirada(): Int{
        return (1..nCaras).random()
    dadostirados ++
    vecestirado ++
    }
    fun decirTirada(): Int{
        println("............................")
        println("Se esta haciendo una tirada")
        println("............................")
        Thread.sleep(100)
        var tirada = hacerTirada()
        resultados.add(tirada)
        println("El numero que ha salido ha sido el $tirada")
        return tirada
    }
    fun rondaTiradas(numTiradas : Int){
        println("Se va a realizar $numTiradas tiradas")
        var ronda = ArrayList<Int>()
        for (i in 1 .. numTiradas){
            ronda.add(hacerTirada())
        }
        println("Los numeros que han salido son :")
        for (i in 0 .. (ronda.size-1)){
            println("${ronda[i]}")
        }
    }
    fun decirHistorico(){
        println("Los resultados de este dado han sido los siguientes:")
        for (i in 0 .. resultados.size){
            print("${resultados[i]}, ")
            if (i % 5 == 0){
                println()
            }
        }
    }
    fun vecesTirado(){
        if (vecestirado == 1){
            println("El dado se ha tirado $vecestirado sola vez")
        }else {
            println("El dado ha sido tirado $vecestirado veces")
        }
    }

}