package mx.edu.utez.animaldemo;

import java.io.*;
import java.util.List;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import mx.edu.utez.animaldemo.controllers.DaoAnimal;
import mx.edu.utez.animaldemo.models.Animal;

@WebServlet(name = "/ListaAnimales")
public class ListaAnimales extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //response.setContentType("text/html");
        String helloWorld = "El costeño";
        request.setAttribute("helloWorld",helloWorld);

        DaoAnimal animalDAO = new DaoAnimal();

        List<Animal> animales = animalDAO.consultaAnimales();

        System.out.println("llego aqui");
        /*Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + animales.size() + "</h1>");
        out.println("</body></html>");
        */



    }

    public void destroy() {
    }


    /*<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>
*/


}