package it.develhope.swaggerexrcise2.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping(value = "")
    @ApiOperation(value = "initial welcome message")
    public String welcomeMessage (){
        return "visit localhost:5050/swagger-ui/ for more info";
    }
}
