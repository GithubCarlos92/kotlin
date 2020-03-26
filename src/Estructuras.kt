import kotlin.math.sqrt

fun main(parametros : Array<String>) {

//Estructura condicional if

    /**
     * Problema 01
     * Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla
     * indicando que debe abonar impuestos.
     */
    println("Ingrese el sueldo ")
    val sueldo = readLine()!!.toInt()
    if (sueldo > 3000) {
        println("Debe Abonar impuesto")
    }

    /**
     * Problema 02
     * Realizar un programa que solicite ingresar dos números enteros distintos y muestre por
     * pantalla el mayor de ellos (suponemos que el operador del programa ingresa valores
     * distintos, no valida nuestro programa dicha situación)
     */
    println("ingreso valore n1")
    val valor1 = readLine()!!.toInt()
    println("ingreso valore n2")
    val valor2 = readLine()!!.toInt()
    if (valor1 > valor2)
        println("El mayor es $valor1")
    else
        println("El mayor es $valor2")

    /**
     * problema 03
     * Se ingresan por teclado 2 valores enteros. Si el primero es menor al segundo calcular la
     * suma y la resta, luego mostrarlos, sino calcular el producto y la división.
     */
    println("Ingrese valor 1")
    val v1 = readLine()!!.toInt()
    println("Ingrese valor 2")
    val v2 = readLine()!!.toInt()

    if (v1 < v2) {
        var suma = v1 + v2
        var resta = v2 - v1
        println("La suma es: $suma y la resta es: $resta")
    } else {
        var prod = v1 * v2
        var div = v1 / v2
        println("El producto es: $prod y la división es: $div")
    }

    /**
     * Problemas Propuestos
    - Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar
     * un mensaje "Promocionado".
     */
    println("ingrese nota n1")
    val A = readLine()!!.toInt()
    println("ingrese nota n2")
    val B = readLine()!!.toInt()
    println("ingrese nota n3")
    val C = readLine()!!.toInt()

    var prom = (A + B + C) / 3

    if (prom >= 7)
        println("Promocionado con $prom")
    else
        println("No Promocionado con $prom")


    /**
    - Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un
     * mensaje indicando si el número tiene uno o dos dígitos.
     */
    println("Ingrese numero entre 1 y 99 ")
    val numcompre = readLine()!!.toInt()
    if (numcompre >= 10)
        println("Tiene dos digitos")
    else
        println("Tiene un digito")

    //Estructura condicional if como expresión
    /**
     * Problema 01
     * Cargar dos valores enteros, almacenar el mayor de los mismos en otra variable y mostrarlo.
     */
    println("ingrese valor 1")
    val val1 = readLine()!!.toInt()
    println("ingrese valor 2")
    val val2 = readLine()!!.toInt()
    var mayor = if (val1 > val2) val1 else val2
    println("El mayor entre $val1 y $val2 es: $mayor")

    /**
     * Problema 02
     * Ingresar por teclado un valor entero. Almacenar en otra variable el cuadrado de dicho
     * número si el valor ingresado es par, en caso que sea impar guardar el cubo.
     * Mostrar además un mensaje que indique si se calcula el cuadrado o el cubo.
     */
    println("ingrese valor entero")
    val valent = readLine()!!.toInt()
    val otravar = if (valent % 2 == 0) {
        valent * valent
        println("Se esta calculando el cuadrado")
    } else {
        valent * valent * valent
        println("Se esta calculando el cubo")
    }

    /**
     * problema propuesto
     * Cargar un valor entero por teclado comprendido entre 1 y 99. Almacenar en otra
     * variable la cantidad de dígitos que tiene el valor ingresado por teclado.
     * Mostrar la cantidad de dígitos del número ingresado por teclado.
     */
    println("ingrese valor comprendido entre 1 y 99")
    val number = readLine()!!.toInt()
    var cantidad = if(number < 10 ) 1 else 2
    println("El numero tiene $cantidad digitos")


}