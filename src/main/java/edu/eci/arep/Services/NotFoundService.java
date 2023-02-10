package edu.eci.arep.Services;

public class NotFoundService implements Service{
    public String getHeader(){
        return "HTTP/1.1 404 Not Found" +
                "\r\n"
                + "Content-Type:text/html \r\n"
                + "\r\n";
    }
    public String getBody(){
        return "<html>"+
                "<body>"+
                ""+
                "<center><h1>ERROR Pagina no encontrada :(</h1></center>"+
                ""+
                "<center><img src=\"https://i.pinimg.com/236x/ff/53/93/ff53935e6607a7fa92c7dce5e8748c88.jpg\" alt=\"Computer man\"></center>"+
                ""+
                "</body>"+
                "</html>";
    }

}
