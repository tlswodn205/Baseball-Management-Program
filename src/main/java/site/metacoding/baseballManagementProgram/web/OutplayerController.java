package site.metacoding.baseballManagementProgram.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagementProgram.domain.outplayer.Outplayer;
import site.metacoding.baseballManagementProgram.domain.player.Player;
import site.metacoding.baseballManagementProgram.domain.team.Team;
import site.metacoding.baseballManagementProgram.service.OutplayerService;
import site.metacoding.baseballManagementProgram.service.PlayerService;
import site.metacoding.baseballManagementProgram.web.dto.request.outplayer.OutplayerReqDto;
import site.metacoding.baseballManagementProgram.web.dto.response.CMRespDto;
import site.metacoding.baseballManagementProgram.web.dto.response.outplayer.OutplayerListDto;
import site.metacoding.baseballManagementProgram.web.dto.response.player.playerListDto;

@RequiredArgsConstructor
@Controller
public class OutplayerController {
	
	public final OutplayerService outplayerService;
	public final PlayerService playerService;
	
	@GetMapping("/playerOut")
	public String playerOutForm(Model model) {
		List<Player> playerList = playerService.모든선수보기();
		model.addAttribute("playerList", playerList);
		return "outplayer/playerOut";
	}
	
	@PostMapping("/outplayer/insert")
	public @ResponseBody CMRespDto<?> playerOut(@RequestBody OutplayerReqDto outplayerReqDto){
		outplayerService.선수퇴출(outplayerReqDto);
		return new CMRespDto<>(1, "선수 퇴출 성공", null);
	}
	
	@GetMapping("/outplayerList")
	public String getTeamList(Model model) {
		List<OutplayerListDto> outplayerList = outplayerService.퇴출선수목록보기();
		model.addAttribute("outplayerList", outplayerList);
		return "/outplayer/outplayerList";
	}
	
}
