public class Main
{
    public static void main(String[] args)
    {
        Usuario usuario1 = new Usuario();
        System.out.println("Usuario Comum");
        System.out.println(usuario1);
        Usuario usuario2 = new Usuario("admim", "123");
        System.out.println("Usuario Adinistrador");
        System.out.println(usuario2);
        System.out.println(23.9 + "\n");
        System.out.println("Usuario sem Permissão");
        Usuario usuario3 = new Usuario("root", "123");
        System.out.println(usuario3);


    }
}