package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    List<Account> accountList;

    public Bank(){
        accountList = new ArrayList<>();
    }



    public void removeBankAccountByIndex(Integer indexNumber) {
        int toRemove = indexNumber;
        accountList.remove(toRemove);

    }

    public void addBankAccount(BankAccount bankAccount) {
        accountList.add(bankAccount);

    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if(accountList.contains(bankAccount)){
            return true;
        }
        return false;
    }
}
