package site.metacoding.baseballManagementProgram.domain.team;

import java.util.List;

public interface TeamDao {
	public void insert(Team team);
	public void deleteById(Integer id);
	public void deleteByStadiumId(Integer stadiumId);
	public void update(Team team);
	public List<Team> findAll();
	public Team findById(Integer id);
}
