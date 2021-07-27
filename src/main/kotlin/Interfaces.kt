interface Maquina {

    // A diferença principal de uma Interface para uma Classe Abstrata é que a Interface não
    // consegue ter um estado (estado é uma variável que não tem valor) p
    // por exempplo: ele não deixa eu fazer isso como Na classe abstrata: var peso: Float = 0f
    // essa variável(da Interface) nunca tem valores ( no caso o 0f)


    fun ligar()
    fun desligar() {
        println("off")
    }
}

class  Computador() : Maquina {
    override fun ligar() {

    }
}

interface interface1 {
    fun ola() {
        println("interface 1")
    }
}

interface interface2 {
    fun ola() {
        println("interface 1")
    }
}

class ImplementaInterface : interface1, interface2 {
    override fun ola() {
        super<interface2>.ola()
    }

}

fun main() {

}