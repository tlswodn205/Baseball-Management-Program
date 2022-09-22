package site.metacoding.baseballManagementProgram.domain.player;

import java.util.List;

public interface PlayerDao {
	public void insert(Player player);
	public void deleteById(Integer id);
	public void deleteByTeamId(Integer teamId); //팀에서 사용할 예정
	public void update(Player player); //포지션 변경
	public List<Player> findAll();
	public Player findById(Integer id); //영속화
	public List<Player> findByTeamId(Integer teamId);
	public Player findByPositionAndTeamId(Integer position, Integer teamId); //포지션별로 찾기
}
