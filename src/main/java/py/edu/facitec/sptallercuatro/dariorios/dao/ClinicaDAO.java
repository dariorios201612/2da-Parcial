package py.edu.facitec.sptallercuatro.dariorios.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.sptallercuatro.dariorios.model.Clinica;
@Repository
public class ClinicaDAO extends DAOGenerico<Clinica> {


	@PersistenceContext
	private EntityManager em;

	public ClinicaDAO() {
		super(Clinica.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
