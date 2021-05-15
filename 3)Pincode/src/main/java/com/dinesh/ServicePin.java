package com.dinesh;

import org.springframework.stereotype.Service;

import com.dinesh.Pincode;

@Service
public interface ServicePin {

	public Pincode getDetails(int pincode);

}
