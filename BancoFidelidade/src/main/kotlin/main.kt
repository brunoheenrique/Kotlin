fun main (){
    print("Bem-vindo ao Banco Fidelidade")
    val titular = "Alex"
    val numeroConta = 1000
    var saldo = 0.0

    println("Titular $titular")
    println("Numero da Conta $numeroConta")
    println("Saldo da conta $saldo")

   when{
       saldo >0.0 -> println("Tem grana")
       saldo == 0.0 -> println("Conta ta zerada")
       else -> println("Ta no vermelho")
   }


}
