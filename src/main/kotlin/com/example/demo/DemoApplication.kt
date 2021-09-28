package com.example.demo

import kz.efc.kgd.astana1.commons.repo.SadGeneralSegment
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	val ss: SadGeneralSegment? = null
	runApplication<DemoApplication>(*args)
}
