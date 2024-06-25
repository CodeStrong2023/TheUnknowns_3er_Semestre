import psycopg2 #Esto es para poder conectar a Postgre

conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona WHERE id_persona IN %s'  #Placeholder
            entrada = input('Diogite los id_personas a buscar (separados por coma): ')
            llaves_primarias = (tuple(entrada.split(', ')),)
            #Le pasamos la variable como tupla, para eso ponemos la , al final
            cursor.execute(sentencia, llaves_primarias) # De esta manera ejecutamos la sentencia
            registros = cursor.fetchall() #Recuperamos todos los registros que seran una lista
            for registro in registros:
                print(registro)
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()