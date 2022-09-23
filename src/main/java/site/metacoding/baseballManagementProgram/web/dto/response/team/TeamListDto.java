package site.metacoding.baseballManagementProgram.web.dto.response.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamListDto {
	private Integer id;
	private String teamName;
	private Integer stadiumId;
	private Timestamp createAt;
	private String StadiumName;
	private Integer rankId;
}
