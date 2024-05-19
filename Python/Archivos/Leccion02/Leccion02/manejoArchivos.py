try:
    archivo = open('prueba.txt', 'w', encoding='utf8')  #la W es de write que significa escribir
    archivo.write("Programamos con diferentes tipos de archivos, ahora en txt.\n")  # con .write nos permite escribir dentro del archivo
    archivo.write('Los acentos son iomportantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecición y producción')
    archivo.write('con esto terminamos.')
except Exception as e:
    print(e)
finally:  #siempre se ejecuta
    archivo.close()  #con esto se debe cerrar el archivo

# archivo.write('todo quedo perfecto') Esta linea no se ejecuta porque el archivo esta cerrado

