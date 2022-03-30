public class Data {
    private String login;
    private String password;
    public String name;
    public int idade;
    public String genero;
    public String estado_civil;

    public Data(String name, String login, String password)
    {
        this.login = login;
        this.name = name;
        this.password = password;
    }

    public setIdade(int idade)
    {
        this.idade = idade;
    }

    public setGenero(String genero)
    {
        this.genero = genero;
    }

    public setEstado_Civil(String estado_civil)
    {
        this.estado_civil = estado_civil;
    }

    public String dados()
    {
       return "nome: "+name+"\n"+"login: "+login+"\n"+"password: "+password;
    }
}