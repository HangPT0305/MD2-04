import java.util.Scanner;

public class Sinhvien {
    private String id;
    private String name;
    private int age;
    private boolean sex;
    private int markJavascrip;
    private int markJava;

    public Sinhvien() {

    }

    public Sinhvien(String id, String name, int age, boolean sex, int markJavascrip, int markJava) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.markJavascrip = markJavascrip;
        this.markJava = markJava;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getMarkJavascrip() {
        return markJavascrip;
    }

    public void setMarkJavascrip(int markJavascrip) {
        this.markJavascrip = markJavascrip;
    }

    public int getMarkJava() {
        return markJava;
    }

    public void setMarkJava(int markJava) {
        this.markJava = markJava;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id của sinh viên");
        this.id = sc.nextLine();
        System.out.println("nhập tên sinh viên");
        this.name = sc.nextLine();
        System.out.println("nhập tuổi ");
        this.age = sc.nextInt();
        System.out.println("nhập giới tính");
        this.sex = sc.nextBoolean();
        System.out.println("nhập vào điểm javascrip");
        this.markJavascrip = sc.nextInt();
        System.out.println("nhập vào điểm java");
        this.markJava = sc.nextInt();


    }
    //pthuc hien thi thông tin
    public void showData(){
        System.out.println("thông tin sinh viên");
        System.out.println("Mã nhân viên : " + this.id);
        System.out.println("Họ và Tên : " + this.name);
        System.out.println( "Năm sinh : " +(2024- this.age));
        System.out.println("Giới tính: " + this.sex);
        System.out.println("Điểm môn Javascrip : " + this.markJavascrip);
        System.out.println("Điểm môn java : " + this.markJava);
    }
    //phuong thuc xét tốt nghiệm
    public void diemTb (){
        Scanner sc = new Scanner(System.in);
        int TB =(markJava+markJavascrip)/2;
        if (TB >=8){
            System.out.println("đạt Giỏi");

        }else if (TB >=6){
            System.out.println("đạt khá");
        }else if (TB >=4){
            System.out.println("chưa đat");
        }
    }
}
