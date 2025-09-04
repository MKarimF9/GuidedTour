fun main(args: Array<String>) {
    println("First National Bank")

    val bankAccount = SavingsAccount("ABC123",  "Sarah Morgan",  450.00)

    println("account holder name: ${bankAccount.name}")
    println("account balance: ${bankAccount.getBalance()}")

    bankAccount.deposit(650.00)

    println("account balance: ${bankAccount.getBalance()}")

    bankAccount.withdraw(1150.00)
    println("account balance: ${bankAccount.getBalance()}")

}