package site.metacoding.baseballManagementProgram.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagementProgram.domain.player.Player;
import site.metacoding.baseballManagementProgram.domain.stadium.Stadium;
import site.metacoding.baseballManagementProgram.domain.team.Team;
import site.metacoding.baseballManagementProgram.service.PlayerService;
import site.metacoding.baseballManagementProgram.service.TeamService;
import site.metacoding.baseballManagementProgram.web.dto.request.ChangeNameDto;
import site.metacoding.baseballManagementProgram.web.dto.request.player.JoinPlayerDto;
import site.metacoding.baseballManagementProgram.web.dto.request.player.PivotPlayerPosition;
import site.metacoding.baseballManagementProgram.web.dto.request.player.PlayerUpdateDto;
import site.metacoding.baseballManagementProgram.web.dto.request.team.JoinTeamDto;
import site.metacoding.baseballManagementProgram.web.dto.response.CMRespDto;
import site.metacoding.baseballManagementProgram.web.dto.response.player.playerListDto;
import site.metacoding.baseballManagementProgram.web.dto.response.team.TeamListDto;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	public final TeamService teamService;
	public final PlayerService playerService;
	
	@GetMapping("/playerList")
	public String getTeamList(Model model) {
		List<playerListDto> playerList = playerService.선수목록보기();
		model.addAttribute("playerList", playerList);
		return "/player/playerList";
	}
	
	@GetMapping("/playerSaveForm")
	public String getTeamSaveForm(Model model) {
		List<Team> teamList = teamService.팀모두보기();
		model.addAttribute("teamList", teamList);
		return "player/playerSaveForm";
	}
	
	@PostMapping("/joinPlayer")
	public @ResponseBody CMRespDto<?> joinTeam(@RequestBody JoinPlayerDto joinPlayerDto){
		playerService.선수추가(joinPlayerDto);
		return new CMRespDto<>(1, "팀등록완료", null);
	}
	
	@GetMapping("/player/{id}/update")
	public String playerUpdateForm(@PathVariable int id , Model model){
		Player player = playerService.선수한건보기(id);
		model.addAttribute("player" , player);
		return "/player/updateForm";
	}
	
	@PutMapping("/playerUpdate")
	public @ResponseBody CMRespDto<?> playerUpdate(@RequestBody PlayerUpdateDto playerUpdateDto){
		System.out.println(playerUpdateDto.getPlayerName());
		playerService.정보변경(playerUpdateDto);
		return new CMRespDto<>(1, "팀이름 수정완료", null);
	}
	
	@GetMapping("/positionList")
	public String getPlayerPositions(Model model) {
		List<PivotPlayerPosition> playerList = playerService.포지션별선수보기();
		model.addAttribute("playerList", playerList);
		return "player/playerPositionList";
	}
	
}
