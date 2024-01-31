package leetcode

fun countIntegers(n: Int, out: Int, arr: IntArray): IntArray{

    var smallCount: Int = 0
    var largeCount: Int = 0
    var equalCount: Int = 0

    for (item in arr){
        if (item == out){
            equalCount++
        }else if(item > out){
            largeCount++
        }else{
            smallCount++
        }
    }

    println(smallCount)
    println(equalCount)
    println(largeCount)

    var outputArr: IntArray = intArrayOf(smallCount, equalCount, largeCount)

    return outputArr

}

fun main() {
    println(countIntegers(5, 6, intArrayOf(2,4,6,8,10)))
}