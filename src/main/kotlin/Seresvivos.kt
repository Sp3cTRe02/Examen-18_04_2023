open class Seresvivos {
    var esperanzaVida = 120
    open var edad = 0
    open var indice_inteligencia = 0
    open var fuerza = 0
    constructor()
    constructor(edad : Int, indice_inteligencia : Int , fuerza : Int){
        this.edad = edad
        this.indice_inteligencia = indice_inteligencia
        this.fuerza = fuerza
    }
    fun calcularEspezanzaVida(){
        esperanzaVida =- edad
    }
    fun decirEsperanzaVida(){
        calcularEspezanzaVida()
        if(esperanzaVida == 0){
            println("....")
            println("'Piensas: No responde parece que ha muerto'")
        }else if (esperanzaVida > 20){
           println("¡Hola! ¿Me preguntas cuanto tiempo me queda?")
           println("Jajaja, no te preocupes, me siento lleno de vida")
       }else if (esperanzaVida <= 5 ){
           println("Me siento muy debil amigo, creo que estoy al borde de mi muerte")
       }
    }

    override fun toString(): String {
        return "Seresvivos(esperanzaVida=$esperanzaVida, edad=$edad, indice_inteligencia=$indice_inteligencia, fuerza=$fuerza)"
    }

}