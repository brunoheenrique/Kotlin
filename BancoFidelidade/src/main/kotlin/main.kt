fun main() {
    val contaAlex = Conta("Alex", 1000)
    val contaFran = Conta("Fran", 1001)

    contaAlex.depositar(100.0)
    contaFran.depositar(1000.0)

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

class Conta(private var titular: String, private var numeroConta: Int) {
    var saldo = 0.0
        private set

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
                contaDestino.depositar(valor)
                true
            }

            else -> {
                println("Valor solicitado maior do que saldo em conta. Operação cancelada")
                false
            }
        }
    }

}
