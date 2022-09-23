package site.metacoding.baseballManagementProgram.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagementProgram.domain.outplayer.OutplayerDao;
import site.metacoding.baseballManagementProgram.domain.player.Player;
import site.metacoding.baseballManagementProgram.domain.player.PlayerDao;
import site.metacoding.baseballManagementProgram.domain.team.Team;
import site.metacoding.baseballManagementProgram.domain.team.TeamDao;
import site.metacoding.baseballManagementProgram.web.dto.request.ChangeNameDto;
import site.metacoding.baseballManagementProgram.web.dto.request.team.JoinTeamDto;

//@Service
@RequiredArgsConstructor
public class TeamService {
	
	public final TeamDao teamDao;
	public final PlayerDao playerDao;
	public final OutplayerDao outplayerDao;
	
	public void 팀등록(JoinTeamDto joinTeamDto) {
		teamDao.insert(joinTeamDto);
	}
	
	public void 팀해체(Integer id) {
		String reason = "팀 해체로 인한 퇴출";
		List<Player> playerList = playerDao.findByTeamId(id);
		for (Player player : playerList) {
			outplayerDao.insert(player.playerOut(reason));
		}
		teamDao.deleteById(id);
	}
	
	public void 팀이름변경(ChangeNameDto changeNameDto) {
		teamDao.update(changeNameDto);
	}
	
	public List<Team> 팀모두보기() {
		List<Team> teamList = teamDao.findAll();
		return teamList;
	}
	
	public Team 팀한건보기(Integer id) {
		Team team = teamDao.findById(id);
		return team;
	}
	
}
