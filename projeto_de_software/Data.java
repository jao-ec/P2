public class Data {
    private String login;
    private String password;
    public String name;
    public int idade;
    public String 


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