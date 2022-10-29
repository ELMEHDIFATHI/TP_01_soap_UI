package webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class calculeService {

    @WebMethod(operationName = "sommeTwoNumber")
    public int somme(@WebParam(name = "number1") int a,@WebParam(name = "number2") int b){
        return a+b;
    }

    @WebMethod(operationName = "multiplicationTwoNumber")
    public int multiplication(@WebParam(name = "number1")int a,@WebParam(name = "number2") int b){
        return a*b;
    }

    @WebMethod(operationName = "soustractionTwoNumber")
    public int soustraction(@WebParam(name = "number1")int a,@WebParam(name = "number2")int b){
        return a-b;
    }

    @WebMethod(operationName = "divisionTwoNumber")
    public double division(@WebParam(name = "number1")int a,@WebParam(name = "number2")int b){
        double m = 0;
        if(b==0){
            System.out.println("you must not division by 0");
        }else{
          m=a/b;
        }
        return m;
    }
}
