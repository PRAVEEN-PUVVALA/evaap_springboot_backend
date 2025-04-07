package com.hiscope.evaap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiscope.evaap.dto.FeedBack;
import com.hiscope.evaap.repository.FeedBackRepository;

@Service
public class FeedBackService {
	
	@Autowired
	private FeedBackRepository feedBackRepository;
	
	public FeedBack saveFeedBackService(FeedBack feedBack) {
		return feedBackRepository.save(feedBack);
		
	}

}
