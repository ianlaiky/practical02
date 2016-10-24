package demo;
//ttt

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 152772a on 10/24/2016.
 */
@WebServlet(name = "BookCatalogServlet", urlPatterns = "/bookcatalog")
public class BookCatalogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>" + "<head><title>Duke's Bookstore</title></head>" +
                "<body  bgcolor=\"#ffffff\">" + "<center>" +
                "<hr> <br> &nbsp;" + "<h1>" +
                "<font size=\"+3\" color=\"#CC0066\">Duke's </font> <img src=\"" +
                "./duke.books.gif\" alt=\"Duke holding books\"\">" +
                "<font size=\"+3\" color=\"black\">Bookstore</font>" + "</h1>" +
                "</center>" + "<br> &nbsp; <hr> <br> ");


        BookDBAO db = new BookDBAO();
        List<BookDetails> bd = db.getAllList();


        try {

            out.println("<html>");
            out.println("<body>");
            out.println("<table>");


            for (int i = 0; i < bd.size(); i++) {

                out.println("<tr>");
                out.println("<td>" + bd.get(i).getTitle() + "</td>");
                out.println("<td>" + bd.get(i).getDescription() + "</td>");
                out.println("<td>" + bd.get(i).getYear() + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);

        }


    }
}
