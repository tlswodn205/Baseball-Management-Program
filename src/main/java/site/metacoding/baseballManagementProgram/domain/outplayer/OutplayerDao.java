package site.metacoding.baseballManagementProgram.domain.outplayer;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OutplayerDao {
	public void insert(Outplayer outplayer);
	public void reasonUpdate(@Param("id") Integer id, @Param("reason") String reason);
	public List<Outplayer> findAll();
	public Outplayer findById(int id);
}
