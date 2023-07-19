fun main(args: Array<String>) {
    menu()
}

fun menu(){
    println("Choose one of this options:\n1.Operators.\n2.Conditionals.\n3.Cycles\n99.Close\n")
    var decision = readln()
    when (decision) {
        "1" -> menuUno()
        "2" -> menuTwo()
        "3" -> menuThree()
        "99" -> println("The program is close")
        else -> {
            menu()
        }
    }
}

fun menuUno(){
    println("===== OPERATORS =====")
    println("Choose one of this options:")
    println("1. Calculate the area of a triangle")
    println("2. Sum of two numbers")
    println("3. Squared number")
    println("4. Euros to Dollars")
    println("5. Area and perimeter of a square")
    println("6. Area and volume of a cylinder")
    println("7. Length and area of a circle")
    println("8. Average of three numbers")
    println("9. Go back")
    var des1 = readln()
    when (des1){
        "1" -> operators("1")
        "2" -> operators("2")
        "3" -> operators("3")
        "4" -> operators("4")
        "5" -> operators("5")
        "6" -> operators("6")
        "7" -> operators("7")
        "8" -> operators("8")
        "9" -> menu()
        else -> {
            menuUno()
        }
    }
}

fun menuTwo(){
    println("===== CONDITIONALS =====")
    println("Choose one of this options of the conditionals:")
    println("1. Positive or negative")
    println("2. Major and minor")
    println("3. Major and minor two")
    println("4. Add if A is greater")
    println("5. Quotient between A and B")
    println("6. Add if A or B are negative")
    println("7. Leap-year")
    println("8. Go back")
    var des2 = readln()
    when (des2){
        "1" -> conditionals("1")
        "2" -> conditionals("2")
        "3" -> conditionals("3")
        "4" -> conditionals("4")
        "5" -> conditionals("5")
        "6" -> conditionals("6")
        "7" -> conditionals("7")
        "8" -> menu()
        else -> {
            menuTwo()
        }
    }
}

fun menuThree(){
    println("===== CYCLE =====")
    println("Choose one of this options of the cycles:")
    println("1. Multiples of 3")
    println("2. Odd numbers")
    println("3. Pair numbers")
    println("4. Squared numbers")
    println("5. Sum of squares")
    println("6. Numbers in sequences")
    println("7. User sum")
    println("8. Go back")
    var des = readln()
    when (des){
        "1" -> cycles("1")
        "2" -> cycles("2")
        "3" -> cycles("3")
        "4" -> cycles("4")
        "5" -> cycles("5")
        "6" -> cycles("6")
        "7" -> cycles("7")
        "8" -> menu()
        else -> {
            menuThree()
        }
    }
}

fun operators(option: String){
    when (option) {
        "1" -> {
            println("Write the base and the height of the triangle")
            println("Base: \n")
            var base = readln().toInt()
            println("Height: \n")
            var height = readln().toInt()
            val area = (base * height) / 2
            println("The area of the triangle is $area")
            menuUno()
        }

        "2" -> {
            println("Write the first number")
            var num1 = readln().toInt()
            println("Write the second number")
            var num2 = readln().toInt()

            val sum: Int = num1 + num2
            println("The sum of both number is $sum")
            menuUno()
        }

        "3" -> {
            println("Write the first number")
            var num1 = readln().toInt()
            val exponent = 2
            val squared = Math.pow(num1.toDouble(), exponent.toDouble())
            println("The answer is $squared")
            menuUno()
        }

        "4" -> {
            println("Write the amount of Euros that you have")
            var euros = readln().toDouble()
            val dollar = 1.12
            val change = euros * dollar
            println("The conversion gives a total of $change")
            menuUno()
        }

        "5" -> {
            println("Enter the side of the square")
            var side = readln().toInt()
            val area: Int = side * side
            val perimeter: Int = side + side + side + side
            println("The value of the area is $area and the value of the perimeter is $perimeter")
            menuUno()
        }

        "6" -> {
            println("Enter the length of the radius")
            var lenght = readln().toDouble()
            println("Write the height of the cylinder: \n")
            var height = readln().toDouble()
            val area: Double = 2 * 3.1416 * lenght * (height + lenght)
            val volume: Double = 3.1416 * (lenght * lenght) * height
            println("The value of the area is $area and the volume is $volume")
            menuUno()
        }

        "7" -> {
            println("Write the radius of the circle")
            var radius = readln().toDouble()
            val length = 2 * 3.1416 * radius
            val area = 3.1416 * (radius * radius)
            println("The length of the circle is $length and his area is $area")
            menuUno()
        }

        "8" -> {
            println("Write the first number")
            var num1 = readln().toDouble()
            println("Write the second number")
            var num2 = readln().toDouble()
            println("Write the third number")
            var num3 = readln().toDouble()
            val prom: Double = (num1 + num2 + num3) / 3
            println("The average is $prom")
            menuUno()
        }
    }
}

