package site.metacoding.baseballManagementProgram.web.dto.request.outplayer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class OutplayerReqDto {
	private String reason;
	private String playerName;
	private int playerId;
}
