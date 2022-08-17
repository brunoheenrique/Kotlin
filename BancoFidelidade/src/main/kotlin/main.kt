fun main() {
    val contaAlex = Conta()
    contaAlex.setTitular("Alex")
    println(contaAlex.getTitular())

    val contaFran = Conta()
    contaFran.setTitular("Fran")
    println(contaFran.getTitular())

    contaAlex.setSaldo(100.0)
    contaFran.setSaldo(1000.0)

    println(contaAlex.getNumeroConta())
    println(contaFran.getNumeroConta())

    contaAlex.setNumeroConta(1000)
    contaFran.setNumeroConta(1001)

    println("Despositando grana")

    contaAlex.depositar(4022.0)
    contaFran.depositar(32.30)

    println("Saldo do Alex ${contaAlex.getSaldo()}")
    println("Saldo da Fran ${contaFran.getSaldo()}")

    contaAlex.sacar(400.0)
    contaFran.sacar(1000.0)

    println("Saldo do Alex ${contaAlex.getSaldo()}")
    println("Saldo da Fran ${contaFran.getSaldo()}")

    contaAlex.transferencia(50.0, contaFran)

    println("Saldo do Alex ${contaAlex.getSaldo()}")
    println("Saldo da Fran ${contaFran.getSaldo()}")
}

class Conta {
    private var titular: String = ""
    private var numeroConta = 0
    private var saldo = 0.0

    fun getSaldo(): Double {
        return this.saldo
    }

    fun getNumeroConta(): Int {
        return this.numeroConta
    }

    fun getTitular(): String {
        return this.titular
    }

    fun setSaldo(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun setNumeroConta(valor:Int){
        this.numeroConta = valor
    }

    fun setTitular(nome:String){
        this.titular = nome
    }

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
