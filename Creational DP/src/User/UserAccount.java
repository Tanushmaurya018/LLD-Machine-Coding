package User;

public class UserAccount {
    String username;
    String password;

    private UserAccount(UserAccountBuilder builder){
        this.username = builder.username;
        this.password = builder.password;
    }



    public static class UserAccountBuilder {
        private String username;
        private String password;

        public UserAccountBuilder username(String username){
            this.username = username;
            return this;
        }

        public UserAccountBuilder password(String password){
            this.password = password;
            return this;
        }

        public UserAccount build(){
            return new UserAccount(this);
        }
    }
}
