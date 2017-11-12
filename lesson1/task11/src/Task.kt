import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object: Comparator<Int> {
        override fun compare(x: Int, y: Int): Int {
            val retVal = when {
                x == y -> 0
                x > y -> -1
                else -> 1
            }
            return retVal
        }
    })
    return arrayList
}
