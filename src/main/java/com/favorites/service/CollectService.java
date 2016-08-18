package com.favorites.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.favorites.domain.Collect;

public interface CollectService {
	
	public Page<Collect>  getCollects(String type,Long userId,Pageable pageable);
	
	public void saveCollect(Collect collect, Long userId);
	
	public boolean checkCollect(Collect collect,Long userId);

}
