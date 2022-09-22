package site.metacoding.baseballManagementProgram.domain.outplayer;

import java.util.List;

public interface OutplayerDao {
	public void insert(Outplayer outplayer);
	public void reasonUpdate(Integer id, String reason);
	public List<Outplayer> findAll();
	public Outplayer findById(int id);
}
