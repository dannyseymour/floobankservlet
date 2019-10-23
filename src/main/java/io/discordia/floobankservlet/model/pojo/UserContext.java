package io.discordia.floobankservlet.model.pojo;

public class UserContext {
  private User user;
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }
  public class User{
    private Session session;


    public class Session
    {
      private String userSession;

      public String getUserSession() {
        return userSession;
      }

      public void setUserSession(String userSession) {
        this.userSession = userSession;
      }


    }


    public Session getSession() {
      return session;
    }


    public void setSession(Session session) {
      this.session = session;
    }

  }

}
