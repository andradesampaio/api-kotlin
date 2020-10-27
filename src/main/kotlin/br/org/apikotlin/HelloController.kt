package br.org.apikotlin


import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Api(description = "REST API Kotlin!!!!")
@RestController
@RequestMapping("/api/v1")
class HelloController {

    @ApiOperation("Get Hello World System")
    @ApiResponses(ApiResponse(code = 200, message = "Success|OK"),
                  ApiResponse(code = 401, message = "not authorized!"))
    @GetMapping("/hello")
    fun sayHello(): String? {
        return "Swagger Hello World"
    }

}