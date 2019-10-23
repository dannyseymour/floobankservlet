package io.discordia.floobankservlet.model.entity;

import android.support.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import edu.cnm.deepdive.floobank.model.pojo.RefreshInfo;

@Entity (
    foreignKeys = {
        @ForeignKey(
            entity = Provider.class,
            parentColumns = "provider_id",
            childColumns = "provider_id",
            onDelete = ForeignKey.CASCADE
        ),@ForeignKey(
        entity = Profile.class,
        parentColumns = "profile_id",
        childColumns = "profile_id",
        onDelete = ForeignKey.CASCADE
    )
    }
)
public class ProviderAccount {

  private RefreshInfo refreshInfo;

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name="provideraccount_id")
  private long id;


  @NonNull
  @ColumnInfo(name= "request_id", index = true)
  private String RequestID;

  public long getId() {
    return id;
  }

  public RefreshInfo getRefreshInfo() {
    return refreshInfo;
  }

  public void setRefreshInfo(RefreshInfo refreshInfo) {
    this.refreshInfo = refreshInfo;
  }

  @NonNull
  public String getRequestID() {
    return RequestID;
  }

  public void setRequestID(@NonNull String requestID) {
    RequestID = requestID;
  }

  public String toString()
  {
    StringBuilder refreshStatus = new StringBuilder("");
    refreshStatus.append("providerAccountId = " + id).append(refreshInfo.toString());
    return refreshStatus.toString();
  }
}
