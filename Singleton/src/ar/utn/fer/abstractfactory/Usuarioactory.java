package ar.utn.fer.abstractfactory;

public class Usuarioactory extends AbstractFactory {
    @Override
    public InterfazUI crearUI(){
        return new UsuarioUI();
    }
    @Override
    public MetodoEnvio crearEnvio(){
        return new EnvioNormal();
    }
}
