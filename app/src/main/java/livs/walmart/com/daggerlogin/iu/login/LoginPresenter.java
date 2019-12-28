package livs.walmart.com.daggerlogin.iu.login;

import livs.walmart.com.daggerlogin.model.User;

public class LoginPresenter implements Login.Presenter{

    private Login.View view;

    private User user;

    public LoginPresenter(User user){
        this.user=user;
    }

    @Override
    public void validaUser(String userName, String pass) {
        if(view!=null){
            if(userName.equals("alberto")&& pass.equals("1234")){
                user.setUserName("Alberto Palomar");
                user.setEdad("30");
                view.usuarioValido();
            }else{
                view.error();
            }
        }
    }

    @Override
    public void setView(Login.View view) {
        this.view = view;
    }
}
