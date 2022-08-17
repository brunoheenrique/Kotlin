fun main() {
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    println(contaAlex.titular)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    println(contaFran.titular)

    contaAlex.saldo = -100.0
    contaFran.saldo = 1000.0

    contaAlex.numeroConta = 1000
    contaFran.numeroConta = 1001

}

class Conta {
    var titular: String = ""
    var numeroConta = 0
    var saldo = 0.0
}

