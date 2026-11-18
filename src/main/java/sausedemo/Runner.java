package sausedemo;



public class Runner {
    public static void main(String[] args){
        Operation operation =new Operation();
        SausLog sauseLog=new SausLog();
        operation.loadPage();
        sauseLog.SetLogSearch();
    }
}
