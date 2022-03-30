public class Data {
    private String login;
    private String name;
    private String password;

    public Data(String name, String login, String password)
    {
        this.login = login;
        this.name = name;
        this.password = password;
    }

    public String dados()
    {
       return "nome: "+name+"\n"+"login: "+login+"\n"+"password: "+password;
    }
}