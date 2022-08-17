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

    println("Despositando grana")

    contaAlex.depositar(4022.0)
    contaFran.depositar(32.30)

    println("Saldo do Alex ${contaAlex.saldo}")
    println("Saldo da Fran ${contaFran.saldo}")

    contaAlex.sacar(400.0)
    contaFran.sacar(1000.0)

    println("Saldo do Alex ${contaAlex.saldo}")
    println("Saldo da Fran ${contaFran.saldo}")

    contaAlex.transferencia(50.0, contaFran)

    println("Saldo do Alex ${contaAlex.saldo}")
    println("Saldo da Fran ${contaFran.saldo}")


}

class Conta {
    var titular: String = ""
    var numeroConta = 0
    var saldo = 0.0

    fun depositar(valor: Double) {
        this.saldo += valor
    }

    fun sacar(valor: Double) {
        when {
            this.saldo > valor -> this.saldo -= valor
            else -> println("Valor solicitado maior do que saldo em conta. Operação cancelada")
        }
    }

    fun transferencia(valor: Double, contaDestino: Conta): Boolean {
        return when {
            this.saldo > valor -> {
                this.saldo -= valor
                contaDestino.saldo += valor
                true
            }

            else -> {
                println("Valor solicitado maior do que saldo em conta. Operação cancelada")
                false
            }
        }
    }
}

