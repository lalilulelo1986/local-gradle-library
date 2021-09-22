package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.test.Test

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	Test()
	runApplication<DemoApplication>(*args)
}
