package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Jõao"
    nomes[2] = "José"

    for( names in nomes) {
        println(names)
    }

    println("-------------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("-------------------------")
    val nomes2 = arrayOf("Maria, Zaza, João, Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}
