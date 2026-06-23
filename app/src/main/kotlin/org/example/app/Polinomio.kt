package org.example.app

open class Polinomio(var terminos: List<Terminos> = ArrayList<Terminos>()) {
   
     override fun toString(): String {
        for (p in terminos){
            print(p)
        }
        return "${terminos}"
    }
}