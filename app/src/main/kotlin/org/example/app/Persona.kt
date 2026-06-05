package org.example.app

class Persona(
    private var persona1: String,
    private var persona2: String ,
    private var fecha1: Fecha
) {
    
    override fun toString(): String {
        return "Persona(persona2=${persona2}, persona1=${persona1}, fecha1=${fecha1}"
    }
}