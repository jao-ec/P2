import java.util.Scanner;
import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

public class creat_count
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Data> dados = new ArrayList();

        while(true)
        {
        System.out.print("Insirir Login-> ");
        String login = input.nextLine();

        System.out.print("\n"+"Insirir Nome-> ");
        String name = input.nextLine();

        System.out.print("\n"+"Insirir Senha-> ");
        String password = input.nextLine();

        Data usuario = new Data(name, login, password);
        System.out.printf(usuario.dados()+"\n");
        dados.add(usuario);
        }
    }
}