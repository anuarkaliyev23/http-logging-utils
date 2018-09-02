package com.github.anuaraliyev23.log


/**
 * This class describes all HTTP Request methods
 * accordingly to RFC 7231 and RFC 5789
 *
 * @author Dussaliyev Khambar
 * @since 1.0-SNAPSHOT
 * */
enum class HttpRequestMethod {
    GET,
    POST,
    PATCH,
    DELETE,

    PUT,
    HEAD,
    CONNECT,
    OPTIONS,
    TRACE;
}