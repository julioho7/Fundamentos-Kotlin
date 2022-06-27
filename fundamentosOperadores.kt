fun main() {
    val count = 10
    var times = 9
    val r = times + count
    
    println("Soma dos valores v1: " + r)
    
    //Método de operações por função do próprio Kotlin
    println("Soma dos valores v2: " + times.plus(count))
    println("Subtração dos valores: " + count.minus(times))
    println("Multiplicação dos valores: " + count.times(times))
    println("Divisão dos valores: " + count.div(times))
    println("Módulo dos valores: " + count.mod(times))
    
    //Segundo método
    print("Método de soma e atriuição ao mesmo tempo: ")
    times += count //Método de operação e atribuição ao mesmo tempo
    println(times)
}
