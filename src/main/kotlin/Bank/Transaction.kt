package Bank

import java.time.LocalDate
import java.util.*

class Transaction(val amount: Double, val isCredit : Boolean, val resultingBalance : Double) {
    val date = LocalDate.now()
}
