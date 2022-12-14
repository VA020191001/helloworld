import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // int a1 = add(100,200);
        // int a2 = add(200,300);
        // int a3 = add(300,400);

        int num1 = 100;
        int num2 = 200;
        int sum = add(num1,num2);

        System.out.println("两个数的和是："+sum);

        printInfo();
        System.out.println("hello world");
        }

        //两个数求和
    public static int add(int n1,int n2) {

        int sum = n1 + n2;
        return sum;
    }
    // 打印公司信息
    public static void printInfo(){
        System.out.println("尚学堂");
    }
    }

