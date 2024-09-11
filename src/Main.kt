fun main() {
    print("Введите строку: ")
    val userInput = readLine() ?: return

    var result = ""
    var count = 1

    for (i in 1 until userInput.length) {
        if (userInput[i] == userInput[i - 1]) {
            count++
        } else {
            result += userInput[i - 1] + if (count > 1) count.toString() else ""
            count = 1
        }
    }
    result += userInput.last() + if (count > 1) count.toString() else ""

    println("Результат: $result")
}
