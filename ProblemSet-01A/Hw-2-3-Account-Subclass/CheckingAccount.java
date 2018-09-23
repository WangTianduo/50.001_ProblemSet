//Notes about this question:
//1. 父类的私有属性， 子类无法访问与继承
//2. 如果想直接继承父类的某些方法， 在用到父类私有属性的时候，需要使用get/set函数

import java.util.Date;

public class CheckingAccount extends Account{

  CheckingAccount() {
    super();
  }

  CheckingAccount(int _id, double _balance) {
    super(_id, _balance);
  }

  void withdraw(double amount) {
    if (getBalance() - amount < -5000) {
      System.out.println("over limit");
    }else {
      double newBalance = getBalance() - amount;
      setBalance(newBalance);
    }
  }
}
