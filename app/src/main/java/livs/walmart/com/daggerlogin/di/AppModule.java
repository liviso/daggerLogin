package livs.walmart.com.daggerlogin.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import livs.walmart.com.daggerlogin.iu.login.Login;
import livs.walmart.com.daggerlogin.iu.login.LoginPresenter;
import livs.walmart.com.daggerlogin.model.User;

@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application){
        this.application=application;
    }

    @Provides
    @Singleton
    public Application provideApplication(){
        return application;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext(){
        return application;
    }

    @Provides
    @Singleton
    public User provideUser(){
        return new User();
    }

    /**
     * grafo de activities
     */

    @Provides
    @Singleton
    Login.Presenter providePresenterLogin(User user){
        return new LoginPresenter(user);
    }
}
