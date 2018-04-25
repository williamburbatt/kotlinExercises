import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(val inDate: LocalDateTime) {
    constructor(initialDate: LocalDate) : this(initialDate.atTime(0, 0))
    val date = inDate.plusSeconds(1000000000)
}