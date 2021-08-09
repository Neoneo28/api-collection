package one.digitalinnovation.collections

fun main() {
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 1500.0, "PJ")
    val Maria = Funcionario("Maria", 4000.0, "CLT")

    val Funcionarios1 = setOf(Joao, Pedro)
    val Funcionarios2 = setOf(Maria)

   val resultUnion = Funcionarios1.union(Funcionarios2)
    resultUnion.forEach{ println(it) }

    println("-----------------")
    val Funcionarios3 = setOf(Joao, Pedro, Maria)
    val resultSubtract = Funcionarios3.subtract(Funcionarios2)
    resultSubtract.forEach{ println(it) }

    println("-----------------")
    val resultIntersect = Funcionarios3.intersect(Funcionarios2)
    resultIntersect.forEach{ println(it) }
}