class CheckingAccount (_accountNumber: String, _name: String, _balance: Double): BankAccount(_accountNumber, _name, _balance)
{
    val OVERDRAFT_AMOUNT = 50.00

    val OVERDRAFT_FEE = 15.00

    override fun withdraw(amount: Double) {
        if (amount <= getBalance()) super.withdraw(amount)
        else if (amount > getBalance() && amount <= getBalance() + OVERDRAFT_AMOUNT) super.withdraw(amount + OVERDRAFT_FEE)

    }
}