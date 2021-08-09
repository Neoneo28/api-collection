package one.digitalinnovation.collections

fun main() {
   val Joao = Funcionario("Joao", 1000.0)
    val Pedro = Funcionario("Pedro", 2000.0)
    val Maria = Funcionario("Maria", 4000.0)

    val Funcionarios = listOf(Joao, Pedro, Maria)

    Funcionarios.forEach{ println(it) }

    println("---------------")
    println(Funcionarios.find { it.nome == "Maria"})
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