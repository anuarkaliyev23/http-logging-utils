package com.github.anuaraliyev23.log.implementations

import com.github.anuaraliyev23.log.interfaces.HttpResponseLog
import java.time.ZonedDateTime

class SimpleHttpResponseLog(override val status: Int,
                            override val headers: MutableMap<String, String>,
                            override val body: String? = null,
                            override val timestamp: ZonedDateTime = ZonedDateTime.now()) : HttpResponseLog{

}