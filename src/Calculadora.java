/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author kezia
 */
public class Calculadora {
    
    public static double div(double num1, double num2) throws NaoPotiZerinhoEpixexion {
        if (num2 == 0) {
            throw new NaoPotiZerinhoEpixexion();
        } else {
            return num1 / num2;
        }
    }
    
    public static double multi(double num1, double num2) {
        return num1 * num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }
    
    /**
     * Calcula o fatorial do número fornecido
     * @param num numero fornecido
     * @author Isaac
     * @return fatorial de num
     */
    public static double fatorial(double num) {
        if (num <= 1) return 1;
        else return num * fatorial(num - 1);
    }
}

