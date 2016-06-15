package servlet;

import dto.ClubDto;
import rmi.BD;
import rmi.IServicio;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.List;

/**
 * Created by martinh on 13/6/2016.
 */

@WebServlet("/JugadoresServlet")
public class JugadoresServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        IServicio servicio = BD.obtenerServicioJugadores();

        //servicio.clubDtoList();
        String zona = request.getParameter("zonaVar");
        List<ClubDto> clubDtoList = servicio.clubDtoPorZona(zona);

        if(clubDtoList == null){
            response.getWriter().print("NO EXISTEN CLUBES");
        }else{
//            response.getWriter().println("CLUBES");
//            for (ClubDto c : clubDtoList) {
//
//                response.getWriter().println(c.toString());
//            }
            response.getWriter().write("<select name='response'>");
            for (int j = 0; j < clubDtoList .size(); j++)
            {
                response.getWriter().write("<option>"+clubDtoList.get(j).getNombre()+"</option>");
            }
            response.getWriter().write("</select>");
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
