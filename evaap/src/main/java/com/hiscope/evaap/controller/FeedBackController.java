package com.hiscope.evaap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiscope.evaap.dto.FeedBack;
import com.hiscope.evaap.service.FeedBackService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@CrossOrigin("*")
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/feedback")
public class FeedBackController {
	
	@Autowired
	private FeedBackService feedBackService;
	
	@PostMapping("")
	public FeedBack saveFeedbackController(@RequestBody FeedBack feedBack) {
		return feedBackService.saveFeedBackService(feedBack);
		
	}

}
