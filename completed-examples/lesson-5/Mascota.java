public class Mascota {
    private String nombre;
    private String tipo;
    private int nivelEnergia;

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivelEnergia = 100;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getNivelEnergia() { return nivelEnergia; }
    public void setNivelEnergia(int nivelEnergia) { this.nivelEnergia = nivelEnergia; }

    public void alimentar() {
        nivelEnergia += 20;
        if (nivelEnergia > 100) {
            nivelEnergia = 100;
        }
        System.out.println(nombre + " comió. Energía: " + nivelEnergia);
    }

    public void jugar() {
        if (nivelEnergia >= 20) {
            nivelEnergia -= 20;
            System.out.println(nombre + " jugó. Energía: " + nivelEnergia);
        } else {
            System.out.println(nombre + " tiene sueño y no puede jugar.");
        }
    }

    public void dormir() {
        nivelEnergia = 100;
        System.out.println(nombre + " durmió. Energía: " + nivelEnergia);
    }
}
