fun main() {
    println("pedir dos cadenas por teclado y compararlas en: longitud, alfabeticamente y si son iguales")
    val cadena1 = dimeCadena("Introduce la primera cadena")

    val cadena2 = dimeCadena("Introduce la segunda cadena")

    val longitud = longitudCadena(cadena1,cadena2)
    println(longitud)

    if (igual(cadena1,cadena2)){
        println("Las cadenas son iguales")
    }else {
        println("Las cadenas no son iguales")
    }

    if (longitudAlfabetica(cadena1,cadena2)){
        println("La cadena 1 es mayor alfabeticamente")
    }else{
        println("La cadena 2 es mayor alfabeticamente")
    }


}
fun dimeCadena(mensaje:String):String{
    println(mensaje)
    return readln()
}
fun longitudCadena(cadena1:String,cadena2:String):String{
    var cadenaMayor = ""
    if (cadena1.length>cadena2.length){
        cadenaMayor = "La cadena 1 es mayor"
    }else if (cadena1.length<cadena2.length){
        cadenaMayor = "La cadena 2 es mayor"
    }else
        cadenaMayor = "Las cadenas son iguales en longitud"
    return cadenaMayor
}
fun igual(cadena1: String,cadena2: String):Boolean{

    return cadena1.equals(cadena2,ignoreCase = true)
}

fun longitudAlfabetica(cadena1: String,cadena2: String):Boolean{
    return cadena1.compareTo(cadena2)>1
}
