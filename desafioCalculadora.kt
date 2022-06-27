val oper:Int = 5

fun main() {
    var valor:Int = 20
    var valor2:Int = 10
    var result:Int
        
    when (oper){
        1 -> {
            result = valor + valor2
            println("O resultado é: $result")
        }
        2 -> {
            result = valor - valor2
            println("O resultado é: $result")
        }
        3 -> {
            result = valor / valor2
            println("O resultado é: $result")
        }
        4 -> {
            result = valor * valor2
            println("O resultado é: $result")
        }
                
        else -> println("O valor inserido ($oper) é inválido")
    }
}
