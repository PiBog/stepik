package org.stepik.jetty.servlets;


import lombok.Getter;

import javax.servlet.http.HttpServlet;

public class RequestHandler extends HttpServlet {
    private static final String ENDPOINT = "/mirror";

    public static String getEndpoint() {
        return ENDPOINT;
    }

}
