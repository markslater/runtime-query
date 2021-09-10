package com.example

import org.eclipse.jetty.server.Server

object Example {
    @JvmStatic
    fun main(args: Array<String>) {
        Server().start()
    }
}