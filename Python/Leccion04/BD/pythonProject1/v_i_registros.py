import psycopg2 #Esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_db')
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES (%s, %s, %s)'
            entrada = input('Digite los id_persona a buscar (separados por coma): ')
            valores = (
                ('Carlos', 'Lara', 'clara@gmail.com'),
                ('Marcos', 'Canto', 'mcanton@gmail,com'),
                ('Marcelo', 'Cuenca', 'cuenca@gmail.com')
            )#Es una tupa de tuplas
            cursor.executemany(sentencia, valores) #De esta manera ejecutamos la sentencia
            # conexion.commit() Esto se utiliza para guardar los cambios en la base de datos
            registros_insertados = cursor.rowcount
            print(f'Los registros insertados son: {registros_insertados}')


except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()