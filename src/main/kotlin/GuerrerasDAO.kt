interface GuerrerasDAO {
    fun selectMaxCantGuerreras(min : Int, max:Int): ArrayList<Guerreras>
}