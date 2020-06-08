package Menu;
import ListsofBooks.*;


public class LibrarianMenu {
    Scanner scan = new Scanner(System.in);
    public void WriteMenu(Lybrary lybrary, Users users)
    {
        System.out.println("1.List of books in Library\n2List of users\n3.Exit");

        int i = scan.NextLine();
        switch (i) {
            case 1:
                lybrary.WriteBooks();
                break;
            case 2:
                users.WriteUsers();
                break;
            case 3:
                ///
        }

    }

}
