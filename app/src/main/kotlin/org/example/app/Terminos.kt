package org.example.app
open class Terminos(
    private var escalar:Int=0,
    private var grado:Int=0
) {

    override fun toString(): String {
        return "${escalar} ${grado}"
    }
}
