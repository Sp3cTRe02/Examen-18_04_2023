class GuerrerasDAOImpl: GuerrerasDAO {

    override fun selectMaxCantGuerreras(min : Int ,max: Int) : ArrayList<Guerreras>{
    ConexionBD.conectar()
        val query = Constantes.guerreras_sql_select
        val ps = ConexionBD.getPreparedStatement(query)
        ps?.setInt(1, min,)
        ps?.setInt(2, max)
        val rs = ps?.executeQuery()
        val guerreras = ArrayList<Guerreras>()
       if(rs?.next() == true){
           val guerrera = Guerreras(
               rs.getString("nombre"),
               rs.getInt("edad"),
               rs.getInt("indice_inteligencia"),
               rs.getInt("fuerza")
           )
           guerreras.add(guerrera)
       }
        ps?.close()
        ConexionBD.desconectar()
        return guerreras
}


}
