public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return String.format("CPF: %s\nNome: %s\nTelefone: %s", this.cpf, this.nome, this.telefone);
    }
}
