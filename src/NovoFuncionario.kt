fun main() {
    var novoFuncionario: Funcionario = Funcionario()
    novoFuncionario.nome = "Luis"
    novoFuncionario.sobrenome = "Silva"
    novoFuncionario.horasTrabalhadas = 10
    novoFuncionario.valorPorHora = 25.50f

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8)
    novoFuncionario.calcularSalario()

    novosFuncionarios()
}

fun novosFuncionarios() {
    var novoFuncionario1: Funcionario = Funcionario()
    var novoFuncionario2: Funcionario = Funcionario()
    var novoFuncionario3: Funcionario = Funcionario()
    var novoFuncionario4: Funcionario = Funcionario()
    var novoFuncionario5: Funcionario = Funcionario()
    var novoFuncionario6: Funcionario = Funcionario()
    var novoFuncionario7: Funcionario = Funcionario()
    var novoFuncionario8: Funcionario = Funcionario()
    var novoFuncionario9: Funcionario = Funcionario()

    novoFuncionario1.nome = "Abigail"
    novoFuncionario2.nome = "Alex"
    novoFuncionario3.nome = "Emily"
    novoFuncionario4.nome = "Harvey"
    novoFuncionario5.nome = "Leah"
    novoFuncionario6.nome = "Penny"
    novoFuncionario7.nome = "Sam"
    novoFuncionario8.nome = "Sebastian"
    novoFuncionario9.nome = "Shane"

    novoFuncionario1.sobrenome = "Johnson"
    novoFuncionario2.sobrenome = "Davis"
    novoFuncionario3.sobrenome = "Cost"
    novoFuncionario4.sobrenome = "Coffee"
    novoFuncionario5.sobrenome = "Wood"
    novoFuncionario6.sobrenome = "Reder"
    novoFuncionario7.sobrenome = "Kent"
    novoFuncionario8.sobrenome = "Sean"
    novoFuncionario9.sobrenome = "Blue"

    novoFuncionario1.horasTrabalhadas = 7
    novoFuncionario2.horasTrabalhadas = 10
    novoFuncionario3.horasTrabalhadas = 8
    novoFuncionario4.horasTrabalhadas = 12
    novoFuncionario5.horasTrabalhadas = 7
    novoFuncionario6.horasTrabalhadas = 6
    novoFuncionario7.horasTrabalhadas = 5
    novoFuncionario8.horasTrabalhadas = 8
    novoFuncionario9.horasTrabalhadas = 9

    novoFuncionario1.valorPorHora = 16f
    novoFuncionario2.valorPorHora = 22f
    novoFuncionario3.valorPorHora = 23f
    novoFuncionario4.valorPorHora = 28f
    novoFuncionario5.valorPorHora = 20f
    novoFuncionario6.valorPorHora = 18f
    novoFuncionario7.valorPorHora = 18f
    novoFuncionario8.valorPorHora = 23f
    novoFuncionario9.valorPorHora = 22f

    var listaFuncionarios = ArrayList<Funcionario>()
    listaFuncionarios.add(novoFuncionario1)
    listaFuncionarios.add(novoFuncionario2)
    listaFuncionarios.add(novoFuncionario3)
    listaFuncionarios.add(novoFuncionario4)
    listaFuncionarios.add(novoFuncionario5)
    listaFuncionarios.add(novoFuncionario6)
    listaFuncionarios.add(novoFuncionario7)
    listaFuncionarios.add(novoFuncionario8)
    listaFuncionarios.add(novoFuncionario9)

    for (i in listaFuncionarios){
        i.nomeCompleto()
        i.calcularSalario()
        i.incrementarHoras(8)
        i.calcularSalario()
    }
}


// função para cadastrar vários funcionários = teste
/*
fun variosFuncionarios() {
    println("Quantos funcionários quer inserir?")
    val qnt = readln().toInt()
    var i = 0
    while (i < qnt ) {
        var outroFuncionario: Funcionario = Funcionario()
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
    }
}
*/