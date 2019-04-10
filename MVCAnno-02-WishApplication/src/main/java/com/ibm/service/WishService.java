package com.ibm.service;

import org.springframework.stereotype.Service;

@Service("WishService")
public interface WishService {

	public String generateWishMsg();
}
