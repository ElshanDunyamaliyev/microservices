package dev.elshan.accounts.service;

import dev.elshan.accounts.dto.CustomerDto;

public interface IAccountsService {
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchCustomer(String mobileNumber);

    boolean updateCustomer(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
