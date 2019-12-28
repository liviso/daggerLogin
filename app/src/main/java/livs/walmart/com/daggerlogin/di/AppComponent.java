package livs.walmart.com.daggerlogin.di;

import javax.inject.Singleton;

import dagger.Component;
import livs.walmart.com.daggerlogin.iu.login.LoginActivity;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(LoginActivity loginActivity);

}
