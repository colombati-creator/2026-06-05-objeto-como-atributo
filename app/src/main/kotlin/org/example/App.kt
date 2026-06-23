
package org.example

import org.example.app.Persona
import org.example.app.Fecha
import org.example.app.Polinomio
import org.example.app.Cuadratica
import org.example.app.CuadraticaMejor
import org.example.app.Cuatrinomio
import org.example.app.Terminos

fun main() {

    var t1=Terminos(2,2)
    var t2=Terminos(4,1)
    var t3=Terminos(-3,0)
    var p1=Polinomio(listOf(t1,t2,t3))
    var t4=Terminos(5,1)
    var t5=Terminos(3,2)
    var t6=Terminos(2,3)
    var t7=Terminos(8,1)
    var p2=Polinomio(listOf(t4,t5,t6,t7))
    println(p1)
    println(p2)

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
    lista.add(Cuatrinomio())
    for (polinomio in lista){
        println(polinomio)
    }
}
