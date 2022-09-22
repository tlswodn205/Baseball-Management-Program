package site.metacoding.baseballManagementProgram.domain.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {
	private Integer id;
	private String teamName;
	private Integer stadiumId;
	private Timestamp createAt;
}
