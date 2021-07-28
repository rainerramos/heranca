class Pessoa {
   lateinit var nome: String

    fun geradorDeNome(){
        nome = "haiddag"
    }
}

fun main (){

    val p = Pessoa()
    p.geradorDeNome()

}