package dev.elshan.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "AccountNumber can not be empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Account number must be 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "Account Type can not be empty")
    private String accountType;

    @NotEmpty(message = "Branch Address can not be empty")
    private String branchAddress;
}
