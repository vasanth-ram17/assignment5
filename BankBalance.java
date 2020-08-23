/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vasanth
 */
public class BankBalance {
     public static void main(String args[]){
        bankA one = new bankA();
        bankB two = new bankB();
        bankC three = new bankC();
        one.setdata(1000);
        two.setdata(1500);
        three.setdata(2000);
        int a = one.getbalance();
        int b = two.getbalance();
        int c = three.getbalance();
        System.out.println("the balance in Bank A $"+ a);
        System.out.println("the balance in Bank B $"+ b);
        System.out.println("the balance in Bank C $"+ c);
    }
    
}
class bank{
int getbalance(){
    return 0;
}
}
class bankA extends bank{
    int balance;
    void setdata(int bal){
        balance = bal;
    }
    @Override
    int getbalance(){
        return balance;
    }
    
}
class bankB extends bank{
    int balance;
    void setdata(int bal){
        balance = bal;
    }
    @Override
    int getbalance(){
        return balance;
        
    }
}
class bankC extends bank{
    int balance;
    void setdata(int bal){
        balance = bal;
    }
    @Override
    int getbalance(){
        return balance;
    } 
}

