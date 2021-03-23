package com.fruits.api.api.v1.mapper;

import com.fruits.api.api.v1.model.CustomerDTO;
import com.fruits.api.domain.Customer;

//@Mapper
public interface CustomerMapper {

   //CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);
}
