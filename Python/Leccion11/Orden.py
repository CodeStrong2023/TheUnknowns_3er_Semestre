from Producto import Producto


class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)

    def agregar_producto(self,producto):
        self._productos.append(producto) #agragar nuevo producto

    def calcular_total(self):
        total = 0 #cariable temporal para almacenar el total
        for producto in self._productos:
            total += producto.precio
        return total

    def __str__(self):
        productos_str = ""
        for producto in self._productos:
            productos_str += producto.__str__()+'|'
        return f'Orden: {self.id_orden}, \nProducto: {productos_str}'

if __name__ == '__main__': #solo sera visible se la prueba y ejecuta desde aqui
    producto1 = Producto("camiseta", 100.00)
    producto2 = Producto("pantalon", 150.00)
    productos1 = [producto1,producto2] #lista de productos
    orden1 = Orden(productos1) # primer objeto orden pasando la lista de productos
    print(orden1)

    #Tarea : modificar la orden2, ingresando nuevos productos con sus nombres y precios
    #crear una nueva lista de productos y agregarla a la orden2
    producto3 = Producto("Campera",500.00)
    producto4 = Producto("Buzo",200.00)
    producto5 = Producto("Zapatillas",300.00)

    lista_productos = [producto3, producto4, producto5]
    orden2 = Orden(lista_productos)
    print(orden2)
