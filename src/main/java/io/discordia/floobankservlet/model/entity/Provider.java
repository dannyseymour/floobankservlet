package io.discordia.floobankservlet.model.entity;

import android.support.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Provider {
  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name="provider_id")
  private long id;

  @NonNull
  @ColumnInfo(name = "provider_name", index = true)
  private String name;

  @NonNull
  @ColumnInfo(name = "login_url")
  private String loginUrl;

  @NonNull
  @ColumnInfo(name="base_url")
  private String baseUrl;

  @NonNull
  @ColumnInfo(name="login_form")
  private int loginForm;

  @NonNull
  @ColumnInfo(name="dataset")
  private int dataset;

  @NonNull
  @ColumnInfo(name="column")
  private int column;
}
