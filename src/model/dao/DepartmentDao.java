package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj); // incluir
	void update(Department obj); // alterar
	void deleteById(Integer id); // deletar
	Department findById(Integer id); //consultar no banco o obj pelo ID
	List<Department> findAll(); //retornar todos os departamentos

		
}
