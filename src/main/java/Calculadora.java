
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kezia
 */
public class Calculadora {


    public static double num1(ArrayList<String> numerador) {
        System.out.println(numerador);
        String str = String.join("", numerador);
        
        double n1 = Double.parseDouble(str);
        return n1;
    }
    public static double num2(ArrayList<String> den) {
        System.out.println(den);
        String str = String.join("", den);
        
        double n2 = Double.parseDouble(str);
        return n2;
    }

    public static double div(double num1, double num2) throws ArithmeticException {
        return num1 / num2;
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
}
