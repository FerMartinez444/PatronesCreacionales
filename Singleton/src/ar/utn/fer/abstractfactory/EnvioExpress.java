package ar.utn.fer.abstractfactory;

public class EnvioExpress implements MetodoEnvio {
    @Override
    public void enviar(){
        System.out.println("Envío Express activado");
    }
}
