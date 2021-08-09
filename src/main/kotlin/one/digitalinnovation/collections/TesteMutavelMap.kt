package one.digitalinnovation.collections

fun main() {
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 1500.0, "PJ")
    val Maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(Joao.nome, Joao)
    repositorio.create(Pedro.nome, Pedro)
    repositorio.create(Maria.nome, Maria)

    println(repositorio.findById(Maria.nome))

    println("---------------------------------")
    repositorio.findAll().forEach { println(it) }

    println("---------------------------------")
    repositorio.remove(Maria.nome)
    repositorio.findAll().forEach { println(it) }
}