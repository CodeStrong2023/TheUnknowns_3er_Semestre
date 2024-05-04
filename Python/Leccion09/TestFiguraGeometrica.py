from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

print("Creacion de objeto clase cuadrado".center(50,"_"))


cuadrado1 = Cuadrado(8, "Azul")
cuadrado1.alto = 7
cuadrado1.ancho = 7

#imprimimos los valores del objeto cuadrado1
# print(cuadrado1.ancho)
# print(cuadrado1.alto)
print(f'Calculo del area del cuadrado: {cuadrado1.calcular_area()}')

print(cuadrado1)

#Metodo MRO mostramos la herencia en orden de las clases
# print(Cuadrado.mro())