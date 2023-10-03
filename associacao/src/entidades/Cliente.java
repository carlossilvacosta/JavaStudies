package entidades;

public class Cliente {

    private String nome;
    private int idade;
    private Conta conta;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.conta = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        this.conta.exibirInformacoes();
    }

    public void abrirConta(String numConta){
        if (this.conta == null){
            System.out.println("Parabéns, vc abriu uma conta!");
            this.conta = new Conta(numConta, this);
        } else {
            System.out.println("Não pode criar mais de uma conta!!!");
        }
    }
}
