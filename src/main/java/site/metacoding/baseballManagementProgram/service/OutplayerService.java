package site.metacoding.baseballManagementProgram.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagementProgram.domain.outplayer.Outplayer;
import site.metacoding.baseballManagementProgram.domain.outplayer.OutplayerDao;
import site.metacoding.baseballManagementProgram.domain.player.Player;
import site.metacoding.baseballManagementProgram.domain.player.PlayerDao;
import site.metacoding.baseballManagementProgram.web.dto.request.outplayer.OutplayerReqDto;
import site.metacoding.baseballManagementProgram.web.dto.response.outplayer.OutplayerListDto;

@RequiredArgsConstructor
@Service
public class OutplayerService {
	
	public final OutplayerDao outplayerDao;
	public final PlayerDao playerDao;
	
	public List<Outplayer> 퇴출선수전체보기() {
		List<Outplayer> outplayerList = outplayerDao.findAll();
		return outplayerList;
	}
	
	public List<OutplayerListDto> 퇴출선수목록보기(){
		List<OutplayerListDto> outplayerListDtoList = outplayerDao.findOutplayerList();
		return outplayerListDtoList;
	}
	
	public void 선수퇴출(OutplayerReqDto outplayerReqDto) {
		Player player = playerDao.findById(outplayerReqDto.getPlayerId());
		playerDao.deleteById(outplayerReqDto.getPlayerId());
		outplayerReqDto.setPlayerName(player.getPlayerName());
		outplayerDao.insert(outplayerReqDto);
	}
}

