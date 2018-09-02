package com.github.anuaraliyev23.log.implementations

import com.github.anuaraliyev23.log.interfaces.HttpLog
import com.github.anuaraliyev23.log.interfaces.HttpRequestLog
import com.github.anuaraliyev23.log.interfaces.HttpResponseLog

class SimpleHttpLog(override val request: HttpRequestLog,
                    override val response: HttpResponseLog) : HttpLog {

}