import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> when {
        x == y -> 0
        x > y -> -1
        else -> 1
    } })
    return arrayList
}
