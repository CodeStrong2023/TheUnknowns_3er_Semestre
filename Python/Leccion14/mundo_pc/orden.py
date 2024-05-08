class Orden:

    contador_ordenes = 0

    def _init_(self, computadoras):
        Orden.contador_ordenes += 1
        self._id_orden = Orden.contador_ordenes
        self._computadoras = computadoras

    # Se crea la lista
    def agregar_computadora(self, computadoras):
        self._computadoras.append(computadoras)

    def _str_(self):
        computadoras_str = ''
        for computadora in self._computadoras:
            computadoras_str += computadora._str_()
        return f'''
            Orden: {self._id_orden}
            Computadora: {computadoras_str}
        '''