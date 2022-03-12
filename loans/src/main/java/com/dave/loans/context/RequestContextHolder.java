package com.dave.loans.context;

/**
 * User: Dave Harms
 * Date: 3/12/22
 * Time: 4:33 PM
 */
public class RequestContextHolder {

    private static final ThreadLocal<RequestContext> requestContext = new ThreadLocal<RequestContext>();

    public static final RequestContext getContext() {
        RequestContext context = requestContext.get();

        if (context == null) {
            context = createEmptyContext();
            requestContext.set(context);

        }
        return requestContext.get();
    }

    public static final void setContext(RequestContext context) {
        requestContext.set(context);
    }

    public static final RequestContext createEmptyContext() {
        return new RequestContext();
    }

}
