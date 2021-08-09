package one.digitalinnovation.collections

fun main() {
   val Joao = Funcionario("Joao",2000.0,"CLT")
    val Pedro = Funcionario("Pedro",1500.0,"PJ")
    val Maria = Funcionario("Maria",4000.0,"CLT")

    val Funcionarios = listOf(Joao, Pedro, Maria)

    Funcionarios.forEach{ println(it) }

    println("---------------")
    println(Funcionarios.find { it.nome == "Maria"})

    println("-------------------")
    Funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it) }

    println("-------------------")
    Funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{ println(it) }
}
