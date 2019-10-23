package io.discordia.floobankservlet.model.pojo;

public class ProviderAccountRefreshStatus {
  ProviderAccount[]  providerAccount;

  public ProviderAccount[] getProviderAccount() {
    return providerAccount;
  }

  public void setProviderAccount(ProviderAccount[] providerAccount) {
    this.providerAccount = providerAccount;
  }



  public int getProviderAccountLenght(){
    return (providerAccount.length);
  }


}
