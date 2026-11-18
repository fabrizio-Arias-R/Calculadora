#include <stdio.h>
#include <stdbool.h>

int main(void)
{
    char operacion;
    int number;
    int number2;
    bool seguir = true;

    printf("Bienvenido a la calculadora\n");

    while (seguir)
    {
        printf("Escoge la operacion  1)suma, 2)resta, 3)multiplicacion, 4)division, 5)salir\n");
        scanf(" %c", &operacion);

        if (operacion == '5')
        {
            printf("Gracias por usar la calculadora\n");
            seguir = false;      // el while termina al volver a revisar la condicion
            continue;            // salta al inicio del while, sin pedir numeros
        }

        if (operacion < '1' || operacion > '4')
        {
            printf("Escoge dentro de las opciones\n");
            continue;
        }

        printf("Introduce el primer numero: ");
        scanf("%i", &number);
        printf("Introduce el segundo numero: ");
        scanf("%i", &number2);

        switch (operacion)
        {
            case '1':
                printf("El total es %i\n", number + number2);
                break;
            case '2':
                printf("El total es %i\n", number - number2);
                break;
            case '3':
                printf("El total es %i\n", number * number2);
                break;
            case '4':
                if (number2 == 0)
                {
                    printf("No se puede dividir entre 0\n");
                }
                else
                {
                    printf("El total es %.2f\n", (float) number / number2);
                }
                break;
        }
    }

    return 0;
}





