package Server;

import jakarta.xml.ws.Endpoint;
import webservice.calculeService;

public class server {

    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8084/",new calculeService());
        System.out.println("web service deploye");
    }
}

