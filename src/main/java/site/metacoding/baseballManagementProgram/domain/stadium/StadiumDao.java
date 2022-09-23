package site.metacoding.baseballManagementProgram.domain.stadium;

import java.util.List;

import site.metacoding.baseballManagementProgram.web.dto.request.ChangeNameDto;
import site.metacoding.baseballManagementProgram.web.dto.request.stadium.StadiumNameDto;

public interface StadiumDao {
	public void insert(StadiumNameDto stadiumNameDto);
	public void deleteById(Integer id);
	public void update(ChangeNameDto changeNameDto);
	public Stadium findById(Integer id);
	public List<Stadium> findAll();
}
