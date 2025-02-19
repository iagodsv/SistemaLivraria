import java.util.Date;

public class Livro {


    private Integer id;
    private String titulo;
    private Autor autor;
    private Boolean disponivel = true ;
    private Date dataCadastro;
    private Date dataAtualizacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Livro() {
    }



    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Boolean isDisponivel(){
        return this.disponivel;
    }

    public String getDisponibilidade(){
        return disponivel ? "Disponível" : "Não disponível";
    }

}

