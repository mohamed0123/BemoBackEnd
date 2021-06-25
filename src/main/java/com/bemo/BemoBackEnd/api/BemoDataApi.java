package com.bemo.BemoBackEnd.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bemo.BemoBackEnd.dto.BemoDataDto;
import com.bemo.BemoBackEnd.dto.StatusDto;
import com.bemo.BemoBackEnd.repo.BemoDataRepo;

@Service
@EnableMongoRepositories
@CrossOrigin
@RestController
@RequestMapping("/")
public class BemoDataApi {

	@Autowired
	BemoDataRepo bemoDataRepo;

	@GetMapping("/")
	public String greeting() {
		return "It's Working";
	}

	@GetMapping("/all")
	public List<BemoDataDto> findAll() {
		return bemoDataRepo.findAll();
	}

	@PostMapping("/create")
	public StatusDto insert(@RequestBody BemoDataDto htmlFeatureHandlingJPA) {

		StatusDto statusDto = new StatusDto();
		try {
			bemoDataRepo.save(htmlFeatureHandlingJPA);
		} catch (Exception e) {
			e.printStackTrace();
			statusDto.setStatus("Error");
			statusDto.setErrorMessage(e.getMessage());
			return statusDto;
		}
		statusDto.setStatus("Done");

		return statusDto;
	}

	@DeleteMapping("/deleteById/{id}")
	public StatusDto delete(@PathVariable String id) {
		StatusDto statusDto = new StatusDto();
		if (id == null) {
			statusDto.setStatus("Error");
			statusDto.setErrorMessage("You Must Select valid element");
			return statusDto;
		}
		try {
			bemoDataRepo.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
			statusDto.setStatus("Error");
			statusDto.setErrorMessage(e.getMessage());
			return statusDto;
		}
		statusDto.setStatus("Done");

		return statusDto;
	}

}
