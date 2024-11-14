fun main() {
    println("introduce una cadena de caracteres y devuelve la cadena Invertida")
    val cadena = dimeCadena()
    val cadenaConvertida = conversionCadena(cadena)
    val cadenaMayuscula = convertirMayusculas(cadenaConvertida)
    println("La cadena introduce invertida en mayusculas seria $cadenaMayuscula")

}
fun dimeCadena():String{
    println("Introduce una cadena de texto")
    return readln()
}
fun conversionCadena(cadena:String):String{
    var cadenaInvertida = ""
    var indice = cadena.length-1
    while (indice>=0){
        cadenaInvertida+=cadena[indice]
        indice --
    }
    return cadenaInvertida
}
fun convertirMayusculas(cadena:String):String{
    return cadena.uppercase()
}