package io.discordia.floobankservlet.model.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import edu.cnm.deepdive.floobank.model.entity.Account;
import java.util.Collection;
import java.util.List;

@Dao
public interface AccountDao {

  @Insert
  List<Integer> insert(Collection<Account> accounts);

 // @Query("SELECT * FROM Account WHERE account_id = :accountId ORDER BY account_id ASC LIMIT 1")



}