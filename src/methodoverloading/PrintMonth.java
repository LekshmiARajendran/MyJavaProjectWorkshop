package methodoverloading;

public class PrintMonth {
    public static void main(String[] args){
        System.out.println(SelectMonth.getMonth(5));
        System.out.println(SelectMonth.getMonth("March"));
    }
}
