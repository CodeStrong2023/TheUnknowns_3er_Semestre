class Producto:
    contador_productos = 0 #variable de clase

    def __init__(self, nombre, precio):
        Producto.contador_productos += 1 #aumento id productos
        self._id_producto = Producto.contador_productos #asignacion variable de clase
        self._nombre = nombre
        self._precio = precio
    #getters y setters
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def precio(self):
        return self._precio

    @precio.setter
    def precio(self, precio):
        self._precio = precio
    #metodo string
    def __str__(self):
        return f'Id Productos: {self._id_producto}, nombre: {self._nombre}, precio: {self._precio}'


if __name__ == '__main__': #solo sera visible se la prueba y ejecuta desde aqui
    producto1 = Producto("camiseta", 100.00)
    print(producto1)
    producto2 = Producto("pantalon", 150.00)
    print(producto2)