package org.stepik.jetty.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RequestHandler extends HttpServlet {
    private static final String ENDPOINT = "/mirror";

    public static String getEndpoint() {
        return ENDPOINT;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, Object> params = extractParamsToMap(request);
        System.out.println(request.getParameter("key"));
        response.getWriter().println(request.getParameter("key"));

        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
    }

    private Map<String, Object> extractParamsToMap(HttpServletRequest req){
        Map<String, Object> result = new HashMap<>();
        req.getParameterMap().forEach((x,y) -> result.put(x, Arrays.toString(y)));
        return result;
    }
}
