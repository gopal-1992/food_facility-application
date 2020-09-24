package com.zelish.api.dao;


import org.springframework.data.repository.CrudRepository;

import com.zelish.api.model.DeliveryDetails;

public interface FoodDetailsDAO extends CrudRepository<DeliveryDetails, Integer>{

}
