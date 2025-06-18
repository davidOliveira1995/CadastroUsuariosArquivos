public class Usuario {

    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + "," + idade;
    }

    public static Usuario fromString(String linha) {
        String[] partes = linha.split(",");
        return new Usuario(partes[0], Integer.parseInt(partes[1]));
    }
}