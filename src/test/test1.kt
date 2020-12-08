package test

fun test1(){
    println("Тестовая программа")

    println()
    val name = "Шери"
    val height = 7

    println()
    println ("Hi")
    println ("My cat is caleed $name")
    println ("My cat is height $height")

    println()
    val a = 6
    val b = 7
    val c = a+b+10
    val str = c.toString()
    println ("вывод С = $c и вывод ц как текст $str")

    println()
    val numList = arrayOf(2, 7, 40)
    var x = 0
    while (x<3){
        println("Значение $x is ${numList[x]}")
        x = x+1
    }
    println()

}