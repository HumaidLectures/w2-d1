fun main() {

// --------------------------------- when and nested if ----------------

//    val health = 79
//    val isHealed = false
//
//    val x = when {
//        health == 100 -> "your health is fine"
//        health in 90..99 -> " there are some scratches"
//        health in 75..89 && isHealed -> "there are a lot of scratches but you're healing"
//        health in 75..89 && !isHealed -> "you're going to die "
//        else -> "you are dead"
//    }
//    println(x)


// ------------------------- and and or or -----------------------

//    print("enter your username: ")
//    val userName = readLine()
//    print("enter your password: ")
//    val password = readLine()
//
//    if (userName == "humaid" && password == "qqq111qqq") {
//        println("hi humaid")
//    }else   {
//        println("wrong username or password")
//    }


//    print("what's your name? ")
//    var name = readLine()
//    print("how old are you? ")
//    var age = readLine()
//
//
//    if (name == "humaid" || age == "24"){
//        println("you got the access")
//    }else {
//        println("you don't have access")
//    }
//
//
//
// -------------------------- function and  anonymous function -----------------------------
//
//    val sum : (Int,Int) -> Int = { num1, num2 ->
//        num1+num2
//    }
//
//    math(10,20) { i, i2 ->
//        i + i2
//    }
//
//}
//
//fun math (num1:Int,num2:Int,sum:(Int,Int)->Int){
//    println(sum(num1, num2))
//}
//
//fun adding (num1:Int , num2:Int ):Int {
//    return num1 + num2
//}
//fun adding (num1:Int, num2: Int, num3:Int):Int{
//    return num1+num2+num3
//}

// ------------------------- high-order function-----------------------
//
//    math(10,20){ num1: Int, num2: Int ->
//        num1 + num2
//    }
//    math(10,20){ num1: Int, num2: Int ->
//        num1 - num2
//    }
//    math(10,20){ num1: Int, num2: Int ->
//        num1 * num2
//    }
//    math(10,20){ num1: Int, num2: Int ->
//        num1 / num2
//    }
//
//}
//
//fun math (n1 :Int, n2 :Int , operation :(num1:Int,num2:Int) -> Int){
//    println(operation(n1,n2))
}
