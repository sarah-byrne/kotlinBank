package Bank


import org.junit.Test
import kotlin.test.assertEquals

class AccountTest {
    @Test
    fun `Account starts with no transactions`() {
        val account = Account()
        assertEquals("date || credit || debit || balance", account.printStatement())
    }

//    @Test
//    fun `Account records a transaction when a deposit is made`() {
//        val account = Account()
//        account.deposit(1.0)
//        assertEquals("date || credit || debit || balance", account.printStatement())
//    }
}