package entity;

public class Users {
    // Declaraçao dos dadis da tabela
    private int cdg;
    private String name;
    private String email;
    private String passw;

    public int getCdg() {
        return cdg;
    }
    public void setCdg(int cdg) {
        this.cdg = cdg;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassw() {
        return passw;
    }
    public void setPassw(String passw) {
        this.passw = passw;
    }
}
