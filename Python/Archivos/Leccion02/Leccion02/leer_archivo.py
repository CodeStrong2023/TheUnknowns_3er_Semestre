archivo = open('prueba.txt', 'r', encoding='utf8')# las letras son: "r" read, "a"append, "w"write, "x"
#print(archivo.read())
#print(archivo.read(16))
#print(archivo.read(10)) # continuamos desde la linea anterior
#print(archivo.readline())
#print(archivo.readline())

#vamos a iterar el archivo, cada una de las lineas
#for linea in archivo:
    #print(linea): iteramos todos los elementos del archivo
    #print(archivo.readlines()): accedemos al archivo como si fuera una lista
print(archivo.readlines()[11])