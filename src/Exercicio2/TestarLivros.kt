package Exercicio2

class TestarLivros {
}

/*
- Instancie outros 10 livros no método main e chame os métodos
desenvolvidos, conforme o exemplo anterior. */

fun main() {
    var livroFavorito: Livros = Livros()
    livroFavorito.titulo = "O Pequeno Príncipe"
    livroFavorito.qtdPaginas = 98

    livroFavorito.exibirQntPaginasLivro()

    livroFavorito.paginasLidas = 50
    livroFavorito.verificarProgresso()

    println("--------------------------")

    livroFavorito.adicionarLivros(
            "O Pequeno Príncipe",
            98,
        50 )

    var listaLivros = livroFavorito.inserirLivrosNaLista(livroFavorito)

    livroFavorito.exibirListaLivros(listaLivros)


}