//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({"/hello/*"})
public class TestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.getWriter().write("Hej!" + req.getRequestURI());
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String inputBruger = req.getParameter("username"); //henter parameter fra brugernavn-indtastningsfeltet i indexfilen
        String inputPassword = req.getParameter("password"); //henter parameter fra password-indtastningsfeltet i indexfilen
        System.out.println(inputBruger); //printer det indtastede brugernavn i output
        System.out.println((inputPassword)); //printer det indtastede password i output
        resp.sendRedirect("/" +"?username=" + inputBruger); //det indtastede brugernavn vises på hjemmesiden og i urlen


    }
}
