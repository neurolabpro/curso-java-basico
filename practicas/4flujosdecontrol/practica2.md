## Practica 2
- El objetivo de esta practica es utilizar los flujos de control.

- Codigo que se tiene que utilizar para poder hacer la practica.

```java
public class Ejemplo {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            // codigo a introducir
            System.out.println(x + "" + y + "");
            x = x + 1;
        }
    }

}
```
- Completar el codigo con los siguientes trozos de Codigo.
### Ejemplo1
```java
y = x - y;
```
### Ejemplo2
```java
y = y + x;
```
### Ejemplo3
```java
y = y + 2;
if(y < 4) {
    y = y - 1;
}
```
### Ejemplo4
```java
x = x + 1;
y = y + x;
```
### Ejemplo5
```java
if (y < 5) {
    x = x + 1;
    if ( y < 3) {
        x = x - 1;
    }
}
y = y + 2;
```

- Crear un proyecto en netbeans y Intellij IDEA y crear las clases con todos los ejemplos
## Ejemplo1 
```java
public class Ejemplo1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            y = x - y;
            System.out.println(x + "" + y + "");
            x = x + 1;
        }
    }

}
```
- Resultado
```bash
0,0
1,1
2,1
3,2
4,2
```