package it.develhope.swaggerexrcise2.entities;


import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.RequestMapping;


public class ArithmeticOperation {

     @ApiModelProperty(value = "the name of the operation",example = "addition")
    private String name;

     @ApiModelProperty(value = "the number of the operands",example = "2")
    private int minNumberOfOperands;

     @ApiModelProperty(value = "the description of the operation",example = "2+2=somma")
    private String description;

     @ApiModelProperty
    private String[] proprirties;

    public ArithmeticOperation(){};

    public ArithmeticOperation(String name,String description,String[] proprirties,int minNumberOfOperands) {
        this.name = name;
        this.minNumberOfOperands = minNumberOfOperands;
        this.description = description;
        this.proprirties = proprirties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinNumberOfOperands() {
        return minNumberOfOperands;
    }

    public void setMinNumberOfOperands(int minNumberOfOperands) {
        this.minNumberOfOperands = minNumberOfOperands;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getProprirties() {
        return proprirties;
    }

    public void setProprirties(String[] proprirties) {
        this.proprirties = proprirties;
    }
}
