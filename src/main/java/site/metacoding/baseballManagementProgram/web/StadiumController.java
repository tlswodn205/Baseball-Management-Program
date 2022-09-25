package site.metacoding.baseballManagementProgram.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagementProgram.domain.stadium.Stadium;
import site.metacoding.baseballManagementProgram.service.StadiumService;
import site.metacoding.baseballManagementProgram.web.dto.request.ChangeNameDto;
import site.metacoding.baseballManagementProgram.web.dto.request.stadium.StadiumNameDto;
import site.metacoding.baseballManagementProgram.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	
	
	public final StadiumService stadiumService;
	
	@GetMapping({"/", "/stadiumList"})
	public String getStadiumList(Model model) {
		List<Stadium> stadiumList = stadiumService.구장모두보기();
		model.addAttribute("stadiumList", stadiumList);
		return "stadium/stadiumList";
	}
	
	@GetMapping("/stadiumSaveForm")
	public String getStadiumSaveForm(Model model) {
		return "stadium/stadiumSaveForm";
	}
	
	@PostMapping("/stadiumSave")
	public @ResponseBody CMRespDto<?> stadiumSave(@RequestBody StadiumNameDto stadiumNameDto){
		stadiumNameDto.getStadiumName();
		stadiumService.구장추가(stadiumNameDto);
		return new CMRespDto<>(1, "구장추가 완료", null);
	}
	
	@GetMapping("/stadium/{id}/delete")
	public String stadiumDelete(@PathVariable int id){
		System.out.println(id);
		stadiumService.구장삭제(id);
		return "/stadium/stadiumList";
	}
	
	@GetMapping("/stadium/{id}/update")
	public String stadiumUpdateForm(@PathVariable int id , Model model){
		Stadium stadium = stadiumService.구장한건보기(id); 
		model.addAttribute("stadium" , stadium);
		return "/stadium/updateForm";
	}
	
	@PutMapping("/stadiumUpdate")
	public @ResponseBody CMRespDto<?> stadiumUpdate(@RequestBody ChangeNameDto changeNameDto){
		System.out.println(changeNameDto.getId());
		stadiumService.구장이름변경(changeNameDto);
		return new CMRespDto<>(1, "구장이름 수정완료", null);
	}
} 
