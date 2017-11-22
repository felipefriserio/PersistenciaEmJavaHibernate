package fiap.hibernate.helper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import fiap.hibernate.core.HibernateUtil;
import fiap.hibernate.modelo.Usuario;


public class UsuarioHelper {
	Session session = null;

	public UsuarioHelper(){
		session = HibernateUtil.getSessionFactory().getCurrentSession();
	}

	public List<Usuario> getUsuarios() {
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			Query q = session.createQuery("from Usuario");
			lista = q.list();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return lista;
	}

	public String salvarUsuario(Usuario p) {
		try {
			Transaction tx = (Transaction) session.beginTransaction();
			session.save(p);
			tx.commit();
			return "Dados inseridos";
		} catch (Exception ex) {
			return ex.getMessage();
		}
	}

}
