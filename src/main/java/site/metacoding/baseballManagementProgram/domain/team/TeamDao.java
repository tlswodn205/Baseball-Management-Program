package site.metacoding.baseballManagementProgram.domain.team;

import java.util.List;

import site.metacoding.baseballManagementProgram.web.dto.request.ChangeNameDto;
import site.metacoding.baseballManagementProgram.web.dto.request.team.JoinTeamDto;
import site.metacoding.baseballManagementProgram.web.dto.response.team.TeamListDto;

public interface TeamDao {
	public void insert(JoinTeamDto joinTeamDto);
	public void deleteById(Integer id); 
	public void deleteByStadiumId(Integer stadiumId); //스타디움 삭제시 사용
	public void update(ChangeNameDto changeNameDto); //팀 이름 변경
	public List<Team> findAll(); 
	public List<TeamListDto> findTeamList();
	public Team findById(Integer id);
	public Team findByStadiumId(Integer stadiumId); //스타디움 삭제시 사용
}
