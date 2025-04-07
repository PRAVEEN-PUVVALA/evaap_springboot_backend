package com.hiscope.evaap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiscope.evaap.dto.FeedBack;

@Repository
public interface FeedBackRepository extends JpaRepository<FeedBack, Long> {

}