fun conditionals(option: String){
    when (option){
        "1" -> {
            println("Write a number:")
            var number = readln().toInt()
            if (number > 0){
                println("This number is positive")
            } else {
                println("This number is negative")
            }
            menuTwo()
        }

        "2" -> {
            println("Write the first number: ")
            var num1 = readln().toInt()
            println("Write the second number: ")
            var num2 = readln().toInt()
            if (num1 > num2){
                println("The number $num1 is greater than the number $num2")
            } else {
                println("The number $num2 is greater than the number $num1")
            }
            menuTwo()
        }
        "3" -> {
            println("Write the first number: ")
            var num1 = readln().toInt()
            println("Write the second number: ")
            var num2 = readln().toInt()
            println("Write the third number: ")
            var num3 = readln().toInt()
            if (num1>num2 && num1>num3) {
                if (num2>num3) {
                    println("The largest number is $num1 and the smallest number is $num3")
                } else {
                    println("The largest number is $num1 and the smallest number is $num2")
                }
            } else if (num2>num1 && num2>num3) {
                if (num1>num3) {
                    println("The largest number is $num2 and the smallest number is $num3")
                } else {
                    println("The largest number is $num2 and the smallest number is $num1")
                }
            } else if (num3>num2 && num3>num1) {
                if (num1>num2) {
                    println("The largest number is $num3 and the smallest number is $num2")
                } else {
                    println("The largest number is $num3 and the smallest number is $num1")
                }
            }
            menuTwo()
        }

        "4" -> {
            println("Write the first number: ")
            var num1 = readln().toInt()
            println("Write the second number: ")
            var num2 = readln().toInt()
            if (num1 < num2){
                val sum = num1 + num2
                println("The sum of number one and number two is $sum")
            } else {
                val res = num1 - num2
                println("The subtraction of number one and number two is $res")
            }
            menuTwo()
        }

        "5" -> {
            println("Write the first number: ")
            var num1 = readln().toInt()
            println("Write the second number: ")
            var num2 = readln().toInt()
            if (num1 == 0 || num2 == 0){
                println("The numbers can't be 0")
            } else {
                val quotient = num1 / num2
                println("The quotient is $quotient")
            }
            menuTwo()
        }

        "6" -> {
            println("Write the first number: ")
            var num1 = readln().toInt()
            println("Write the second number: ")
            var num2 = readln().toInt()
            if (num1 < 0 || num2 < 0){
                val sum = num1 + num2
                println("The sum of number one and number two is $sum")
            } else {
                val mul = num1 * num2
                println("The subtraction of number one and number two is $mul")
            }
            menuTwo()
        }

        "7" -> {
            println("Write the year")
            var year = readln().toInt()
            if (year % 4 == 0){
                println("The year is a leap year")
            } else {
                println("The year is not a leap year")
            }
            menuTwo()
        }
    }
}

fun cycles(option: String){
    when(option){
        "1" -> {
            for (i in 1..100){
                if (i % 3 == 0){
                    print("$i ")
                }
            }
            menuThree()
        }

        "2" -> {
            for (i in 0..100){
                if (i % 2 != 0){
                    print("$i ")
                }
            }
            menuThree()
        }

        "3" -> {
            for (i in 0..100){
                if (i % 2 == 0){
                    print("$i ")
                }
            }
            menuThree()
        }

        "4" -> {
            for (i in 1..30){
                var r = i * i
                println(r)
            }
            menuThree()
        }

        "5" -> {
            var t = 0
            for (i in 1..100){
                t += (i * i)
            }
            println(t)
            menuThree()
        }

        "6" -> {
            println("Write the first number: ")
            var num1 = readln().toInt()
            println("Write the second number: ")
            var num2 = readln().toInt()
            if (num1 < num2){
                for (i in num1..num2){
                    print("$i ")
                }
            } else {
                for (i in num2..num1){
                    print(i )
                }
            }
            menuThree()
        }

        "7" -> {
            var i = 0
            var total = 0
            while (i==0){
                println("Write a number that is not zero")
                var number = readln().toInt()
                if (number==0){
                    i++
                }
                total += number
            }
            print("The sum of the numbers is $total")
            menuThree()
        }
    }
}