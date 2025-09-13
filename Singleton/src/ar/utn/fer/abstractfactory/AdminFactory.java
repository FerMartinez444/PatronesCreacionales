package ar.utn.fer.abstractfactory;

public class AdminFactory extends AbstractFactory {
    @Override
    public InterfazUI crearUI(){
        return new AdminUI();
    }
    @Override
    public MetodoEnvio crearEnvio(){
        return new EnvioExpress();
    }
}
