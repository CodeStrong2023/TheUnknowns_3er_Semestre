#El operador actua como signo +, sumando los numeros
a = 3
b = 5
print(a + b)

#En el string actua concatenando
a = 'Hola '
b = 'mundo'
print(a + b)

#datos de tipo listas, de las dos forma una sola lista, concatenacion de tipo cadena
a = [3, 4, 5]
b =[6, 7, 8, 9]
print(a + b)

# miObjeto1 + miObjeto2 = Esto no se podria hacer, porque el operador de suma necesita hacer una sobre carga
# Para hacer la sobrecarga, hay que sobreescribir el metodo heredado de la clase object, o sea el metodo asociado al operador de suma
