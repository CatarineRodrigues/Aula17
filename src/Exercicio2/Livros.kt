package Exercicio2

class Livros (
    var titulo: String = "",
    var qtdPaginas: Int = 0,
    var paginasLidas: Int = 0,
    var lista: ArrayList<Livros> = ArrayList()
)
    {
    fun verificarProgresso() {
        val porcentagem = paginasLidas * 100 / qtdPaginas
        println("Você já leu $porcentagem % do livro \n")
    }

    fun exibirQntPaginasLivro() {
        println("O livro $titulo possui $qtdPaginas páginas")
    }

}

/*    fun inserirLivrosNaLista(livro: Livros) {
        var listaLivros = ArrayList<Livros>()
        listaLivros.add(livro)
        lista = listaLivros
    }

    fun exibirLista(lista: ArrayList<Livros>){
        lista.forEach {
            it.exibirQntPaginasLivro()
            it.verificarProgresso()
        }
}*/

/*    fun parametrosLivro(){
        println("Qual é o título do livro?")
        titulo = readln()
        println("Quantas páginas tem o livro?")
        qtdPaginas = readln().toInt()
        println("Quantas páginas você já leu do livro?")
        paginasLidas = readln().toInt()
    }
*/

/*
    println("Quantos livros quer inserir?")
    val qnt = readln().toInt()
    var i = 0
    for (livro <= livro) {
        var : Funcionario = Funcionario()
        println("Digite o nome do ${i + 1}º funcionário")
        outroFuncionario.nome = readln()

        println("Digite o sobrenome do ${i + 1}º funcionário")
        outroFuncionario.sobrenome = readln()

        println("Digite a quantidade de horas trabalhadas pelo ${i + 1}º funcionário")
        outroFuncionario.horasTrabalhadas = readln().toInt()

        println("Digite o valor da hora pago ao ${i + 1}º funcionário")
        outroFuncionario.valorPorHora = readln().toFloat()

        println("Quantidade de horas extras trabalhadas?")
        var horaExtra = readln().toInt()

        outroFuncionario.nomeCompleto()
        outroFuncionario.calcularSalario()

        if (horaExtra > 0) {
            outroFuncionario.incrementarHoras(horaExtra)
            outroFuncionario.calcularSalario()
        }
        i++

 */