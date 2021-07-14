package com.study.suimai.order.dao;

import com.study.suimai.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wdajun
 * @email wangdajunddf@gmail.com
 * @date 2021-07-14 13:49:58
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
