public class BicicletaNuevo {
    private String marca;
    private String modelo;

    public BicicletaNuevo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Clase anidada Rueda
    public class Rueda {
        private int tamaño;
        private String material;

        public Rueda(int tamaño, String material) {
            this.tamaño = tamaño;
            this.material = material;
        }

        public int getTamaño() {
            return tamaño;
        }

        public String getMaterial() {
            return material;
        }
    }

  

    // Clase anidada Cuadro
    public class Cuadro {
        private String material;
        private String color;

        public Cuadro(String material, String color) {
            this.material = material;
            this.color = color;
        }

        public String getMaterial() {
            return material;
        }

        public String getColor() {
            return color;
        }
    }
}
