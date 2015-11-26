package datospersoais;

public class DatosPersoais {
    
    private String nome, correoE, telefono;

    public DatosPersoais(String nome, String correoE, String telefono) {
        this.nome = nome;
        this.correoE = correoE;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "DatosPersoais{" + "nome=" + nome + ", correoE=" + correoE + ", telefono=" + telefono + '}';
    }
    
    
}
