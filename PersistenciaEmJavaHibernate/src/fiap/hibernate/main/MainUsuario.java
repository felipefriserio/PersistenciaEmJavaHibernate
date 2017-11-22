package fiap.hibernate.main;

import fiap.hibernate.helper.UsuarioHelper;
import fiap.hibernate.modelo.Usuario;

public class MainUsuario {

	public static void main(String[] args) {
		UsuarioHelper uh = new UsuarioHelper();
		uh.salvarUsuario(new Usuario("nome","email"));
		
	}
}
