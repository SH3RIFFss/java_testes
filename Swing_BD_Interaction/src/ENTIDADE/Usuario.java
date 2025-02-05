package ENTIDADE;

public class Usuario {
    private int cdg;
    private String name;
    private String email;
    private String pasw;

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
    }public void setName(String name) {
        this.name = name;
    }
    public String getPasw() {
        return pasw;
    }
    public void setPasw(String pasw) {
        this.pasw = pasw;
    }
}
