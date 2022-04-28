package exercicio3

import exercicio3.Filme.Companion.pedirQntdFilmesEmCartas

fun main(){
    val objetoFilme : Filme = Filme()

    for (contador in 1..pedirQntdFilmesEmCartas()){
        println("----------------------------")
        objetoFilme.inserirFilmeLista(objetoFilme.cadastrarFilme())
        println("----------------------------")
    }

    objetoFilme.exibirFilmesEmCartaz()
}