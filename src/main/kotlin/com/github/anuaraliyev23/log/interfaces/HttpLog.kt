package com.github.anuaraliyev23.log.interfaces

import java.time.temporal.ChronoUnit

interface HttpLog {
    val request : HttpRequestLog
    val response : HttpResponseLog

    fun responseTime() : Long {
        return ChronoUnit.MILLIS.between(request.timestamp, response.timestamp)
    }
}