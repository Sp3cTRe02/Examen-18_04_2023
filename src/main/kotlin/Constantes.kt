class Constantes {
    companion object{
        // constantes para la conexion a la base de datos
        val url= "jdbc:mysql://localhost/examen2"
        val user= "root"
        val password = ""
        val forname = "com.mysql.cj.jdbc.Driver"


        // consulta la tabla de guerreras
        val guerreras_sql_select = "SELECT * FROM `guerreras` WHERE ID BETWEEN ? and ?"
        // constantes para selecciona si una tarea es de fuerza o no 1 = No || 2 = Si
        val Fuerza = 2

    }
}