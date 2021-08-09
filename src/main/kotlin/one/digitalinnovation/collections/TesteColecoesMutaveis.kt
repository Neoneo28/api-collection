package one.digitalinnovation.collections

fun main() {
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 1500.0, "PJ")
    val Maria = Funcionario("Maria", 4000.0, "CLT")

    println("------------------- LIST -------------------")
    val Funcionarios = mutableListOf(Joao, Maria)
    Funcionarios.forEach { println(it) }

    println("--------------------------------------------")
    Funcionarios.add(Pedro)
    Funcionarios.forEach { println(it) }

    println("--------------------------------------------")
    Funcionarios.remove(Joao)
    Funcionarios.forEach { println(it) }

    println("---------------- SET ---- ------------------")
    val FuncionarioSet = mutableSetOf(Joao)
    FuncionarioSet.forEach { println(it) }

    println("--------------------------------------------")
    FuncionarioSet.add(Pedro)
    FuncionarioSet.add(Maria)
    FuncionarioSet.forEach { println(it) }

    println("--------------------------------------------")
    FuncionarioSet.remove(Maria)
    FuncionarioSet.forEach { println(it) }
}