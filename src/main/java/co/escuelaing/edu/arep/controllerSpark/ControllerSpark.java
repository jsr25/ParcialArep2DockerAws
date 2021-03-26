package co.escuelaing.edu.arep.controllerSpark;


import co.escuelaing.edu.arep.api.CalculApi;
import co.escuelaing.edu.arep.api.impl.CalculadoraApiImpl;
import com.google.gson.Gson;

import static spark.Spark.*;

public class ControllerSpark {

    public static void main(String[] args) {
        port(getPort());

        get("/atan/:value",(req,res)-> {
            CalculApi calculApi = new CalculadoraApiImpl();
            Double result =calculApi.atan(Double.parseDouble(req.params(":value")));
            String json = "{\"operation\":\"atan\",\"input\":"+req.params(":value")+",\"output\":"+result+"}";
           return new Gson().toJson(json);
        });

        get("/ln/:value",(req,res)-> {
            CalculApi calculApi = new CalculadoraApiImpl();
            Double result =calculApi.ln(Double.parseDouble(req.params(":value")));
            String json = "{\"operation\":\"ln\",\"input\":"+req.params(":value")+",\"output\":"+result+"}";
            return new Gson().toJson(json);
        });
    }

    private static int getPort() {
        if(System.getenv("PORT")!= null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 8080;
    }

}
