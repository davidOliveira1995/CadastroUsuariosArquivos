import java.util.List;

public class UsuarioService {

    private UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public void cadastrar(Usuario usuario) {
        repo.salvar(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void mostrarTodos() {
        List<Usuario> usuarios = repo.listar();
        System.out.println("\n--- Lista de Usuários ---");
        for (Usuario u : usuarios) {
            System.out.println("Nome: " + u.getNome() + ", Idade: " + u.getIdade());
        }
    }
}
