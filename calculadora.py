import numpy as np

print("Bienvenido a la calculadora de Python")


def calculadora(opcion, numero1, numero2):
    match opcion:
        case "1":
            return np.add(numero1, numero2)
        case "2":
            return np.subtract(numero1, numero2)
        case "3":
            return np.multiply(numero1, numero2)
        case "4":
            if numero2 == 0:
                print("Error: No se puede dividir entre cero.")
                return None
            return np.divide(numero1, numero2)


while True:
    opcion = input(
        "Ingrese la operación que desea realizar "
        "(1) suma, 2) resta, 3) multiplicación, 4) división, 5) salir: "
    )

    if opcion == "5":
        print("Gracias por usar la calculadora de Python")
        break

    if opcion not in ("1", "2", "3", "4"):
        print("Opción no válida")
        continue

    numero1 = float(input("Ingrese el primer número: "))
    numero2 = float(input("Ingrese el segundo número: "))
    resultado = calculadora(opcion, numero1, numero2)

    if resultado is not None:
        print(f"El resultado es: {resultado:g}")
