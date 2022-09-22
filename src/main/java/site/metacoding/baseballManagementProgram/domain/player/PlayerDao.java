package site.metacoding.baseballManagementProgram.domain.player;

import java.util.List;

public interface PlayerDao {
	public void insert(Player player);
	public void deleteById(Integer id);
	public void deleteByTeamId(Integer teamId);
	public void update(Player player);
	public List<Player> findAll();
	public Player findById(Integer id);
	public List<Player> findByTeamId(Integer teamId);
	public Player findByPositionAndTeamId(Integer position, Integer teamId);
}
