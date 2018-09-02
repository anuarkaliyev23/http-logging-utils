package com.github.anuaraliyev23.log.interfaces

import java.time.ZonedDateTime

interface HttpResponseLog {
    val status : Int
    val headers : MutableMap<String, String>
    val body : String?

    val timestamp : ZonedDateTime
}