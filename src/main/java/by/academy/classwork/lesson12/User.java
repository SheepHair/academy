package by.academy.classwork.lesson12;

public class User {

    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {

}
    public class Query {

        public void printToLog() {
            System.out.println("Пользователь ввел login и password");
        }
    }
}
