package com.dinesh;

import org.springframework.stereotype.Service;

@Service
public interface CardService {

	String getCardType(long cardNo);

}
