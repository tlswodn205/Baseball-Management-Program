package site.metacoding.baseballManagementProgram.domain.player;

import java.util.List;

import site.metacoding.baseballManagementProgram.web.dto.request.player.JoinPlayerDto;

public interface PlayerDao {
	public void insert(JoinPlayerDto joinPlayerDto);
	public void deleteById(Integer id);
	public void deleteByTeamId(Integer teamId); //팀에서 사용할 예정
	public void update(Player player);
	public List<Player> findAll();
	public Player findById(Integer id); //영속화
	public List<Player> findByTeamId(Integer teamId);
}
