package com.imai.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class TesteDeJenkinsfileComConnetorApplication

fun main(args: Array<String>) {
	runApplication<TesteDeJenkinsfileComConnetorApplication>(*args)

	println("Olá mundo!!!")

}
