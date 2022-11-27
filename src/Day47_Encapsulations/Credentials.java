package Day47_Encapsulations;

public class Credentials {
public String name;
public int age;

private String username;
private String password;

public static String companyName;

static {
    companyName="Facebook";
}


public Credentials(String name, int age){
    this.name=name;
    this.age=age;
}

public void setUsername(String username){
    this.username=username;
}

public void setPassword(String password){
    this.password=password;
}

public String getUsername(){
    return username;
}

public String getPassword(){
    return password;
}
}
