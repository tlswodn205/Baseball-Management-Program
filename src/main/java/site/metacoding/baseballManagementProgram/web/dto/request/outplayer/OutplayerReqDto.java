package site.metacoding.baseballManagementProgram.web.dto.request.outplayer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OutplayerReqDto {
	private String reason;
	private String playerName;
	private int playerId;
}
