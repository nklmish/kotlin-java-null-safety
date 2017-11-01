package com.nklmish.nullabilitydemo

import api.Message

fun main(args: Array<String>) {


    val greet = Message().greet("John")
    println(greet)

//    val greetWithCompilationError1 : String = Message().greet(null) //uncomment this to see compilation error (we are passing null for a non-nullable parameter)

//    val greetWithCompilationError2 : String = Message().greet2("John") //uncomment this to see compilation error(type mismatch)

    val param : String? = "Bob"
    val greet3 : String = Message().greet3(param) // we have over-ridden the parameter's nullability behavior for this specific method, that's why this call is allowed.
    println(greet3)
}