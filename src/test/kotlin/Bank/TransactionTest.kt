package Bank

import org.junit.Test
import java.time.LocalDate
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class TransactionTest {
    @Test
    fun `Transaction can be created`() {
        val trans = Transaction(1.0, true, 1.0)
        assertEquals(1.0, trans.amount)
    }

    @Test
    fun `Transaction can be a credit`() {
        val trans = Transaction(1.0, true, 1.0)
        assertEquals(true, trans.isCredit)
    }

    @Test
    fun `Transaction can be a debit`() {
        val trans = Transaction(1.0, false, 1.0)
        assertEquals(false, trans.isCredit)
    }

    @Test
    fun `Transaction has the date it was created`() {
        val today = LocalDate.now()
        val trans = Transaction(1.0, false, 1.0)
        assertEquals(today, trans.date)
    }

    @Test
    fun `Transaction has the resulting balance`() {
        val trans = Transaction(1.0, false, 1.0)
        assertEquals(1.0, trans.resultingBalance)
    }
}