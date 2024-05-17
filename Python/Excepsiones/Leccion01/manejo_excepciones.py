from NumerosIgualesException import NumerosIgualesException
resultado = None
try:
    a = int(input("Digite el primer numero: "))
    b = int(input("Digite el segundo numero: "))
    if a == b:
        raise NumerosIgualesException("Son numeros iguales")
    resultado = a / b  # modificamos
except TypeError as e: