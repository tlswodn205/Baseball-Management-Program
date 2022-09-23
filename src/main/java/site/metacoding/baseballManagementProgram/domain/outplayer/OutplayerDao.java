package site.metacoding.baseballManagementProgram.domain.outplayer;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import site.metacoding.baseballManagementProgram.web.dto.request.outplayer.OutplayerReqDto;
import site.metacoding.baseballManagementProgram.web.dto.response.outplayer.OutplayerListDto;

public interface OutplayerDao{
	public void insert(OutplayerReqDto outplayerReqDto);
	public void reasonUpdate(@Param("id") Integer id, @Param("reason") String reason);
	public List<Outplayer> findAll();
	public Outplayer findById(int id);
	public List<OutplayerListDto> findOutplayerList();
}
