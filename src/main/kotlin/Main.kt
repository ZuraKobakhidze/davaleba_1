fun main(args: Array<String>) {
    println(averageOfEvenNumbers(arrayOf(1, 2, 3, 4, 5, 6, 7, 8)))
    println(isPalindrome("zuka"))
    println(isPalindrome("lol"))
}

fun averageOfEvenNumbers(nums: Array<Int>): Int {

    var sum = 0;
    var count = 0;

    for (i in 0 until nums.count()) {

        if (((i+1) % 2) == 0) {
            sum += nums[i];
            count++;
        }

    }

    if (count == 0) { return 0 }

    return sum / count

}


fun isPalindrome(text: String): Boolean {

    if(text.reversed() == text) {
        return true
    }

    return false

}