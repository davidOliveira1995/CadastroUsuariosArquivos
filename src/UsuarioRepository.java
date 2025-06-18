import java.io.*;
import java.util.*;

public class UsuarioRepository {
    private String caminhoArquivo = "usuarios.txt";

    public void salvar(Usuario usuario) {
        try (FileWriter fw = new FileWriter(caminhoArquivo, true)) {
            fw.write(usuario.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(caminhoArquivo))) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();

                // Ignora linhas vazias ou mal formatadas
                if (linha.trim().isEmpty() || !linha.contains(",")) continue;

                usuarios.add(Usuario.fromString(linha));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo ainda não existe.");
        }

        return usuarios;
    }
}