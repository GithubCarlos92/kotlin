/**
 * Created by Bach. Carlos Valverde
 **/

fun main( parametro : Array<String>){
  //  print("Ejemplos con kotlin")

    /**
     *sumar dos variables
     */
    val mensaje ="Bienvenidos al curso de kotlin"
    val x1 = 12
    val x2 = 11
    var suma = x1 + x2
    println(" la suma de $x1 + $x2 es igual a  $suma")

    /**
     * Problema 01
    Realizar la carga de dos numeros enteros por teclado e impprimir su suma y su producto
     */
    println("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    println("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()
    var suma_valores = valor1 + valor2
    println("la suma $valor1  + $valor2  es $suma_valores ")
    var producto = valor1 * valor2
    println("la multiplicación de $valor1 * $valor2 es $producto ")

    /**
     *   Problema 02
    Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo (El
    perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)
     **/
    println("ingrese le valor del lado")
    val lado = readLine()!!.toInt()
    var perimetro = lado * 4
    println("el perimetro del lado $lado es $perimetro ")

    /**
     * Problema 03
    Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad
    que lleva el cliente. Mostrar lo que debe abonar el comprador.
     */
    println("Ingrese precio del articulo")
    val precio = readLine()!!.toDouble()
    println("Ingrese la cantidad")
    val cantidad = readLine()!!.toInt()
    var total = precio * cantidad
    println("el comprador debe abonar $total")

    /**
     * Problemas Propuestos
     *
    - Escribir un programa en el cual se ingresen cuatro números enteros, calcular e
    informar la suma de los dos primeros y el producto del tercero y el cuarto.
     */

    println("Ingrese primer numero entero")
    val ne1 = readLine()!!.toInt()
    println("Ingrese segundo numero entero")
    val ne2 = readLine()!!.toInt()
    println("Ingrese tercero numero entero")
    val ne3 = readLine()!!.toInt()
    println("Ingrese cuarto numero entero")
    val ne4 = readLine()!!.toInt()

    var sum = ne1 + ne2
    var product = ne3 * ne4

    println("la suma de los dos primeros numeros es $sum")
    println("el producto del tercero y el cuarto es $product")

    /**
    - Realizar un programa que lea por teclado cuatro valores numéricos enteros e informar
    su suma y promedio.
     */

    println("Ingrese primer numero entero")
    val num1 = readLine()!!.toInt()
    println("Ingrese segundo numero entero")
    val num2 = readLine()!!.toInt()
    println("Ingrese tercero numero entero")
    val num3 = readLine()!!.toInt()
    println("Ingrese cuarto numero entero")
    val num4 = readLine()!!.toInt()

    val sumat = num1 + num2 + num3 + num4
    var promedio = (sumat / 4).toDouble()

    println("la suma es $sumat")
    println("el promedio es $promedio")

}
