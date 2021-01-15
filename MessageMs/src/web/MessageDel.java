package web;

import dao.MessageDao;
import util.FastJsonUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/del")
public class MessageDel extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ids = req.getParameter("ids");
        try {
            new MessageDao().deletes(ids.split(","));
            resp.getWriter().write(FastJsonUtil.ok(1).toJSON());
        } catch (Exception exception) {
            exception.printStackTrace();
            resp.getWriter().write(FastJsonUtil.err(2, exception.getMessage()).toJSON());
        }
    }
}
