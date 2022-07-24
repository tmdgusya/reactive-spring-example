package com.roach.springreactiveexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringReactiveExampleApplication

fun main(args: Array<String>) {
	runApplication<SpringReactiveExampleApplication>(*args)
}
