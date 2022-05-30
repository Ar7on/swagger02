package it.develhope.swaggerexrcise2.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import it.develhope.swaggerexrcise2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping( value = "")
    @ApiOperation(value = "welcome message",notes = "print a message for the user")
    public String welcomeMessage(){
        return "visit localhost:5050/swagger-ui/ for more info";
    }

    @GetMapping(value = "/division-info")
    @ApiOperation(value = "division",notes = "give information about the division")
    public ArithmeticOperation giveInfoAboutDivision(){
        String[] properties = {"division1","divison2","division3"};
                return new ArithmeticOperation("division","info about division",properties,0);
    }
    @GetMapping(value = "/multiplication-info")
    @ApiOperation(value = "multiplication",notes = "give information about the multiplication")
    public int  giveInfoAboutMultiplication(
         @ApiParam(value = "the first operand")@RequestParam(required = true)int firstOperand,
         @ApiParam(value = "the second operand")@RequestParam(required = true)int secondOperand
    ) {
        return firstOperand * secondOperand;
    }
    @GetMapping(value = "/square/{n}")
    @ApiOperation(value = "esegui il cuadrato di un numero")
    public int getSquare(@ApiParam(value = "il numero che si vuole elevare al quadrat0")@PathVariable() int n){
        return n*n;
    }

    }

