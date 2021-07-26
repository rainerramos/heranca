//a palavra OPEN permite q a classe seja herdada

open class Maquina (val marca: String) {
    fun minhaMarca(){
        println("Minha marca é $marca")
    }
}

class Computador(marca: String, val nucleos: Int) : Maquina(marca) {
        fun ligar() {}
        fun processar () {}
}

fun main (){
    val c: Computador = Computador("xpto", 10)
    with(c) {
        ligar()
        processar()
        minhaMarca()
    }
}