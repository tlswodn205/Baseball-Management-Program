package site.metacoding.baseballManagementProgram.web.dto.request.team;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinTeamDto {
	private String teamName;
	private int stadiumId;
}
