/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.InputMismatchException;
import java.util.*;

/**
 *
 * @author 201
 */
public class principal {
    public static String reponse;
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\nque conversion va a realizar?");
            System.out.println("\n[1] Binario - Decimal  |  [2] Hexadecimal - Decimal\n"+
                                "[3] Salir              |");
            reponse = sc.nextLine();
            if (reponse.equals("1")) {
                programador.binarytodecimal();
            } else if (reponse.equals("2")) {
                programador.decimaltohexadecimal();
            }else if (reponse.equals("3")) {
                break;
            }else{
                System.out.println("____________________________\n\nerror: ingrese un valor valido");
            }
        }
    }
}