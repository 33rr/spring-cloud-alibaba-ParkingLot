package com.mall.parking.charging.service;

import com.mall.parking.common.exception.BusinessException;

/**
 * @author 公众号：歪脖贰点零 , See more at : https://xiaozhuanlan.com/msa-practice
 *
 */
public interface EntranceService {

	int createEntrance(String json) throws BusinessException;
}
