package site.metacoding.baseballManagementProgram.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagementProgram.domain.outplayer.Outplayer;
import site.metacoding.baseballManagementProgram.domain.outplayer.OutplayerDao;
import site.metacoding.baseballManagementProgram.domain.player.Player;
import site.metacoding.baseballManagementProgram.domain.player.PlayerDao;
import site.metacoding.baseballManagementProgram.web.dto.request.player.JoinPlayerDto;
import site.metacoding.baseballManagementProgram.web.dto.request.player.PivotPlayerPosition;
import site.metacoding.baseballManagementProgram.web.dto.request.player.PlayerUpdateDto;
import site.metacoding.baseballManagementProgram.web.dto.response.player.DeleteCheckedPlayerDto;
import site.metacoding.baseballManagementProgram.web.dto.response.player.playerListDto;

@RequiredArgsConstructor
@Service
public class PlayerService {
	
	public final PlayerDao playerDao;
	public final OutplayerDao outPlayerDao;
	
	public void 선수추가(JoinPlayerDto joinPlayerDto) {
		playerDao.insert(joinPlayerDto);
	}
	
	public void 선수삭제(Integer id, String reason) {
		Player player = playerDao.findById(id);
		playerDao.deleteById(id);
		outPlayerDao.insert(player.playerOut(reason));
	}
	
	public void 정보변경(PlayerUpdateDto playerUpdateDto) {
		playerDao.update(playerUpdateDto);
	}
	
	public List<Player> 모든선수보기(){
		List<Player> playerList = playerDao.findAll();
		return playerList;
	}
	
	public Player 선수한건보기(Integer id) {
		Player player = playerDao.findById(id);
		return player;
	}
	
	public List<Player> 팀선수목록(Integer teamId){
		List<Player> playerList = playerDao.findByTeamId(teamId);
		return playerList;
	}
	
	public List<playerListDto> 선수목록보기(){
		List<playerListDto> playerList = playerDao.findPlayerList();
		return playerList;
	}
	
	public List<PivotPlayerPosition> 포지션별선수보기() {
		List<PivotPlayerPosition> playerList = playerDao.findPlayerPosition();
		System.out.println(playerList.get(0).getTeamName());
		return playerList;
	}
	
	public void 선수동시삭제(DeleteCheckedPlayerDto deleteCheckedPlayerDto) {
		Integer[] ids =deleteCheckedPlayerDto.getIds();
		String reason = "단체퇴출";
		for (Integer id : ids) {
			Player player = playerDao.findById(id);
			outPlayerDao.insert(player.playerOut(reason));
			playerDao.deleteById(id);
		}
	}
}