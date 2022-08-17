fun main (){
    print("Bem-vindo ao Banco Fidelidade")
    val titular = "Alex"
    val numeroConta = 1000
    var saldo = 0.0

    println("Titular $titular")
    println("Numero da Conta $numeroConta")
    println("Saldo da conta $saldo")

    saldo = somaSaldo(saldo)
    testaCondicao(saldo)

}

private fun somaSaldo(saldo: Double): Double {
    var saldo1 = saldo
    for (i in 1..50) {
        saldo1 += 10 + i
        println(saldo1)
    }
    return saldo1
}

private fun testaCondicao(saldo: Double) {
    when {
        saldo > 0.0 -> println("Tem grana")
        saldo == 0.0 -> println("Conta ta zerada")
        else -> println("Ta no vermelho")
    }
}
