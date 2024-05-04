class MiClase:
    #variable de clase, este atributo dara a cada objeto el mismo valor
    variable_clase = "esta es una variable de clase"

    #la variavle de instancia, da diferentes valores
    def __init__(self, variable_instancia):
        self.variable_instancia = variable_instancia
    #metodos estatico se asocia a la clase
    @staticmethod
    def metodo_estatico():
        print(MiClase.variable_clase)

    @classmethod
    def metodo_clase(cls):
        print(cls.variable_clase)

    def metodo_instancia(self):
        self.metodo_clase()
        self.metodo_estatico()
        print(self.variable_clase)
        print(self.variable_instancia)

print(MiClase.variable_clase)
miClase1 = MiClase("esta es una variable de instancia")
print(miClase1.variable_instancia)
print(miClase1.variable_clase)
miClase2 = MiClase("esta es otra prueba de variable de instancia")
print(miClase2.variable_instancia)
print(miClase2.variable_clase)

MiClase.variable_clase2 = "Valor de variable de clase 2"
print(MiClase.variable_clase2)
print(miClase1.variable_clase2)
print(miClase2.variable_clase2)

MiClase.metodo_estatico()
MiClase.metodo_clase()

miObjeto1 = MiClase("Variable de instancia")
miObjeto1.metodo_clase()
miObjeto1.metodo_instancia()