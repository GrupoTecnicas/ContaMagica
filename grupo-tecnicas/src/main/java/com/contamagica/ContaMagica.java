package com.contamagica;

/**
 * Hello world!
 *
 */
public class ContaMagica 
{
    public static final int SILVER = 0;
    public static final int GOLD = 1;
    public static final int PLATINUM = 2;
    private int status;
    private double saldo;

    public ContaMagica(){
        status = SILVER;
        saldo = 0.0;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getStatus(){
        return status;
    }

    public void deposito(double valor){

    }

    public void retirada(double valor){
        
    }
}
