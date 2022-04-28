package exercicio3

class Filme (
    tituloParametro : String = "",
    duracaoFilmeMinParametro: Int = 0
    ) {
    var titulo = tituloParametro
    var duracaoFilmeMin = duracaoFilmeMinParametro
    var listaFilmesEmCartaz : ArrayList <Filme> = ArrayList()

    fun calculaHoras(): Int {
        return duracaoFilmeMin / 60
    }

    fun calculaMinutos(): Int {
        return duracaoFilmeMin % 60
    }

    fun exibirDuracaoEmHoras(){
        println("Filme: $titulo")
        println("Duração: ${calculaHoras()}h${calculaMinutos()}min")
        println("----------------------------")
    }

    fun cadastrarFilme(): Filme {
        print("Insira o nome do filme: ")
        var titulo = readln()

        print("Insira a duração do filme (min): ")
        var duracao = readln().toInt()

        return Filme(
            tituloParametro = titulo,
            duracaoFilmeMinParametro = duracao
        )
    }

    fun inserirFilmeLista(filme: Filme){
        listaFilmesEmCartaz.add(filme)
    }

    fun exibirFilmesEmCartaz(){
        println("------- FILMES EM CARTAZ ------")
        listaFilmesEmCartaz.forEach{
            it.exibirDuracaoEmHoras()
        }
    }

    companion object {
        fun pedirQntdFilmesEmCartas(): Int {
            print("Quantos filmes estão em cartaz? ")
            return readln().toInt()
        }
    }
}
