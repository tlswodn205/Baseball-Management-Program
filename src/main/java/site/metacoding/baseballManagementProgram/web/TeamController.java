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
import site.metacoding.baseballManagementProgram.domain.stadium.Stadium;
import site.metacoding.baseballManagementProgram.domain.team.Team;
import site.metacoding.baseballManagementProgram.service.StadiumService;
import site.metacoding.baseballManagementProgram.service.TeamService;
import site.metacoding.baseballManagementProgram.web.dto.request.ChangeNameDto;
import site.metacoding.baseballManagementProgram.web.dto.request.team.JoinTeamDto;
import site.metacoding.baseballManagementProgram.web.dto.response.CMRespDto;
import site.metacoding.baseballManagementProgram.web.dto.response.team.TeamListDto;

@RequiredArgsConstructor
@Controller
public class TeamController {
	
	public final TeamService teamService;
	public final StadiumService stadiumService;
	
	@GetMapping("/teamList")
	public String getTeamList(Model model) {
		List<TeamListDto> teamList = teamService.팀목록보기();
		model.addAttribute("teamList", teamList);
		return "/team/teamList";
	}
	

	@GetMapping("/teamSaveForm")
	public String getTeamSaveForm(Model model) {
		List<Stadium> stadiumList = stadiumService.구장모두보기();
		model.addAttribute("stadiumList", stadiumList);
		return "team/teamSaveForm";
	}
	
	@PostMapping("/joinTeam")
	public @ResponseBody CMRespDto<?> joinTeam(@RequestBody JoinTeamDto joinTeamDto){
		System.out.println(joinTeamDto.getStadiumId());
		teamService.팀등록(joinTeamDto);
		return new CMRespDto<>(1, "팀등록완료", null);
	}
	

	@GetMapping("/team/{id}/delete")
	public String teamDelete(@PathVariable int id){
		System.out.println(id);
		teamService.팀해체(id);
		return "redirect:/teamList";
	}
	
	@GetMapping("/team/{id}/update")
	public String teamUpdateForm(@PathVariable int id , Model model){
		Team team = teamService.팀한건보기(id);
		model.addAttribute("team" , team);
		return "/team/updateForm";
	}
	
	@PutMapping("/teamUpdate")
	public @ResponseBody CMRespDto<?> teamUpdate(@RequestBody ChangeNameDto changeNameDto){
		teamService.팀이름변경(changeNameDto);
		return new CMRespDto<>(1, "팀이름 수정완료", null);
	}
}
