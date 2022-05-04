// Copiarlo todo en un archivo llamado: 
// Ejemplo.java
// y compliar con:
// javac Ejemplo.java
// para probar con: 
// java SistemaDeVenta
//
class Cliente {
    String nombre;
    Tarjeta tarjeta;

    void comprarArticulo( Articulo a ) {
           tarjeta.cargar ( a.precio() );
     }
}
class Tarjeta {
    void cargar( int precio ) {
         // no hace nada ( por ahora ) 
         System.out.println("Ok, ya tarjeta ahora tiene " + precio + " menos de dinero");
    }
}
class Articulo {
    String nombre;
    int precio;
    int precio() {
        return this.precio;
    }
}
class SistemaDeVenta {

    public static void main( String ... args ) {
        Cliente juan = new Cliente();
        juan.nombre = "Juan";

        Articulo paleta = new Articulo();
        paleta.nombre = "Tutsi";
        paleta.precio    = 10;

         Tarjeta tarjeta = new Tarjeta();

         juan.tarjeta = tarjeta;

         juan.comprarArticulo( paleta );
    }
}