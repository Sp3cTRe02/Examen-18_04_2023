class Animal : Seresvivos{
   override var fuerza = 0
    var tieneDuenio = false
    constructor()
    constructor(fuerza : Int){
        this.fuerza = fuerza
    }
    fun ahorasitieneduenio(){
        tieneDuenio = true
    }

    override fun toString(): String {
        return "Animal(fuerza=$fuerza, tieneDuenio=$tieneDuenio)"
    }

}