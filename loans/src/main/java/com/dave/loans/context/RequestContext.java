package com.dave.loans.context;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * User: Dave Harms
 * Date: 3/12/22
 * Time: 4:33 PM
 */
@Component
@Getter
@Setter
public class RequestContext {

    public static final String CORRELATION_ID = "eazybank-correlation-id";

    private String correlationId = new String();

}