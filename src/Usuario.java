import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {

    private Integer id;
    private String nome;
    private Date dataNascimento;
    private String email;
    private Boolean status = true;
    private List<Livro> historicoEmprestimos = new ArrayList<>();

    public Integer getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Livro> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void setHistoricoEmprestimos(List<Livro> historicoEmprestimos) {
        this.historicoEmprestimos = historicoEmprestimos;
    }

    public Boolean isAdimplente() {
        return this.status;
    }

    public String statusUsuario(){
        return status ? "Adimplente" : "Inadimplente";
    }

    public void adicionarHistorico(Livro livro) {
        historicoEmprestimos.add(livro);
    }
}
