public class Usuario
{
    private String nome;
    private String tipo;
    private String login;
    private String senha;

    //método contrutor personalizado
    public Usuario()
    {
        tipo = "comum";
    }
    public Usuario(String login, String senha)
    {
        if(login.equals("admim") && senha.equals("123"))
        {
            this.nome = "Adminstrador";
            this.login = login;
            this.senha = senha;
            this.tipo = "Cadastrado";
        }else
        {
            System.out.println("Sem permissão de acesso");
            System.exit(0); // força finalizar o programa
        }
    }
    public String toString()
    {
        return "Nome: " + nome + "\n" +
                "Login " + login + "\n" +
                "Tipo de Usuario: " + tipo + "\n";
    }
}