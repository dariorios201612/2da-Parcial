package py.edu.facitec.sptallercuatro.dariorios.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.sptallercuatro.dariorios.model.Medico;
@Repository
public class MedicoDAO extends DAOGenerico<Medico> {

	@PersistenceContext
	private EntityManager em;

	public MedicoDAO() {
		super(Medico.class);
	}
	@Override
	protected EntityManager getEntityManager() {

		return em;
	}

}
