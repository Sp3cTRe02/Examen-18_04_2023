class Tarea {
    var tipo = 0
    var gradoResolucion = 0
    var edadMinima = 0
    var cantidadFuerza = 0
    constructor()
    constructor(tipo : Int, gradoResolucion : Int, edadMinima : Int){
        this.tipo = tipo
        this.gradoResolucion = gradoResolucion
        this.edadMinima = edadMinima
    }
    constructor(tipo : Int, gradoResolucion : Int, edadMinima : Int, cantidadFuerza : Int){
        this.tipo = tipo
        this.gradoResolucion = gradoResolucion
        this.edadMinima = edadMinima
        this.cantidadFuerza = cantidadFuerza
    }
}