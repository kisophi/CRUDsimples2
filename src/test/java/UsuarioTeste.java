import br.com.akira.dao.UsuarioDAO;
import br.com.akira.entidade.Usuario;

public class UsuarioTeste {
	public static void main(String[] args) {
		
		UsuarioDAO dao = new UsuarioDAO();
		Usuario usuBuscado = dao.buscaPorId(1);
		
		System.out.println(usuBuscado.getNome());
	}
}
