package ua.edu.ucu.apps.demo.task1;

public class Banknote100 extends Banknote{
    public Banknote100(Banknote nextItem){
        super(nextItem, 100);
    }
    public Banknote100(){
        super(100);
    }
}
