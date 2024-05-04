from Empleado import Empleado
from Gerente import Gerente

def imprimir_detalles(objeto):
    print(objeto)
    print(type(objeto))
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente):
        print(objeto.departamento)

empleado = Empleado("ariel",5000.00)
imprimir_detalles(empleado)

gerente = Gerente("natalia",6000.00, "sistemas")
imprimir_detalles(gerente)