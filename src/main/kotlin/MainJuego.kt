import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.Exception

// Jaime Rafael Fraile Bautista
fun main(){
    val GuerrerasDAO = GuerrerasDAOImpl()
    var guerreras = ArrayList<Guerreras>()
    var guerrerasUsadas = 0
    var Y : Int = 0
    println("Cuantas caras quieres que tenga tu dado")
    val caras = readln().toInt()
    var NGuerreras = 0
    val dado = Dado(caras)
    Y = dado.decirTirada()
    NGuerreras = dado.decirTirada()


    var j = 0
    while (j < Y){
        val juego = Tablero(NGuerreras)
        if (guerrerasUsadas == 0){
            guerreras = GuerrerasDAO.selectMaxCantGuerreras(1, (NGuerreras*2))
            guerrerasUsadas = guerreras.size
        } else{
            guerreras = GuerrerasDAO.selectMaxCantGuerreras(guerrerasUsadas, (guerrerasUsadas + (NGuerreras*2)))
        }
        juego.asignarGuerreras(guerreras)
        juego.creartareas()
            juego.jugar()
        j++
    }

    val file = File("./Ganadores.txt")
    val lineas = file.readLines()
    for (linea in lineas){
        println(linea)
    }


}