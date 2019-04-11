package Bank


import org.junit.Test
import kotlin.test.assertEquals

class AccountTest {
    @Test
    fun `Account starts with no transactions`() {
        val account = Account()
        assertEquals("date || credit || debit || balance", account.printStatement())
    }
}