package io.discordia.floobankservlet.model.entity;

import android.support.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import edu.cnm.deepdive.floobank.model.pojo.Balance;

@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = ProviderAccount.class,
            parentColumns = "provideraccount_id",
            childColumns = "provideraccount_id",
            onDelete = ForeignKey.CASCADE
        ),
        @ForeignKey(
            entity =Provider.class,
            parentColumns =   "provider_id",
            childColumns = "provider_id",
            onDelete = ForeignKey.CASCADE
        )
    }
)
public class Account {
  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name="account_id")
  private long id;

  @ColumnInfo(name="balance")
  private Balance balance;

  @NonNull
  @ColumnInfo(name = "account_name", index = true)
  private String name;

  @NonNull
  @ColumnInfo(name = "account_number", index = true)
  private int accountNumber;

  @ColumnInfo(name = "account_type",index=true)
  private String accountType;

  @ColumnInfo(name="provider_id",index=true)
  private int providerId;

  @ColumnInfo(name="dataset")
  private int dataset;

  @ColumnInfo(name="full_account_number")
  private long fullAccountNumber;

  @ColumnInfo(name="bank_transfer_code")
  private long bankTransferCode;

  @ColumnInfo(name="holder")
  private int holder;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @NonNull
  public String getName() {
    return name;
  }

  public void setName(@NonNull String name) {
    this.name = name;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public int getProviderId() {
    return providerId;
  }

  public void setProviderId(int providerId) {
    this.providerId = providerId;
  }

  public int getHolder() {
    return holder;
  }

  public void setHolder(int holder) {
    this.holder = holder;
  }

  public int getDataset() {
    return dataset;
  }

  public void setDataset(int dataset) {
    this.dataset = dataset;
  }

  public long getFullAccountNumber() {
    return fullAccountNumber;
  }

  public void setFullAccountNumber(long fullAccountNumber) {
    this.fullAccountNumber = fullAccountNumber;
  }

  public long getBankTransferCode() {
    return bankTransferCode;
  }

  public void setBankTransferCode(long bankTransferCode) {
    this.bankTransferCode = bankTransferCode;
  }
}
