from psycopg2 import pool
# psycopg2 as bd -> esta es otra manera de importar el psycopg2
from logger_base import log
import sys


# Trabajamos con metodos y atributos de clase
class Conexion:
    # Conectamos a la base de datos
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    # Creamos variable de clase
    _MIN_CON = 1
    _MAX_CON = 5
    _pool = None

    #Metodo para la conexion
    @classmethod
    def obtenerConexion(cls):
        conexion = cls.obtenerPool().getconn()
        log.debug(f'Conexion obtenida del pool: {conexion}')
        return conexion
