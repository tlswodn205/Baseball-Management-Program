package site.metacoding.baseballManagementProgram.web.dto.response.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class playerListDto {
	private Integer id;
	private String playerName;
	private Integer teamId;
	private String positions;
	private Timestamp createAt;
	private String teamName;
	private Integer rankId;
		
}
