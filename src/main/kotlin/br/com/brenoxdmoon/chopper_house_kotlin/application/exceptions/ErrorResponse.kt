package br.com.brenoxdmoon.chopper_house_kotlin.application.exceptions

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class ErrorResponse(val statusCode: Int, val message: String) {
}