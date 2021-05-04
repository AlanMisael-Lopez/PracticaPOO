public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.nombre("Alan");
        usuario.edad(19);
        usuario.correo("alan.com\n");

        Cliente cliente = new Cliente();
        cliente.nombre("El Juan");
        cliente.edad(22);
        cliente.correo("eljauncho.com\n");

        Administrador administrador = new Administrador();
        administrador.nombre("Pedro");
        administrador.edad(35);
        administrador.correo("pedrunkas.com\n");
    }
}
