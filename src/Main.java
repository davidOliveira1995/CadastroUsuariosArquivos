import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioRepository repo = new UsuarioRepository();
        UsuarioService service = new UsuarioService(repo);

        System.out.println("Cadastro de Usuários");
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        Usuario usuario = new Usuario(nome, idade);
        service.cadastrar(usuario);

        service.mostrarTodos();
    }
}
