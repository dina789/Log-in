package hk.ust.cse.comp107x.register;

/**
 * Created by Dodo on 17/09/2017.
 */

public class User {String username; String Email;
    String password;
    int Age; int number;


    public User(String username, String password, int Age, String Email, int number){
this.username=username;
        this.password=password;
        this.Email=Email;
        this.number=number;
        this.Age=Age;

    }
    public User(String Email, String username){


this.username=username;
        this.password=password;
this.Email="";
        this.number=0;
        this.Age=-1;
        this.username="";
    }





}
