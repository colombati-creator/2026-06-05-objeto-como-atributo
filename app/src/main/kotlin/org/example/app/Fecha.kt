package org.example.app

class Fecha(
    private var dia: Int=0,
    private var mes: Int=0,
    private var ano: Int=0
) {
    
    override fun toString(): String {
        return "Fecha(dia=${dia}, mes=${mes}, ano=${ano})"
    }
}
