public class Student {
    int id;
    String name;
    int age;
    int score;

    //定义方法
    public void study(){
        System.out.println("正在学习："+name);

    }

    public static void main(String[] args) {
        Student stu01 = new Student();
        stu01.id = 1001;
        stu01.age = 18;
        stu01.name ="乔立学";
        stu01.score = 100;

        stu01.study();
    }
}
