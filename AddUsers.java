package Working;
import Users.*;

import java.util.Scanner;

public class AddUsers {
    void NewUser()
    {
        System.out.println("1.Reader \n2.Lybrarian");
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        if(user.equals("1"))
        {
            AddReader();
        }
    }
}
