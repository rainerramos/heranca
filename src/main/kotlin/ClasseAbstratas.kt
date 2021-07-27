// Mamigero - Animal
abstract class Mamifero(var nome: String) {

    var peso: Float = 0f

    abstract fun falar()
    open fun dormir(){
        println("estou dormindo")
    }
}

class Cachorro (nome: String) : Mamifero (nome){
    override fun falar() {
        println("au au")
    }
}

class Gato (nome: String, meuPeso: Float) : Mamifero (nome) {

    init {
        this.peso = meuPeso
    }

    override fun falar() {
        println("miau")
    }
}

fun main () {

    Cachorro("bolt").dormir()

}