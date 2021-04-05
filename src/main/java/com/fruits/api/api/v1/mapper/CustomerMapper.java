package com.fruits.api.api.v1.mapper;

import com.fruits.api.api.v1.model.CustomerDTO;
import com.fruits.api.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerToCustomer(CustomerDTO customerDTO);

}
