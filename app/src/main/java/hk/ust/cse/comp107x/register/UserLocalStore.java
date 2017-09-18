package hk.ust.cse.comp107x.register;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Dodo on 18/09/2017.
 */

public class UserLocalStore {
    public static final String User_Det = "User_Details"; //file to store in
    SharedPreferences userLocaldatabase;
    public UserLocalStore(Context context){//force activites to get us all context
        userLocaldatabase = context.getSharedPreferences(User_Det, 0);

    }

    public void storeUserdata(User user){
        SharedPreferences.Editor editor= userLocaldatabase.edit();
        editor.putString("username",user.username);
        editor.putString("password",user.password);
        editor.putInt("Age",user.Age);
        editor.putString("Email",user.Email);
        editor.putInt("number",user.number);
        editor.commit();
    }
public User getLoggedInUser(){
    String username=userLocaldatabase.getString("username","");
String Email=userLocaldatabase.getString("Email","");
    int number=userLocaldatabase.getInt("number",0);
    String password=userLocaldatabase.getString("password","");
int Age=userLocaldatabase.getInt("Age",-1);
    User Storeduser=new User(username,Email);
    return Storeduser;
}
public void setUserLoggedIn(boolean LoggedIn){
    SharedPreferences.Editor editor= userLocaldatabase.edit();
    editor.putBoolean("LoggedIn",LoggedIn);
    editor.commit();
}
    public boolean getUserLoggedIn(){
if(userLocaldatabase.getBoolean("LoggedIn", false)==true){
    return true;
    } else{
        return false;
    }
}}
