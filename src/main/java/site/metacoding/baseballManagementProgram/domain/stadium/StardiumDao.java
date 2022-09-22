package site.metacoding.baseballManagementProgram.domain.stadium;

import java.util.List;

public interface StardiumDao {
	public void insert(Stadium stadium);
	public void deleteById(Integer id);
	public Stadium findById(Integer id);
	public List<Stadium> findAll();
}
