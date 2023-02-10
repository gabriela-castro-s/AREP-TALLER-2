package edu.eci.arep;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import edu.eci.arep.Services.*;

public class App {
    static HttpServer httpServer = HttpServer.getInstance();
    static Map<String,Service> services = new HashMap();
    public static void main(String[] args) throws IOException {
        services.put("", new SearchService());
        httpServer.run(args,services);
    }
}