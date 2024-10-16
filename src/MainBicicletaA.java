public class MainBicicletaA {
    public static void main(String[] args) {
        // Crear objeto de la clase externa
        BicicletaNuevo bicicleta = new BicicletaNuevo("Specialized", "Rockhopper");

        // Crear objetos de las clases anidadas
        BicicletaNuevo.Rueda ruedaDelantera = bicicleta.new Rueda(29, "Aluminio");
        
        BicicletaNuevo.Cuadro cuadro = bicicleta.new Cuadro("Carbono", "Rojo");

        // Imprimir los atributos de la bicicleta y sus componentes
        System.out.println("Bicicleta: " + bicicleta.getMarca() + " " + bicicleta.getModelo());
        System.out.println("Ruedas: Tamaño " + ruedaDelantera.getTamaño() + " pulgadas, Material: " + ruedaDelantera.getMaterial());
        System.out.println("Cuadro: Material " + cuadro.getMaterial() + ", Color: " + cuadro.getColor());
    }
}

