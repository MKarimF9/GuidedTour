open class BankAccount (_accountNumber: String, _name: String, _balance: Double){

    val accountNumber = _accountNumber
    var name = _name
    private var balance = _balance


    fun getBalance() : Double {
        return balance
    }

    fun deposit (amount: Double){
        if (amount > 0 ) balance += amount
    }
    open fun withdraw (amount: Double){
        if (amount > 0) balance -= amount
    }
}