from NumerosIgualesException import NumerosIgualesException
resultado = None
try:
    a = int(input("Digite el primer numero: "))
    b = int(input("Digite el segundo numero: "))
    if a == b:
        raise NumerosIgualesException("Son numeros iguales")
    resultado = a / b  # modificamos
except TypeError as e:
    print(f'TypeError - Ocurrió un error: {type(e)}')  # clase 4
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrió un error: {type(e)}')  # clase 4
except Exception as e:  # Esta clase de error debe ir al final  #clase 2
    print(f'Exception  - Ocurrió un error: {type(e)}')  # clase 2
else:  # clase 6
    print('No se arrojo ninguna excepcion')  # clase 6
finally:  # Siempre se va a ejecutar   #clase 6
    print("Ejecución de este bloque finally")  # clase 6
print(f'El resultado es: {resultado}')  # clase 3
print('seguimos...')  # clase 3
