package adapter.task2;

public class TwitterClientWrapper implements Client {

        public TwitterUser user;
        public TwitterClientWrapper(TwitterUser user){
            this.user = user;
        }

        @Override
        public String getEmail() {
            return user.getUserMail();
        }

        @Override
        public String getCountry() {
            return user.getCountry();
        }

        @Override
        public String getLastActiveTime() {
            return user.getLastActiveTime();
        }
    }

