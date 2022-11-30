package adapter.task2;

import java.time.LocalDate;

public class FacebookClientWrapper implements Client {
    public FacebookUser user;
    public FacebookClientWrapper(FacebookUser user){
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry().toString();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return user.getGetUserActiveTime();
    }
}
