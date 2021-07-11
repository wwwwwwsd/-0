package service;

import com.util.TextUtil;
import com.wu.bean.Customer;
import com.wu.bean.CustomerData;

import java.util.List;
import java.util.Scanner;

//此类是 完成客户的所有业务（增删改查）
public class ControllerServive{
    private List<Customer> customerList;
    private Customer currenCustomer;
    // CustomerData customerData =   CustomerData.getInstance();
    // List<Customer> customerList =  customerData.getCustomerList();
    public void checkPwd(String cardid,String CardPwd){
        CustomerData customerData =   CustomerData.getInstance();
        customerList =  customerData.getCustomerList();

        System.out.println("cardid = " + cardid);
        System.out.println("CardPwd = " + CardPwd);
        for (Customer customer : customerList) {
            if(customer.getAccount().equals(cardid) && customer.getPassword().equals(CardPwd)){
                currenCustomer = customer;
                System. out.println("欢迎"+customer.getCname()+"顾客登录1请您注意安全");

                TextUtil.oneLeveOption();//界面
                Scanner scanner =   new Scanner(System.in);
                String option = scanner.nextLine();
                oneOption(option);

            }
        }
    }
    private void oneOption(String option) {
        switch (option){
            case "1":
                System.out.println("查询余额");
                //查询余额
                doSelectMoney();

                //按下1之后 回退到一级选项
                goOneHome();
                break;
            case "2":
                System.out.println("取款");
                goOneHome();
                break;
            case "3":
                System.out.println("转账 ");
                goOneHome();
                break;
            case "4":
                System.out.println("存款");
                goOneHome();
                break;
            case "5":
                System.out.println("退卡");
                goOneHome();
                break;

        }
    }
    private  void  doSelectMoney(){
        double money =   currenCustomer.getMoney();
        System.out.println("余额是"+money);
    }

    private  void  goOneHome( ){
        TextUtil.oneLeveOption();

        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        System.out.println("option1 = " + option);
        oneOption(option);
    }
}
