data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return when {
            this.year == other.year && this.month == other.month && this.dayOfMonth == other.dayOfMonth -> 0
            this.year == other.year && this.month == other.month && (this.dayOfMonth > other.dayOfMonth) ||
                    (this.year == other.year && (this.month > other.month)) ||
                    (this.year > other.year) -> 1
            else -> -1
        }
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
