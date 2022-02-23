fun main(args: Array<String>) {

    print("Digite um mês para verificarmos em qual estação do ano ele se econtra: ")
    val mes = readLine()!!.toInt()

    val temp = readLine()!!.toDouble()

    when(mes){
        in 1..3 -> {
            println("Estamos no verão")
            if (temp > 30.0){
                println("Beba água")
            }else{
                println("O clima está agradável")
            }
        }
        in 4 .. 6 -> println("Outono")
        in 7 .. 9 -> println("Inverno")
        in 10 .. 12 -> println("Primavera")
        else -> println("Mês inválido")
    }

}