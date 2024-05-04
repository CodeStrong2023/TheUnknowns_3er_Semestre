class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other):
        return f'{self.nombre} {other.nombre}'

    def __sub__(self, otro): #resta
        return self.edad - otro.edad
    #sintaxis: deberia ser la siguiente persona1.__add__(persona2)
persona1 = Persona('Ariel', 40)
persona2 = Persona('Betancud', 5)
#esto es lo que sucede al poner al exponer un objeto con el otro, esta es la sintaxis automatica usando el operado de suma en el medio
#Sintaxis interna y autometica
persona1.__add__(persona2)

#No hace falta llamar al metodo dunder add (hacemos una sobreescritura)
print(persona1 + persona2)
print(persona1 - persona2)
