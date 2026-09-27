package com.tca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Passport;
import com.tca.repository.PassportRepository;

@Service("passportservice")
public class PassportServiceImpl implements PassportService {

	@Autowired
	private PassportRepository passportRepository;
	
	@Override
	public Passport savePassport(Passport passport) {
		
		return passportRepository.save(passport);
	}

	@Override
	public Passport findById(Long id) {
		
		return passportRepository.findById(id).get();
	}

	@Override
	public void removePassport(Long pid) {

		passportRepository.deleteById(pid);;


	}

}
