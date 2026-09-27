package com.tca.service;

import com.tca.entity.Passport;

public interface PassportService {
	
    public Passport savePassport(Passport passport);
	
	public Passport findById(Long id);
	
	public void removePassport(Long pid);
	

}
