package br.com.etechoracio.avaliacao.business;


import java.util.List;

import org.springframework.stereotype.Service;

import br.com.etechoracio.avaliacao.dao.ProfessorDAO;
import br.com.etechoracio.avaliacao.model.Professor;
import br.com.etechoracio.common.business.BaseSB;

@Service
public class ProfessorSB extends BaseSB {
	
	private ProfessorDAO professorDAO;

	@Override
	protected void postConstructImpl() {
		setProfessorDAO(getDAO(ProfessorDAO.class));
		
	}

	public ProfessorDAO getProfessorDAO() {
		return professorDAO;
	}

	public void setProfessorDAO(ProfessorDAO professorDAO) {
		this.professorDAO = professorDAO;
	}

	public List<Professor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
