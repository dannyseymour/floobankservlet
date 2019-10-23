package io.discordia.floobankservlet.service;

import android.app.Application;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import edu.cnm.deepdive.floobank.model.dao.AccountDao;
import edu.cnm.deepdive.floobank.model.dao.DocumentDao;
import edu.cnm.deepdive.floobank.model.dao.HoldingDao;
import edu.cnm.deepdive.floobank.model.dao.InvestmentOptionDao;
import edu.cnm.deepdive.floobank.model.dao.InvestmentPlanDao;
import edu.cnm.deepdive.floobank.model.dao.ProfileDao;
import edu.cnm.deepdive.floobank.model.dao.ProviderAccountDao;
import edu.cnm.deepdive.floobank.model.dao.ProviderDao;
import edu.cnm.deepdive.floobank.model.dao.SecurityDao;
import edu.cnm.deepdive.floobank.model.dao.StatementDao;
import edu.cnm.deepdive.floobank.model.dao.TransactionDao;
import edu.cnm.deepdive.floobank.model.entity.Account;
import edu.cnm.deepdive.floobank.model.entity.Document;
import edu.cnm.deepdive.floobank.model.entity.Holding;
import edu.cnm.deepdive.floobank.model.entity.InvestmentOption;
import edu.cnm.deepdive.floobank.model.entity.InvestmentPlan;
import edu.cnm.deepdive.floobank.model.entity.Profile;
import edu.cnm.deepdive.floobank.model.entity.Provider;
import edu.cnm.deepdive.floobank.model.entity.ProviderAccount;
import edu.cnm.deepdive.floobank.model.entity.Security;
import edu.cnm.deepdive.floobank.model.entity.Statement;
import edu.cnm.deepdive.floobank.model.entity.Transaction;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

@Database(
    entities = {Account.class, Document.class, Holding.class, InvestmentOption.class, InvestmentPlan.class,
    Profile.class, Provider.class, ProviderAccount.class, Security.class, Statement.class, Transaction.class},
    version = 1, exportSchema = true
)
@TypeConverters(FlooBankDatabase.Converters.class)
public abstract class FlooBankDatabase extends RoomDatabase {

  protected FlooBankDatabase() {}

  private static Application applicationContext;

  public static void setApplicationContext(Application applicationContext) {
    BlackjackDatabase.applicationContext = applicationContext;
  }

  public static FlooBankDatabase getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public abstract AccountDao getAccountDao();

  public abstract DocumentDao getDocumentDao();

  public abstract HoldingDao getHoldingDao();

  public abstract InvestmentOptionDao getInvestmentOptionDao();
  
  public abstract InvestmentPlanDao getInvestmentPlanDao();
  
  public abstract ProfileDao getProfileDao();
  
  public abstract ProviderAccountDao getProviderAccountDao();
  
  public abstract ProviderDao getProviderDao();
  
  public abstract SecurityDao getSecurityDao();
  
  public abstract StatementDao getStatementDao();
  
  public abstract TransactionDao getTransactionDao();
  
  

  private static class InstanceHolder {

    private static final FlooBankDatabase INSTANCE;

    static {
      INSTANCE =
          Room.databaseBuilder(applicationContext, FlooBankDatabase.class, "floobank_db").build();
    }

  }

  public static class Converters {

    @TypeConverter
    public Long dateToLong(Date date) {
      return (date != null) ? date.getTime() : null;
    }

    @TypeConverter
    public Date longToDate(Long milliseconds) {
      return (milliseconds != null) ? new Date(milliseconds) : null;
    }

    @TypeConverter
    public String enumToString(Enum value) {
      return (value != null) ? value.toString() : null;
    }

    @TypeConverter
    public URL stringToURL(String name) throws MalformedURLException {
      URL returnVal = null;
      try {
        returnVal = (name != null) ? new URL(name) : null;
      } catch (MalformedURLException e) {
        e.printStackTrace();
      }
      return returnVal;
    }
  }

}