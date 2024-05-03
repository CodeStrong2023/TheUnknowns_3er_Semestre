class FiguraGeometrica(ABC):
    def __init__(self, ancho, alto):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            self._ancho=0
            print(f"El valor es erroneo para el ancho: {ancho}")

        if self._validar_valores(alto):
            self._alto = alto
        else:
            self._alto = 0
            print(f"El valor es erroneo para el alto: {alto}")

            