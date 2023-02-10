
package calculadora_consola;

import java.util.Scanner;     // clase para lectura desde teclado
public class Calculadora_consola {
 static Scanner leer = new Scanner(System.in);  // creando objeto de clase Scanner
   
 public static void main(String[] args) {
        double valor1=0.0, valor2=0.0, calculo=0.0;
        int opcion;
        
        
        System.out.println("Bienvenido, ingrese la opcion que desea utilizar: ");
        System.out.println("1) Suma");
        System.out.println("2) Resta ");
        System.out.println("3) Division ");
        System.out.println("4) Multiplicacion ");
        System.out.println("5) Sen() ");
        System.out.println("6) Cos() ");
        System.out.println("7) Tan() ");
        System.out.println("8) Elevado ");
        System.out.println("9) Raiz ");
        System.out.println("10) Iva ");

                
        opcion = leer.nextInt();   // lee un entero desde teclado
       
        
         switch(opcion) {
            case 1:
              System.out.print("Ingrese el primer número: ");
              valor1 = leer.nextInt();
              System.out.print("Ingrese el segundo número: ");
              valor2 = leer.nextInt();
              calculo = valor1 + valor2;
              System.out.println("La respuesta es: "+calculo);
              break;
            case 2:
               System.out.print("Ingrese el primer número: ");
              valor1 = leer.nextInt();
              System.out.print("Ingrese el segundo número: ");
              valor2 = leer.nextInt();
              calculo = valor1 - valor2;
              System.out.println("La respuesta es: "+calculo);
              break;
            case 3:
               System.out.print("Ingrese el primer número: ");
              valor1 = leer.nextInt();
              System.out.print("Ingrese el segundo número: ");
              valor2 = leer.nextInt();
              calculo = valor1 / valor2;
              System.out.println("La respuesta es: "+calculo);
              break;
            case 4:
              System.out.print("Ingrese el primer número: ");
              valor1 = leer.nextInt();
              System.out.print("Ingrese el segundo número: ");
              valor2 = leer.nextInt();
              calculo = valor1 * valor2;
              System.out.println("La respuesta es: "+calculo);
              break;
            case 5:
              System.out.print("Ingrese el primer número: ");
              valor1 = leer.nextInt();
              valor2=Math.toRadians(valor1);
              calculo = Math.sin(valor2); 
              System.out.println("La respuesta es: "+calculo);
              break;
            case 6:
              System.out.print("Ingrese el primer número: ");
              valor1 = leer.nextInt();
              valor2=Math.toRadians(valor1);
              calculo = Math.cos(valor2); 
              System.out.println("La respuesta es: "+calculo);
              break;
            case 7:
              System.out.print("Ingrese el primer número: ");
              valor1 = leer.nextInt();
              valor2=Math.toRadians(valor1);
              calculo = Math.tan(valor2); 
              System.out.println("La respuesta es: "+calculo);
              break;
            case 8:
              System.out.print("Ingrese el número base: ");
              valor1 = leer.nextInt();
              System.out.print("Ingrese el número del exponente: ");
              valor2=leer.nextInt();;
              calculo = Math.pow(valor1, valor2);
              System.out.println("La respuesta es: "+calculo);
  
              break;
            case 9:
              System.out.print("Ingrese el número dentro de la raiz: ");
              valor1 = leer.nextInt();
              System.out.print("Ingrese el número de la raiz enesima que desea: ");
              valor2=leer.nextInt();;
              calculo = Math.pow(valor1, (1/valor2));
              System.out.println("La respuesta es: "+calculo);
              break; 
            case 10:
               System.out.print("Ingrese el porcentaje del IVA: ");
              valor1 = leer.nextInt();
              System.out.print("Ingrese el valor a calcular el IVA: ");
              valor2=leer.nextInt();;
              calculo = (valor1/100)*valor2;
              System.out.println("La respuesta es: "+calculo);
            default:
              // code block
          }
        
       System.out.println("El Programa ha finalizado con exito, Juan Felipe Gonzalez Pardo");
    }
        
        
    }
    
