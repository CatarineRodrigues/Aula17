/*1. Crie uma classe Funcionario que obedeça à descrição abaixo:

 */
class Funcionario {
    var nome: String = ""
    var sobrenome: String = ""
    var horasTrabalhadas: Int = 0
    var valorPorHora: Float = 0f

    fun nomeCompleto(){
        println("O nome do funcionáro é $nome $sobrenome")
    }

    fun calcularSalario(){
        var salario = horasTrabalhadas * valorPorHora
        println("O salário do mês do funcionário será de R$ $salario")
    }

    fun incrementarHoras(horasExtras: Int){
        horasTrabalhadas += horasExtras
    }

}