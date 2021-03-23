package com.fruits.api.bootstrap;

import com.fruits.api.domain.Category;
import com.fruits.api.domain.Customer;
import com.fruits.api.repositories.CategoryRepository;
import com.fruits.api.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Bootstrap implements CommandLineRunner {


    private CategoryRepository categoryRepository;

    private CustomerRepository customerRepository;


    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        loadCustomers();

        loadCategories();

    }

        private void loadCategories(){


        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried =  new Category();
        dried.setName("Dried");

        Category fresh =  new Category();
        fresh.setName("Fresh");

        Category exotic =  new Category();
        exotic.setName("Exotic");

        Category nuts =  new Category();
        nuts.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);


        System.out.println("Data loaded ="+categoryRepository.count());


    }


    private void loadCustomers(){

            Customer customer1= new Customer();
            customer1.setId(1l);
            customer1.setFirstname("michal");
            customer1.setLastname("weston");
            customerRepository.save(customer1);

        Customer customer2= new Customer();
        customer2.setId(1l);
        customer2.setFirstname("michal");
        customer2.setLastname("weston");
        customerRepository.save(customer2);


        System.out.println("Customer loaded: "+customerRepository.count());





    }
}
