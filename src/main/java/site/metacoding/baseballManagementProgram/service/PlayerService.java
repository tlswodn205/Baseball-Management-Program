package site.metacoding.baseballManagementProgram.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagementProgram.domain.outplayer.Outplayer;
import site.metacoding.baseballManagementProgram.domain.outplayer.OutplayerDao;
import site.metacoding.baseballManagementProgram.domain.player.Player;
import site.metacoding.baseballManagementProgram.domain.player.PlayerDao;
import site.metacoding.baseballManagementProgram.web.dto.request.player.JoinPlayerDto;

@RequiredArgsConstructor
//@Service
public class PlayerService {
	
	public final PlayerDao playerDao;
	public final OutplayerDao outPlayerDao;
	
	public void 선수추가(JoinPlayerDto joinPlayerDto) {
		playerDao.insert(joinPlayerDto);
	}
	
	public void 선수삭제(int id, String reason) {
		Player player = playerDao.findById(id);
		playerDao.deleteById(id);
		outPlayerDao.insert(player.playerOut(reason));
	}
	
	public void 포지션변경(int id, String positions) {
		Player player = playerDao.findById(id);
		player.setPositions(positions);
		playerDao.update(player);
	}
	
	public List<Player> 모든선수목록보기(){
		List<Player> playerList = playerDao.findAll();
		return playerList;
	}
	
	public List<Player> 팀선수목록(int teamId){
		List<Player> playerList = playerDao.findByTeamId(teamId);
		return playerList;
	}
}