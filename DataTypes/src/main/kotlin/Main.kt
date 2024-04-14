import java.lang.foreign.SymbolLookup

fun main() {
    val byteMenor : Byte = Byte.MIN_VALUE
    val byteMayor : Byte = Byte.MAX_VALUE
    val shortMenor : Short = Short.MIN_VALUE
    val shortMayor : Short = Short.MAX_VALUE
    val intMenor : Int = Int.MIN_VALUE
    val intMayor : Int = Int.MAX_VALUE
    val longMenor : Long = Long.MIN_VALUE
    val longMayor : Long = Long.MAX_VALUE
    val floatMenor : Float = Float.MIN_VALUE
    val floatMayor : Float = Float.MAX_VALUE
    val doubleMenor : Double = Double.MIN_VALUE
    val doubleMayor : Double = Double.MAX_VALUE
    val unChar :  Char = 'L'
    val unBool : Boolean = true
    val otroBool : Boolean = false

    println("El Byte mas chico es: ${byteMenor}.")
    println("El Byte mas grande es: ${byteMayor}.")
    println("El Short mas chico es: ${shortMenor}.")
    println("El Short mas grande es: ${shortMayor}.")
    println("El Int mas chico es: ${intMenor}.")
    println("El Int mas grande es: ${intMayor}.")
    println("El Long mas chico es: ${longMenor}.")
    println("El Long mas grande es: ${longMayor}.")
    println("El Float mas chico es: ${floatMenor}.")
    println("El Float mas grande es: ${floatMayor}.")
    println("El Double mas chico es: ${doubleMenor}.")
    println("El Double mas grande es: ${doubleMayor}.")
    println("El char unChar = ${unChar}.")
    println("El Boolean unBool = ${unBool}.")
    println("El Boolean otroBool = ${otroBool}.")
}