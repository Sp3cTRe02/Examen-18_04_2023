import java.util.Date

class Conversion {
    companion object{

        fun TexttoDate(text : String){
            TODO("no se pasar de string a date")
        }

        fun InttoString(integer : Int): String{
            return integer.toString()
        }
        fun StringtoInt(text : String) : Int {
            return text.toInt()
        }
        fun divisible(int1 : Int, int2 : Int) : Boolean{
            var resultado = int1%int2
            if (resultado== 0){
                return true
            }else return false
        }
    }
}