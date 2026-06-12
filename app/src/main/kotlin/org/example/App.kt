
package org.example

import org.example.app.Persona
import org.example.app.Fecha
import org.example.app.Polinomio
import org.example.app.Cuadratica
import org.example.app.CuadraticaMejor

fun main() {

    val polinomio : Polinomio 
    polinomio = Polinomio()
    println(polinomio)
    val cuadratica : Cuadratica
    cuadratica = Cuadratica()
    println(cuadratica)
    val cuadraticamj : CuadraticaMejor
    cuadraticamj = CuadraticaMejor()
    println(cuadraticamj)
    println(Persona("pepe", "honguito", Fecha(5, 6, 2026)))
    var objeto : Polinomio
    objeto = Cuadratica()
    println(objeto)
    objeto = CuadraticaMejor()
    println(objeto)
    var lista = ArrayList <Polinomio>()
    lista.add(Cuadratica())
    lista.add(Polinomio())
    lista.add(CuadraticaMejor())
    for (var p : lista){
        println(p)
    }
}