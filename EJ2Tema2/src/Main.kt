fun main() {
    println("""
        |Crea un programa en Java que solicite al usuario la introducción de una cadena
        |de caracteres y devuelva esta cadena invertida. Convierte la cadena resultante
        |en mayúsculas.
        """.trimMargin()
    )
    var cadena = dimeDato()
    var inverso = inverso(cadena)
    println(inverso)
    var inversoFor = inversoFor(cadena)
    println()
    var inversoWhile = inversoWhile(cadena)
    println()
    var mayus = conversionMayus(cadena)

    val sb  = StringBuilder(cadena)
    val cadenaInvertida= sb.reversed()
    println(cadenaInvertida)


}
fun dimeDato():String{
    println("Introduce una cadena de texto")
    return readln()
}

fun inverso(cadena:String):String{
     var inverso:String = "La cadena invertida es: ${(cadena.reversed())}"
    return inverso
}
fun inversoFor(cadena:String) {
    for (i in cadena.length - 1 downTo 0) {
        print(cadena[i] + " ")
    }
}
fun inversoWhile(cadena: String){
    var char = cadena.length-1
    while (char>=0){
        print(cadena[char] + " ")
        char--
    }
}
fun conversionMayus(cadena: String){
    println(cadena.uppercase())
}

