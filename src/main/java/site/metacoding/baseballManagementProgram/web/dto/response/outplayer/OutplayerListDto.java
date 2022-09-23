package site.metacoding.baseballManagementProgram.web.dto.response.outplayer;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutplayerListDto {
	private Integer id;
	private String reason;
	private String playerName;
	private Integer playerId;
	private Timestamp createAt;
	private Integer rankId;
}
