package com.contamagica;


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
        if(valor < 0){
            throw new RuntimeException("Valor inválido");
        }
        else{
            switch(status){
                case 0: saldo += valor;
                case 1: saldo += (valor + (valor * 0.01)); break;
                case 2: saldo += (valor + (valor * 0.025)); break;
            }
            if(saldo >= 50000.0 && saldo < 200000.0 && status == SILVER){
                status = GOLD;
            }else if (saldo >= 200000.0 && status == GOLD){
                status = PLATINUM;
            }
        }

    }

    public void retirada(double valor){
        if(valor > saldo){
            throw new RuntimeException("Não há saldo disponível");
        }
        else{
            saldo -= valor;
            if(saldo < 100000.0 && saldo >= 25000.0 && status == PLATINUM){
                status = GOLD;
            } else if (saldo <25000.0 && status == GOLD){
                status = SILVER;
            }
        }
    }
}
