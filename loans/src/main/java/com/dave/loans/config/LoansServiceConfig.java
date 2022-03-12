package com.dave.loans.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

/**
 * User: Dave Harms
 * Date: 3/12/22
 * Time: 4:21 PM
 */
@Configuration
@ConfigurationProperties(prefix= "loans")
@Getter @Setter @ToString
public class LoansServiceConfig {

    private String msg;
    private String buildVersion;
    private Map<String, String> mailDetails;
    private List<String> activeBranches;

}
