package site.metacoding.baseballManagementProgram.domain.stadium;

import java.util.List;

import site.metacoding.baseballManagementProgram.web.dto.request.ChangeNameDto;

public interface StadiumDao {
	public void insert(String stadiumName);
	public void deleteById(Integer id);
	public void update(ChangeNameDto changeNameDto);
	public Stadium findById(Integer id);
	public List<Stadium> findAll();
}
