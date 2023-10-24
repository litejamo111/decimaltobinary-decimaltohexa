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
public class programador {
    public static String reponse;
    public static void binarytodecimal(){
        
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n___________________________\nConvertir: \n[1] Decimal - Binario  |  [2] Binario - Decimal\n[3] Return");
            reponse = sc.nextLine();
            if (reponse.equals("1")) {
                while(true) {
                    int decimalint = 0;
                    System.out.print("\n___________________________\ningrese un numero decimal: ");
                    try {
                        decimalint = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("ingrese un valor decimal");
                    }

                    int[] binaryNum = new int[1000];

                    int i = 0;
                    while (decimalint > 0) {
                        binaryNum[i] = decimalint % 2;
                        decimalint = decimalint / 2;
                        i++;
                    }
                    System.out.print("Output: ");
                    for (int j = i - 1; j >= 0; j--) {
                        System.out.print(binaryNum[j]);
                    }
                    System.out.println("\n\nContinuar? y/n");
                    reponse = sc.nextLine();
                    if (reponse.equals("n")) {
                        break;
                    }
                }
            }else if (reponse.equals("2")) {
                while (true) {
                    String binaryString;
                    System.out.print("\n___________________________\ningrese un numero binario: ");
                    binaryString = sc.nextLine();
                    try {
                        System.out.println("\nOutput: " + Integer.parseInt(binaryString, 2));
                    } catch (NumberFormatException e) {
                        if (binaryString.isEmpty()) {
                            System.out.println("error: ingrese un numero binario");
                        } else {
                            System.out.println("error: ingrese un numero binario");
                        }

                    }
                    System.out.println("\n\nContinuar? y/n");
                    reponse = sc.nextLine();
                    if (reponse.equals("n")) {
                        break;
                    }
                }
                }else if (reponse.equals("3")) {
                    break;
                } else {
                    System.out.println("____________________________\n\nerror: ingrese un valor correcto");
                }
        }
    }
    public static void decimaltohexadecimal() {

        while (true) {
            boolean error = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("\n___________________________\nConvertir: \n[1] Decimal - Hexadecimal  |  [2] Hexadecimal - Decimal\n[3] Return");
            reponse = sc.nextLine();
            if (reponse.equals("1")){
                while(true) {
                    char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                    int rem;
                    int num = 0;
                    String hexadecimal = "";
                    System.out.println("Entrez un nombre decimal: ");
                    try {
                        num = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("error: ingrese un valor decimal");
                        error = true;
                    }
                    System.out.println("Output: ");
                    while (num != 0) {
                        rem = num % 16;
                        hexadecimal = ch[rem] + hexadecimal;
                        num = num / 16;
                    }
                    System.out.print(hexadecimal);
                    System.out.println("\n\nContinuar? y/n");
                    reponse = sc.next();
                    if (reponse.equals("n")) {
                        break;
                    }
                }
            }else if (reponse.equals("2")){
                while(true) {
                    
                    String hexdec;
                    String hex = "0123456789ABCDEF";
                    System.out.print("ingrese un valor hexadecimal: ");
                    hexdec = sc.nextLine();
                    hexdec = hexdec.toUpperCase();
                    int decimal = 0;
                    for (int i = 0; i < hexdec.length(); i++) {
                        char ch = hexdec.charAt(i);
                        int in = hex.indexOf(ch);
                        decimal = 16 * decimal + in;
                    }
                    System.out.print("Output: " + decimal);
                    System.out.println("\n\nContinuar? y/n");
                    reponse = sc.nextLine();
                    if (reponse.equals("n")) {
                        break;
                    }
                }
            }else if (reponse.equals("3")){
                break;
            }else{
                System.out.println("____________________________\n\nerror: ingrese un valor valido");
            }
        }
    }
}
