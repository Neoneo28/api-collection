package one.digitalinnovation.collections

fun main() {
   val Joao = Funcionario("Joao", 2000.0)
    val Pedro = Funcionario("Pedro", 1500.0)
    val Maria = Funcionario("Maria", 4000.0)

    val Funcionarios = listOf(Joao, Pedro, Maria)

    Funcionarios.forEach{ println(it) }

    println("---------------")
    println(Funcionarios.find { it.nome == "Maria"})

    println("-------------------")
    Funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it) }
}

data class  Funcionario (
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome:    $nome 
            Salario: $salario
        """.trimIndent()
}