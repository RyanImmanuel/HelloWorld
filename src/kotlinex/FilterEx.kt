package kotlinex

class FilterEx {
}

fun main() {
    val ints = listOf(1,2,3,4,5,6,7,8,9,10)
    //eager
    val eager = ints.filter { it > 4 }
    println(eager)
    println(ints.filter { n -> n > 9 })
    //lazy

    val instruments = listOf("viola", "violin", "piano")
    val lazy = instruments.asSequence().filter { it[0] == 'v'}
    println(lazy)


}