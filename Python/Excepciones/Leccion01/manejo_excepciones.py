from NumerosIgualesException import NumerosIgualesException
resultado = None
<<<<<<< HEAD

=======
>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee
try:
    a = int(input("Digite el primer numero: "))
    b = int(input("Digite el segundo numero: "))
    if a == b:
        raise NumerosIgualesException("Son numeros iguales")
    resultado = a / b  # modificamos
except TypeError as e:
<<<<<<< HEAD
    print(f" TypeError - Ocurrio un error: {type(e)}")
except ZeroDivisionError as e:
    print(f" ZeroDivisionError - Ocurrio un error: {type(e)}")
except Exception as e:
    print(f" Exception - Ocurrio un error: {type(e)}")
else:
    print("No se arrojo ninguna excepcion")
finally:
    print("Ejecucion de este bloque finally")
        
print(f"El resultado es: {resultado}")
print("Seguimos...")
=======
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
>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee
