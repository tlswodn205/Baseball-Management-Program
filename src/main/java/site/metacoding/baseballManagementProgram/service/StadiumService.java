package site.metacoding.baseballManagementProgram.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagementProgram.domain.outplayer.OutplayerDao;
import site.metacoding.baseballManagementProgram.domain.player.Player;
import site.metacoding.baseballManagementProgram.domain.player.PlayerDao;
import site.metacoding.baseballManagementProgram.domain.stadium.Stadium;
import site.metacoding.baseballManagementProgram.domain.stadium.StadiumDao;
import site.metacoding.baseballManagementProgram.domain.team.Team;
import site.metacoding.baseballManagementProgram.domain.team.TeamDao;
import site.metacoding.baseballManagementProgram.web.dto.request.ChangeNameDto;

@RequiredArgsConstructor
@Service
public class StadiumService {
	
	public final StadiumDao stadiumDao;
	public final TeamDao teamDao;
	public final PlayerDao playerDao;
	public final OutplayerDao outplayerDao;
	
	
	public void 구장추가(String stadiumName) {
		stadiumDao.insert(stadiumName);
	}
	
	public void 구장삭제(Integer id) {
//		String reason = "구장 탈퇴로 인하여 팀해체됨.";
//		Stadium stadium = stadiumDao.findById(id);
//		Team team = teamDao.findByStadiumId(stadium.getId());
//		List<Player> playerList = playerDao.findByTeamId(team.getId());
//		for (Player player : playerList) {
//			outplayerDao.insert(player.playerOut(reason));
//		}
//		playerDao.deleteByTeamId(team.getId());
//		teamDao.deleteByStadiumId(stadium.getId());
//		stadiumDao.deleteById(id);
	}
	
	public void 구장이름변경(ChangeNameDto changeNameDto) {
		stadiumDao.update(changeNameDto);
	}
	
	public List<Stadium> 구장모두보기(){
		List<Stadium> stadiumList = stadiumDao.findAll();
		return stadiumList;
	}
	
	public Stadium 구장한건보기(Integer id) {
		Stadium stadium = stadiumDao.findById(id);
		return stadium;
	}
}
