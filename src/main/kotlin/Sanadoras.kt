class Sanadoras : Mujeres {
    override var nombre = ""
    override var edad = 0
    override var indice_inteligencia = 0

    constructor()
    constructor(nombre : String, edad : Int, indice_inteligencia: Int){
        this.nombre = nombre
        this.edad = edad
        this.indice_inteligencia = indice_inteligencia
    }

    fun curar (seresvivos: Seresvivos){
        seresvivos.calcularEspezanzaVida()
        println("Descansa un rato y repon tu energia")
        seresvivos.esperanzaVida ++
        Thread.sleep(100)
        println("Listo te has recuperado")
    }
    override fun analizarTarea(tarea: Tarea) : Boolean{
        var resuelve = false
        if (tarea.cantidadFuerza > 0){
            println("Lo siento, esta tarea es para una guerrera")
            resuelve = false
        }else {
            if (edad >= tarea.edadMinima && indice_inteligencia >= tarea.gradoResolucion) {
                println("Puedo hacer esta tarea, yo me encargo")
                resuelve = true
            } else {
                println("Lo siento esta no es una tarea adecuada para mi")
                resuelve = false
            }
        }
        return resuelve
    }

    override fun toString(): String {
        return "Sanadoras(nombre='$nombre', edad=$edad, indice_inteligencia=$indice_inteligencia)"
    }

}