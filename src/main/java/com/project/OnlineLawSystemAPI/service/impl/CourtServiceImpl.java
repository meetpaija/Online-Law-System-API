package com.project.OnlineLawSystemAPI.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.OnlineLawSystemAPI.dao.ICourtDao;
import com.project.OnlineLawSystemAPI.model.Court;
import com.project.OnlineLawSystemAPI.service.ICourtService;

@Service
public class CourtServiceImpl implements ICourtService{

	@Autowired
	ICourtDao courtDao;
	
	@Override
	public List<Court> fetchAllCourts() {
		return (List<Court>) courtDao.findAll(); 
	}

	@Override
	public Court saveCourt(@Valid Court court) {
		return courtDao.save(court);
	}

}
