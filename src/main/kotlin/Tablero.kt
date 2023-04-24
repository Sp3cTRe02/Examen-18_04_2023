import java.io.File
import java.io.FileWriter
import java.io.PrintWriter
import java.nio.file.Files
import java.nio.file.Paths

class Tablero {
    var cantGuerreras = 0
    var equipo1 = ArrayList<Guerreras>()
    var equipo2 = ArrayList<Guerreras>()
    var retosNecesarios = cantGuerreras
    var tareas = ArrayList<Tarea>()
    constructor()
    constructor(cantGuerreras: Int){
        this.cantGuerreras = cantGuerreras
    }

    fun crearArchivoganadores(){
        val ruta = Paths.get("Ganadores.txt")
        Files.createFile(ruta)
    }
    fun comprobarqueexiteGanadores(){
        val ganadores = "Ganadores.txt"
        var g = File(ganadores)
        if (!(g.exists())){
            crearArchivoganadores()
        }
    }
    fun escribir(text: String){
        val ruta = "./Ganadores.txt"
        val fw = FileWriter(ruta, true)
        fw.write(text)
        fw.write("\n")
        val salida = PrintWriter(fw)
        salida.flush()
        salida.close()
    }

    fun asignarGuerreras(Guerreras: ArrayList<Guerreras>){
        var i = 0
        var guerrerasTotales = cantGuerreras*2
        while (i < cantGuerreras){
            equipo1.add(Guerreras[i])
            i++
        }
        while (i <= guerrerasTotales){
            equipo2.add(Guerreras[i])
        }
    }

    fun creartareas(){
      var i = 0
        while (i < retosNecesarios){
            try {
                tareas.add(FactoriaTarea.devolverUnaTarea())
            }catch (e : IllegalArgumentException){
                println("Se ha creado una tarea no valida")
            }finally {
                i++
            }
        }
    }
    fun comprobarsiguerrerapasaprueba(guerreras: Guerreras, tarea : Tarea): Boolean{
        var resuelve = false
        if (guerreras.analizarTarea(tarea)){
            resuelve = true
        }else {
            resuelve = false
        }
        return resuelve
    }
    fun cantidadtareas(): Int{
        return tareas.size
    }
    fun jugar(){
        comprobarqueexiteGanadores()
        for (i in 1 .. cantidadtareas()){
            println("Turno del equipo 1")
            println("Se va a enfrentar a la tarea ${tareas[i]} la guerrera ${equipo1[i].nombre}")
            if(comprobarsiguerrerapasaprueba(equipo1[i], tareas[i])){
                escribir("La guerrera ${equipo1[i].nombre} ha sido capaz de resolver la tarea ")
            }

            println("Turno del equipo 1")
            println("Se va a enfrentar a la tarea ${tareas[i]} la guerrera ${equipo2[i].nombre}")
            comprobarsiguerrerapasaprueba(equipo2[i], tareas[i])
            if(comprobarsiguerrerapasaprueba(equipo2[i], tareas[i])){
                escribir("La guerrera ${equipo2[i].nombre} ha sido capaz de resolver la tarea ")
            }
        }
    }



}