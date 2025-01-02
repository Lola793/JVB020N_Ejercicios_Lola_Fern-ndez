package Logic;

public class Consultas {
    private final String cliente;
    private final String consulta;

    public Consultas(String cliente, String consulta) {
        this.cliente = cliente;
        this.consulta = consulta;
    }

    public String getCliente() {
        return cliente;
    }

    public String getConsulta() {
        return consulta;
    }
}
