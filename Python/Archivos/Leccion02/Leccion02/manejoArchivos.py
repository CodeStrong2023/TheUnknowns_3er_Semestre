try:
    archivo = open('prueba.txt', 'w', encoding='utf8')  #la W es de write que significa escribir
    archivo.write("Programamos con diferentes tipos de archivos, ahora en txt.\n")  # con .write nos permite escribir dentro del archivo
    archivo.write('Los acentos son iomportantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecición y producción\n')
    archivo.write("las letras son:\n r read(leer),\n a append(anexa),\n w write(escribe),\n x(crea un archivo)\n")
    archivo.write("t text(texto),\n b binary(archivos binarios),\n w+ (lee y escribe a la vez) r+ (son iguales)\n")
    archivo.write("Saludos a todos los alumnos de la tecnicatura\n")
    archivo.write('con esto terminamos.')
except Exception as e:
    print(e)
finally:  #siempre se ejecuta
    archivo.close()  #con esto se debe cerrar el archivo

# archivo.write('todo quedo perfecto') Esta linea no se ejecuta porque el archivo esta cerrado

