class Guerreras : Mujeres {
    override var nombre = ""
    override var edad = 0
    override var indice_inteligencia = 0
    override var fuerza = 0
    var serieUtensilios = ArrayList<String>()
    var animales = ArrayList<Animal>()
    constructor()
    constructor(nombre : String, edad : Int, indice_inteligencia : Int, fuerza : Int) {
        this.nombre = nombre
        this.edad = edad
        this.indice_inteligencia = indice_inteligencia
        this.fuerza = fuerza
    }
    override fun analizarTarea(tarea: Tarea) : Boolean {
        var resuelve = false
        if (tarea.cantidadFuerza == 0) {
            println("Como guerrera no me puedo encargar de esta tarea, no es de fuerza")
            resuelve = false
        } else {
            println("Dejame analizar la tarea")
            if (edad >= tarea.edadMinima && indice_inteligencia >= tarea.gradoResolucion && fuerza >= tarea.cantidadFuerza) {
                println("Puedo hacer esta tarea, yo me encargo")
                resuelve = true
            } else {
                println("Lo siento esta no es una tarea adecuada para mi")
                resuelve = false
            }
        }
        return  resuelve
    }
    private fun comprobaranimal(): Boolean{
        if(animales.size > 0){
            return true
        }else return false
    }
    fun sumarfuerza(){
        if (comprobaranimal()){
            for (i in 0 .. animales.size){
                animales[i].ahorasitieneduenio()
                this.fuerza += animales[i].fuerza
            }
        }
    }
    fun decirCantAnimales(){
        println("Tengo ${animales.size} animales")
    }

    override fun toString(): String {
        return "Guerreras(nombre='$nombre', edad=$edad, indice_inteligencia=$indice_inteligencia, fuerza=$fuerza, serieUtensilios=$serieUtensilios, animales=$animales)"
    }

}