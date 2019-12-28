package livs.walmart.com.daggerlogin.iu.login;

public interface Login {

    interface View {
        void usuarioValido();
        void error();
    }

    interface Presenter{
        void setView(Login.View view);
        void validaUser(String user, String pass);
    }
}
