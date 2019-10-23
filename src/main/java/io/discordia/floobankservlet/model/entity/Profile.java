package io.discordia.floobankservlet.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.util.Date;

@Entity ( foreignKeys = {
    @ForeignKey(
        entity = ProviderAccount.class,
        parentColumns = "provider_account_id",
        childColumns = "provider_account_id",
        onDelete = ForeignKey.CASCADE
    )})
public class Profile {
  @PrimaryKey(autoGenerate=true)
  @ColumnInfo(name="id")
  private int id;

  @ColumnInfo(name="provider_account_id")
  private int providerAccountId;

  @ColumnInfo(name="address")
  private String address;

  @ColumnInfo(name="name")
  private String name;

  @ColumnInfo(name="phone_number")
  private String phoneNumber;

  @ColumnInfo(name="identifier")
  private int identifier;

  @ColumnInfo(name="email")
  private String email;

  @ColumnInfo(name="gender")
  private String gender;

  @ColumnInfo(name="birthday")
  private Date birthday;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getProviderAccountId() {
    return providerAccountId;
  }

  public void setProviderAccountId(int providerAccountId) {
    this.providerAccountId = providerAccountId;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public int getIdentifier() {
    return identifier;
  }

  public void setIdentifier(int identifier) {
    this.identifier = identifier;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
}
