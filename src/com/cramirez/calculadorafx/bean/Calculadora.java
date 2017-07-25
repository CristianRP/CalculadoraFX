/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cramirez.calculadorafx.bean;

/**
 *
 * @author cristian
 */
public class Calculadora {
    
    private float num1;
    private float num2;
    private float resultado;
    
    public Calculadora() {
    }
    
    public Calculadora(float num1, float num2, float resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }
    
    public float getNum1() {
        return num1;
    }
    
    public void setNum1(float num1) {
        this.num1 = num1;
    }
    
    public float getNum2() {
        return num2;
    }
    
    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public float getResultado() {
        return resultado;
    }
    
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
   
    public boolean isDivisible() {
        return num2 > 0;
    }
    
}
