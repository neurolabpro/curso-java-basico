## PRACTICA 1
- El objetivo de esta practica es asimilar los operadores y tipos de variables primitivas con los que podemos trabajar en java.

- Codigo que se tiene que utilizar para poder hacer la practica.

```java
import java.util.Locale;
import java.util.Scanner;

public class Operadores {


    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        int operacion;
        boolean salir = false;
        while(!salir) {
            System.out.println("Elige el tipo de operación que quieres hacer:");
            System.out.println("1 - Aritmeticos y aritmeticos");
            System.out.println("2 - Logicas y de Comparación");
            System.out.println("3 - Asignación");
            System.out.println("0 - Salir");
            operacion = entrada.nextInt();

            switch (operacion) {
                case 1:
                    System.out.println("1 - Aritmeticos y de Incremento");
                    // Ejercicio 1
                    break;
                case 2:
                    System.out.println("2 - Logicas y de Comparación");
                    // Ejercicio 2
                    break;
                case 3:
                    System.out.println("3 - Asignación");
                    // Ejercicio 3
                    break;
                case 0:
                    System.out.println("Bye bye");
                    salir = true;
                    break;
                default:
                    System.out.println("No selecciono ninguna operación");
            }
        }
    }
}

```

## Ejercicio 1
- En el ejercicio 1 se tiene que utilizar los operadores aritmeticos y de incremento
    - Suma `+`
    - Resta `-`
    - Multiplicación `*`
    - División `/`
    - Division `~/`, este devuelve un entero
    - Modulo `%` es el restante de una división
    - `++i` Pre incremento
    - `i++` Post incremento
    - `--i` Pre decremento
    - `i--` Post decremento
## Ejercicio 2
- En el ejercicio 2 se tiene que utilizar los operadores logicos y de comparación
    - `&&` AND
    - `||` OR
    - `==` igualdad
    - `!=` No igual o diferente
    - `<` menor que
    - `>` mayor que
    - `<=` menor o igual que
    - `>=` mayor o igual que
    
## Ejercicio 3
- En el Ejercicio 3 se tiene que utilizar los operadores de asignacion
    - `=` asinar valor
    - `+=`
    - `-=`
    - `*=`
    - `/=`
    - `%=`
    - `~/=`