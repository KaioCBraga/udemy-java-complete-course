package s10MemoriaANDArrayANDListas.Exercicios.Desafio001.entities;

public class Quarto {
    private String nomePessoa;
    private String emailPessoa;
    private int numQuarto;

    public Quarto() {
    }

    public Quarto(String nomePessoa, String emailPessoa) {
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
    }

    public Quarto(String nomePessoa, String emailPessoa, int numQuarto) {
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
        this.numQuarto = numQuarto;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    @Override
    public String toString() {
        return numQuarto + ": " + nomePessoa + ","
                + emailPessoa;
    }
}
