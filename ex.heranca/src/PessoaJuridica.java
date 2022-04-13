
public class PessoaJuridica extends Pessoa {
    
    private String nome;
    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, String cnpj, String email, String celular) {
        super(email, celular);
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String imprimir(){
    
    return "nome " + nome + "\nCnpj: " + cnpj + "\nEmail" + getEmail() +  "\nCelular" + getCelular();
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


}
