public class Ejemplo1 {
    private String puesto;
    private int salario;
    
    public Ejemplo1(String puesto, int salario) {
        this.puesto=puesto;
        this.salario=salario;

    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return puesto+" Salario:"+salario; 
    }
}
