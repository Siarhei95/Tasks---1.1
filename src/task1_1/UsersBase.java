package task1_1;

public class UsersBase {
    private String user;
    private String email;
    private String nameBase;

    public UsersBase(String nameBase){
        this.nameBase = nameBase;
    }

    public UsersBase(String user,String email){
        this.user = user;
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("\t user: "+user+"\t  email: "+email+"\n");
    }
}
