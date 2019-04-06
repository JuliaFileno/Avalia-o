package br.com.etechoracio.avaliacao.business;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.avaliacao.dao.DisciplinaDAO;
import br.com.etechoracio.avaliacao.model.Disciplina;
import br.com.etechoracio.common.business.BaseSB;


@Service
public class DisciplinaSB extends BaseSB{
	
	private DisciplinaDAO disciplinaDAO;

	@Override
	protected void postConstructImpl() {
		setDisciplinaDAO(getDAO(DisciplinaDAO.class));
		
	}

	public DisciplinaDAO getDisciplinaDAO() {
		return disciplinaDAO;
	}

	public void setDisciplinaDAO(DisciplinaDAO disciplinaDAO) {
		this.disciplinaDAO = disciplinaDAO;
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void onSave(Disciplina disciplina) {
		disciplinaDAO.save(disciplina);
	}

	
}
