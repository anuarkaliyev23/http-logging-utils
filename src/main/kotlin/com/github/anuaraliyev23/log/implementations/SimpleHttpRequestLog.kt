package com.github.anuaraliyev23.log.implementations

import com.github.anuaraliyev23.log.HttpRequestMethod
import com.github.anuaraliyev23.log.interfaces.HttpRequestLog
import java.time.ZonedDateTime

class SimpleHttpRequestLog(override val method: HttpRequestMethod,
                           override val headers: HashMap<String, String>,
                           override val path: String,
                           override val body: String? = null,
                           override val domain: String? = null,
                           override val timestamp: ZonedDateTime = ZonedDateTime.now()) : HttpRequestLog {

}