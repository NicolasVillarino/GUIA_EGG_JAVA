/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Niko
 */
public class Calculator {
    int num1;
    int num2;

    public int add (){
        return num1 + num2;
    }
    
    public int substract (){
        return num1 - num2;
    }
    
    
    public int multiply (){
        return num1 * num2;
    }
    
    
    public int divide (){
        return num1/num2;
    }
    
    public void setNum1(int num1){
        this.num1 = num1;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    
    
}
