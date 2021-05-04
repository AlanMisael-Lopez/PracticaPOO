public class Administrador extends Persona{
    public String codigo;

    public String getCodigo(String codigo) {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void nombre(String nombre) {
        System.out.println(nombre);
    }

    @Override
    public void edad(int edad) {
        System.out.println(edad);
    }

    @Override
    public void correo(String correo) {
        System.out.println(correo);
    }
}
