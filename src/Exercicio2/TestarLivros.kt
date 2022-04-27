package Exercicio2

fun main() {
    var livroFavorito: Livros = Livros()
    livroFavorito.titulo = "O Pequeno Príncipe"
    livroFavorito.qtdPaginas = 98

    livroFavorito.exibirQntPaginasLivro()

    livroFavorito.paginasLidas = 50
    livroFavorito.verificarProgresso()

    novosLivros()
}

fun novosLivros() {
    println("\n---------Novos Livros------------\n")

    var livrosNovos = ArrayList<Livros>()
    livrosNovos.add(Livros("As crônicas de Nárnia", 400, 20))
    livrosNovos.add(Livros("Turma da mônica", 40, 40))
    livrosNovos.add(Livros("Senhor dos Anéis", 280, 0))
    livrosNovos.add(Livros("O Hobbit", 300, 0))
    livrosNovos.add(Livros("Jogos Vorazes", 320, 320))
    livrosNovos.add(Livros("Em Chamas", 290, 290))
    livrosNovos.add(Livros("A Esperança", 400, 400))
    livrosNovos.add(Livros("Clean Code", 20, 20))
    livrosNovos.add(Livros("Interestelar", 300, 0))

    livrosNovos.forEach {
        it.exibirQntPaginasLivro()
        it.verificarProgresso()
    }
}