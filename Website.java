public class Website {
    private int index;
    private String[] usernames;
    private String[] password;

    public Website() {
        index = 0;
        usernames = new String[99];
        password = new String[99];
    }

    public Account makeAccount(String username, String password) {
        Account newAccount = new Account();
        for (int i=0; i<index; i++) {
            if (usernames[i].equals(username)) {
                System.out.println("Mohon maaf username telah digunakan!");
                return null;
            }
        }
    }

    public void login(String username, String password) {
    }

    private String encrypt(String input) {
    }
}