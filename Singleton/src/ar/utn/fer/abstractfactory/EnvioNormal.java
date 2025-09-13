package ar.utn.fer.abstractfactory;

public class EnvioNormal implements MetodoEnvio {
    @Override
    public void enviar(){
        System.out.println("Envío Normal activado");
    }
}
