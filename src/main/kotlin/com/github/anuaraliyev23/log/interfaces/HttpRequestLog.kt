package com.github.anuaraliyev23.log.interfaces

import com.github.anuaraliyev23.log.HttpRequestMethod
import java.time.ZonedDateTime

interface HttpRequestLog {
    val method : HttpRequestMethod
    val headers : MutableMap<String, String>
    val body : String?
    val path : String
    val domain : String?

    val timestamp : ZonedDateTime
}