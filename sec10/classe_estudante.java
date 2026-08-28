package sec10;
public class classe_estudante {
    
    private String nome;
    private String email;
    private int local;
   
   
    public classe_estudante(String nome, String email, int local) {
        this.nome = nome;
        this.email = email;
        this.local = local;
       
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getLocal() {
        return local;
    }
    public void setLocal(int local) {
        this.local = local;
    }
    
    
}
