package compilador;

public class IdentificadorBean {
/*DEFINICIONES*/
    private String nombre;
    private Terminal tipo;
    private int valor;
    
    
/*CONSTRUCTOR*/
    public IdentificadorBean(String nombre, Terminal tipo, int valor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
    }

    
/*METODOS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Terminal getTipo() {
        return tipo;
    }

    public void setTipo(Terminal tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
