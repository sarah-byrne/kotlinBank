package Bank

class Account {
    private var balance : Double = 0.0
    private var transactions = mutableListOf<Transaction>()

    fun printStatement() : String {
        var statement =  "date || credit || debit || balance"
        transactions.forEach {
            statement += " ${it.date} || ${it.amount} || || ${it.resultingBalance}"
        }
        return statement
    }

    fun deposit(amount : Double) {
        balance += amount
        val trans = Transaction(amount, true, balance)
        transactions.add(trans)
    }
}
