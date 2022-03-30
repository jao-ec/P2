import java.util.Scanner;

public class send_message 
{   public send_message(String[] args)
    {
        String mensagem;
        Scanner input = new Scanner(System.in);
        System.out.println("Gostria de manda mensagem mensagem para alguem da comunidade?\nCaso queira digite o nome do seu melhor amigos com o nick registrado na comunidade");
        System.out.println("1 - Send\n2 - Not Send");
        int res = input.nextInt();

        if(res == 1)
        {
            System.out.println("Qual a mensagem?");
            mensagem = input.nextLine();
        }else return;
    }
}