class Producto{
    static contadorProductos = 0;

    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }
    get idProducto(){
        return this._idProducto;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get precio(){
        return this._precio;
    }

    set precio(precio){
        this._precio = precio;
    }

    toString(){//Template Literals: no permite insertar codigo de manera dinamica
        return `idProducto : ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
    }
}//Fin de la clase Producto

class Orden{

    static contadorOrdenes = 0;
    static getMAX_PRODUCTOS(){// simula una constante
        return 5;
    }

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos =[];
        this._contadorProductosAgregados = 0;
    }

    get idOrden(){
        return this._idOrden;
    }

    AgragarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto);// Tenemos dos tipos de sintaxis 1
            //this._productos[this._contadorProductosAgregados++]=producto;// sntaxis 2
        }
        else{
            console.log("No se pueden agregar mas productos");
        }
    }//fin metodo agregarproducto

    calcularTotal(){
        let totalVenta =0;
        for(let producto of this._productos){
            totalVenta += producto.precio;
        }//fon ciclo for
        return totalVenta;
    }//fin del metodo calcular total

    mostrarOrden(){
        let productoOrden =' ';
        for(let producto of this._productos){
            productoOrden += '\n{ '+producto.toString()+' }';
        }//fin del ciclo for
        console.log(`Orden: ${this._idOrden}, Total: $${this.calcularTotal()}, Productos: ${productoOrden}`);
    }//fin metodo mostrarorden

}//fin de la clase orden 

let producto1 = new Producto('pantalon',200);
let producto2 = new Producto('camisa',150);
let producto3 = new Producto('Cinturon',50)
let orden1 = new Orden();
let orden2 = new Orden();
orden1.AgragarProducto(producto1);
orden1.AgragarProducto(producto2);
orden1.AgragarProducto(producto3);
orden1.AgragarProducto(producto1);
orden1.AgragarProducto(producto2);
orden2.AgragarProducto(producto3);
orden1.mostrarOrden();
orden2.mostrarOrden();


