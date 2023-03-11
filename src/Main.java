//class MyProgram {
//    public static void main(String[] args) {
//
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        System.out.println("Привет!");
//        System.out.println("Эта строчка должна быть на новой строке!"); //
//        System.out.print("И эта, так как предыдущая команда выполнила переход на новую строку");
//        System.out.print("--- а это нет, так как просто System.out.print() по");
//        System.out.print("сле себя строку не переводит");
//    }
//}

//class MyProgram{
//    public static void main(String[] args){
//        //System.out.println("#  - Это комментарий) Стоп, это не тот язык");
//        System.out.println("// - Это комментарий) Это не сложно");
//        /* System.out.println("// - Это не комментарий) Это не сложно");
//        System.out.println("// - Это комментарий) Это сложно");
//        System.out.println("// - Это не комментарий) Это не сложно");
//        System.out.println("можно даже попробовать многострочный комментарий");
//         */
//    }
//}

//class MyProgram{
//    public static void main(String[] args){
//        System.out.println("Hello");
//        System.out.println("Programming!");
//    }
//}

//class MyProgram{
//    public static void main(String[] args){
////        System.out.println("Я прекрасно понимаю разницу ");
//        System.out.print("Я прекрасно понимаю разницу ");
//        System.out.println("между System.out.println()");
////        System.out.print("между System.out.println()");
////        System.out.println("и System.out.print(). ");
//        System.out.print("и System.out.print(). ");
//        System.out.println("А ты?");
////        System.out.print("А ты?");
//    }
//}

//class MyProgram {
//    public static void main(String[] args) {
//        System.out.println("Hello, Java!");
//    }
//}

//class MyProgram{
//    public static void main(String[] args){
//        int a = 5;
//        float b = 0.4f;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//    }
//}


//class MyProgram {
//    public static void main(String[] args) {
//        int a = 5;
//        String b = "end";
//        System.out.println("Это ещё не " + b + ". a=" + a);
//        System.out.println("a + 4 = " + (a+4)); //используйте скобочки, если значение сначало надо вычислить
//    }
//}


//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println(a*b*c);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("The next number for the number " + a + " is " + (a+1) + ".");
//        System.out.println("The previous number for the number " + a + " is " + (a-1) + ".");
//    }
//}


//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a*b);
//        System.out.println((a+b)*2);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a+2-(a%2));
//    }
//}


//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int n = sc.nextInt();
//        System.out.println((a*n+(b*n)/100)+ " " +((b*n)%100));
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a%10);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a%10+a%100/10+a/100);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println((109+(a*b))%109);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int h = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println((h - 2*b + a - 1)/(a - b));
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        System.out.println((a+3)/2);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println(a%10+b%10+c%10+"vll");
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println(a+(a*b)/c);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        b = b/100;
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        System.out.println(a*b+a*c*d);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a*60+b);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a-b*5);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println(a-b*c);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.print(b/a+" "+b%a);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.print(a*(b-1));
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.print(a%10+b);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        int b = sc.nextInt();
//        System.out.print(a/b);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.print(a*4+b*2);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        System.out.print(a*c+b*d);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.print((a+1)+"-"+(a+2)+"-"+(a+3));
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.print(a*b);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a<b){
//            System.out.println(b);
//        }
//        else {
//            System.out.println(a);
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//        String c = sc.nextLine();
//        if (a.equals(b) && b.equals(c)){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        double b = sc.nextDouble();
//        if (b != 0){
//            System.out.println(a/b);
//        }
//        else {
//            System.out.println("Error");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a/2 > 10) {
//            System.out.println(a-10);
//        } else {
//            System.out.println(a/2);
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if (((a*60*60) + b * 60) >= c) {
//            System.out.println("Успел");
//        } else {
//            System.out.println("Опоздал");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if (a > b & a > c) {
//            System.out.println(a);
//        } else if (b > a & b > c) {
//            System.out.println(b);
//        } else {
//            System.out.println(c);
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//        String c = sc.nextLine();
//        int l = 0;
//        if (a.equals(b)) {
//            l += 1;
//        }
//        if (a.equals(c)) {
//            l += 1;
//        }
//        if (b.equals(c)) {
//            l += 1;
//        }
//        if (l == 1) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if ((c % b == 0)  || (c % a == 0)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if (((c % b == 0)  || (c % a == 0)) && (c < a * b) && (c<=30000)){
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        if (x>y) {
//            System.out.println(y);
//        } else {
//            System.out.println(x);
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float x = sc.nextFloat();
//        if (x > 22.4f) {
//            System.out.println("Тепло!");
//        } else if (x == 22.4f) {
//            System.out.println("Прохладно...");
//        } else {
//            System.out.println("Холодно(");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        if (10 <= x && x <= 99) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        if (10 <= x && x <= 99) {
//            System.out.println(2);
//        } else if (x>=100 && x<=999){
//            System.out.println(3);
//        } else if (x == 1000) {
//            System.out.println(4);
//        } else {
//            System.out.println(1);
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a == 0 && b == 0) {
//            System.out.println("inf");
//        } else if (a == 0 && b !=0 ) {
//            System.out.println(0);
//        } else {
//            System.out.println(1);
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        float D = b*b - 4*a*c;
//        if (D>0) {
//            System.out.println(2);
//        } else if (D == 0){
//               System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        float D = b*b - 4*a*c;
//        if (a == 0) {
//            if(b == 0 && c != 0) {
//                System.out.println("0");
//            } else if (b == 0 && c == 0) {
//                System.out.println("inf");
//            } else {
//                System.out.println("1");
//            }
//        } else if(D < 0) {
//            System.out.println("0");
//        } else if(D > 0) {
//            System.out.println("2");
//        } else {
//            System.out.println("1");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float x = sc.nextFloat();
//        float y = sc.nextFloat();
//        if ((x * 2.0) < y) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float x = sc.nextFloat();
//        float y = sc.nextFloat();
//        if (((x * 2.0) < y) && ((x*3.0)>y)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float x = sc.nextFloat();
//        float y = sc.nextFloat();
//        if (((x / 2) > y) && ((x*x-2*x-3)<y)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float x = sc.nextFloat();
//        float y = sc.nextFloat();
//        if ((y*y+x*x<5) && ((x*x-3)>y)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float x = sc.nextFloat();
//        float y = sc.nextFloat();
//        if ((y*y+x*x<5) && ((x*x-3)>y) && (y>(0.5*x-1))) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float x = sc.nextFloat();
//        float y = sc.nextFloat();
//        if (((y*y+x*x<5) && ((x*x-3)>y) && (y>(0.5*x-1))) || (y*y+x*x>5 && y>(x*x-3) && y<0)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        if (x>=21) {
//            System.out.println("Да");
//        } else {
//            System.out.println("Нет");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println((x>=21) ? "Да" : "Нет");
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.println(Math.hypot(x,y));
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int z = sc.nextInt();
//        System.out.println(((2 * (Math.max(Math.max(x, y), z))) < (x+y+z)) ? "Yes" : "No");
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        float b = sc.nextFloat();
//        float c = sc.nextFloat();
//        float d = sc.nextFloat();
//        if (Math.signum(a) == Math.signum(c) && Math.signum(b) == Math.signum(d)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        float b = sc.nextFloat();
//        float c = sc.nextFloat();
//        float d = sc.nextFloat();
//        if (a == c || b == d) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x1 = sc.nextInt();
//        int y1 = sc.nextInt();
//        int x2 = sc.nextInt();
//        int y2 = sc.nextInt();
//
//        int a = Math.abs(x1-x2);
//        int b = Math.abs(y1-y2);
//
//        String x = a==b? "YES":"NO";
//
//        System.out.println(x);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x1 = sc.nextInt();
//        int y1 = sc.nextInt();
//        int x2 = sc.nextInt();
//        int y2 = sc.nextInt();
//
//        int a = Math.abs(x1-x2);
//        int b = Math.abs(y1-y2);
//
//        String x = a+b==3? "YES":"NO";
//
//        System.out.println(x);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x1 = sc.nextInt();
//        int y1 = sc.nextInt();
//        int x2 = sc.nextInt();
//        int y2 = sc.nextInt();
//        int a = Math.abs(x1-x2);
//        int b = Math.abs(y1-y2);
//        if ((x1 == x2 || y1 == y2) || (a==b)){
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        if (x%10 >= 5 || (x>=5 && x<=20)) {
//            System.out.println(x+" коров");
//        } else if (x % 10 == 1) {
//            System.out.println(x+" корова");
//        } else {
//            System.out.println(x+" коровы");
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt();
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        if (k>=n) {
//            System.out.println(2*m);
//        } else {
//            System.out.println((int) (Math.ceil((2.0*n)/k)*m));
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt();
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        int a = Math.min(Math.min(k,m), n);
//        int b = Math.max(Math.max(k, m), n);
//        System.out.println(a + " " + (k+m+n-a-b) + " " + b);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt();
//        int kk = k;
//        int C = 0;
//        int L = 0;
//        int X = 0;
//        int V = 0;
//        int I = 0;
//        if (k == 100) {
//            C = k / 100;
//            k = k%100;
//        }
//        if  (k>=50) {
//            L = k / 50 % 10;
//            k = k % 50;
//        }
//        if (k >= 10) {
//            X = k / 10 % 10;
//            k = k % 10;
//        }
//        if (k>=5) {
//            V = k / 5;
//            k = k%5;
//        }
//        if (k>=1) {
//            I = k;
//            k -= k;
//        }
//        System.out.println(C+" "+L+" "+X+" "+V+" "+I);
//        String Cl = new String(new char[C]).replace("\0", "C");
//        String Ll = new String(new char[L]).replace("\0", "L");
//        String Xl = new String(new char[X]).replace("\0", "X");
//        String Vl = new String(new char[V]).replace("\0", "V");
//        String Il = new String(new char[I]).replace("\0", "I");
//        System.out.println(Cl+Ll+Xl+Vl+Il);
//        if (X>3) {
//            Xl = "X";
//            Ll = "L";
//            if (I>3){
//                if (V>=1) {
//                    System.out.println("XLIX");
//                }
//                else {
//                    Il = "I";
//                    Vl = "V";
//                    System.out.println(Xl+Ll+Il+Vl);
//                }
//            }
//            else {
//                if (kk>=45) {
//                    System.out.println(Xl + Ll + Vl + Il);
//                }
//                else {
//                    System.out.println(Xl+Ll+Il);
//                }
//            }
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int i = 1;
//        while (i*i<=x){
//            System.out.println(i*i++);
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = b;
//        while (a < b){
//            sum += a++;
//        }
//        System.out.println(sum);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int counter = 0;
//        while (a <= b){
//            if (a % 3 == 0 && a % 5 != 0) {
//                counter++;
//            }
//            a++;
//        }
//        System.out.println(counter);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int counter = 0, summary = 0;
//        while (a != 0){
//            counter += 1;
//            summary += a;
//            a = sc.nextInt();
//        }
//        System.out.println((float) summary/counter);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int counter = 0;
//        while (a != 0){
//            if (a > counter) {
//                counter = a;
//            }
//            a = sc.nextInt();
//        }
//        System.out.println(counter);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        while (a <= b){
//            if (a % 2 == 0) {
//                System.out.println(a);
//            }
//            a++;
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = 2;
//        while (a % b != 0){
//            b++;
//        }
//        System.out.println(b);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = 0;
//        int i = 1;
//        while (i<=a){
//            b += i*i;
//            i++;
//        }
//        System.out.println(b);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextInt();
//        float b = sc.nextInt();
//        int i = 1;
//        while (a<b){
//            a *= 1.1;
//            i++;
//        }
//        System.out.println(i);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int i = 0;
//        while (a>0){
//            i += a%10;
//            a /= 10;
//        }
//        System.out.println(i);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int maxim = -1;
//        int second_max = -1;
//
//        while (a != 0){
//            if (a > maxim) {
//                second_max = maxim;
//                maxim = a;
//            }
//            else if ((maxim >= a) && (a >= second_max)) {
//                second_max = a;
//            }
//            a = sc.nextInt();
//        }
//        System.out.println(second_max);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int i = 1;
//        while (i<=a) {
//            System.out.println(i);
//            i++;
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a <= b) {
//            while (a <= b) System.out.println(a++);
//        } else {
//            while (a >= b) System.out.println(b--);
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt();
//        int n = sc.nextInt();
//        int i = 1;
//        while (i<=n) {
//            if (i%k == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 0;
//        while (n != 0) {
//            i++;
//            n = sc.nextInt();
//        }
//        System.out.println(i);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 0;
//        while (n != 0) {
//            i += n;
//            n = sc.nextInt();
//        }
//        System.out.println(i);
//    }
//}

//import java.util.Scanner;
//class MyProgram{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int x = sc.nextInt();
//        int c = x;
//        while (n > x) {
//            x += c;;
//        }
//        System.out.println(x);
//    }
//}

//import java.util.Scanner;
//class main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int c = 0;
//        int m = 1;
//
//        while (true){
//            int s = sc.nextInt();
//            c += 1;
//            m *= s;
//
//            if (n <= m){
//                break;
//            }
//        }
//        System.out.print(c + " ");
//        System.out.print(m);
//    }
//}

//import java.util.Scanner;
//class main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int b = 1;
//            while (i>=b) {
//                System.out.print("*");
//                b++;
//            }
//            i++;
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//class main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 1;
//        int c = 1;
//        int k = 1;
//        int razmer = (n-1)*2+1;
//        while (i<=n) {
//            c = 1;
//            while (c <= n-i) {
//                System.out.print(" ");
//                c++;
//            }
//            k = 1;
//            while (k<i*2) {
//                System.out.print("*");
//                k++;
//            }
//
//            System.out.println();
//            i++;
//        }
//    }
//}

//import java.util.Scanner;
//class main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 0;
//        int summa = 0;
//        int m;
//        while (i != n) {
//            m = sc.nextInt();
//            summa += m;
//            i++;
//        }
//        System.out.println(summa);
//    }
//}

//import java.util.Scanner;
//class main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 0;
//        int summa = 0;
//        int m;
//        while (i != n) {
//            m = sc.nextInt();
//            if (m % 2 == 0) {
//                summa++;
//            }
//            i++;
//        }
//        System.out.println(summa);
//    }
//}

//import java.util.Scanner;
//class main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int b = sc.nextInt();
//        int summa = 0;
//        for (int i = n; i<=b; i++) {
//            summa += i;
//        }
//        System.out.println(summa);
//    }
//}

//import java.util.Scanner;
//class main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int summa = 0;
//        while (n % 7 != 0) {
//            if (n % 10 == 7) {
//                summa += n;
//            }
//            n = sc.nextInt();
//        }
//        System.out.println(summa);
//    }
//}

//import java.util.Scanner;
//class main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean flag = false;
//        for (String i = sc.nextLine(); true; i = sc.nextLine()) {
//            if (i.equals("СТОП")) {
//                break;
//            }
//            else if (i.equals("Куб")) {
//                flag = true;
//            }
//        }
//        System.out.println(flag ? "YES" : "NO");
//    }
//}

//import java.lang.Math;
//import java.util.Scanner;
//class main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int c;
//        double maxim = Math.pow(-10, 9);
//        double minim = Math.pow(10, 9);
//        for (int i = 0; i<n; i++) {
//            c = sc.nextInt();
//            if (c > maxim) {
//                maxim = c;
//            }
//            if (c < minim) {
//                minim = c;
//            }
//        }
//        System.out.println((int) minim);
//        System.out.println((int) maxim);
//    }
//}

//import java.util.Scanner;
//class main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int product = 1;
//        for (int i = 1; i<=n; i++) {
//            product *= i;
//        }
//        System.out.println(product);
//    }
//}

//import java.util.Scanner;
//class main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int product = 1;
//        for (String i = sc.nextLine(); true; i = sc.nextLine()) {
//            if (i.equals("СТОП")) {
//                break;
//            }
//            int n = Integer.parseInt(i);
//            if (n != 0) {
//                product *= n;
//            } else {
//                continue;
//            }
//        }
//        System.out.println(product != 1 ? product : "Не найдено");
//    }
//}

//import java.lang.Math;
//import java.util.Scanner;
//class main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int n = sc.nextInt();
//        double summary = 0;
//        for (int i = 0; i<=n; i++) {
//            summary += Math.pow(a, i);
//        }
//        System.out.println((int)summary);
//    }
//}

//import java.lang.Math;
//import java.util.Scanner;
//class main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int binary = 0;
//        for (int i = 0; n>=1; i++) {
//            binary += (n%2)*Math.pow(10, i);
//            n /= 2;
//        }
//        String binary_reverse = String.valueOf(binary);
//        StringBuilder ban = new StringBuilder(binary_reverse);
//        System.out.println(ban.reverse());
//    }
//}


//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String word = "";
//        int counter = 0;
//        int index = 0;
//        for (int i = 0; !word.equals("СТОП"); i++) {
//            word = sc.nextLine();
//            counter++;
//            if (word.equals("потом")) {
//                counter--;
//            } else if (word.equals("ээээ")) {
//                counter--;
//            } else if (word.equals("Куб")) {
//                index = counter;
//            }}
//            if (index == 0) {
//                System.out.println("NO");
//            } else {
//                System.out.println(index);
//            }
//        }
//    }

//import java.util.Scanner;
//
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int next = -1;
//        int maxim = 0;
//        int counter = 0;
//        while (next != 0) {
//            next = sc.nextInt();
//            if (next > maxim) {
//                maxim = next;
//                counter = 1;
//            } else if (next == maxim) {
//                counter++;
//            }
//        }
//        System.out.println(counter);
//    }
//}

//class main {
//    public static void main(String[] args) {
//        for (int i = 0; i<10; i++) {
//            System.out.println("Привет");
//        }
//    }
//}

//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println((float) (1+n)/2*n);
//    }
//}

//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int summary = 0;
//        for (int i = 1; i<=n; i++) {
//            summary += Math.pow(i, 2);
//        }
//        System.out.println(summary);
//    }
//}

//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for (int i = a; a<=b; a++) {
//            System.out.println(a+" "+a+".$");
//        }
//    }
//}

//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        long multiplication = 1;
//        for (int i = 0; i<a; i++) {
//            int b = sc.nextInt();
//            multiplication *= b;
//        }
//        System.out.println(multiplication);
//    }
//}

//class main {
//    public static void main(String[] args) {
//        for (int i = 0; i<10; i++) {
//            if (i % 2 == 1) {
//                System.out.print(i+" ");
//            }
//        }
//    }
//}

//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int multi = 1;
//        for (int i = a; a<=b; a++) {
//            multi *= a;
//        }
//        System.out.println(multi);
//    }
//}


//class main {
//    public static void main(String[] args) {
//        for (int i = 50; i>=0; i-=10) {
//            System.out.println(i);
//        }
//    }
//}


//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        for (int i = a; a>=b;a-=c){
//            System.out.println(a);
//        }
//    }
//}

//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String ago;
//        int geniy = 0;
//        for (int i = 0; i<n*2;i++){
//            if (i%2==0) {
//                ago = sc.next();
//            } else {
//                geniy += sc.nextInt();
//            }
//        }
//        System.out.println((float) geniy/n);
//    }
//}

//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i<=9; i++) {
//            System.out.println(n+" * "+i+" = "+n*i);
//        }
//    }
//}

//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i<=n; i++) {
//            System.out.println("""
//                    :)\\_____/(:
//                     {(@)v(@)}
//                     {|~- -~|}
//                     {/^'^'^\\}
//                     ===m-m===
//                    """);
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int summary = 1;
//        for (int i = 0; i<n; n/=10) {
//            summary *= n%10;
//        }
//        System.out.println(summary);
//    }
//}

//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for (int i = b; b>=a; b-=2) {
//            System.out.println(b);
//        }
//    }
//}

//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int n;
//        boolean flag = false;
//        for (int i = 0; i<a; i++) {
//            n = sc.nextInt();
//            if (n%10==4 & flag == false) {
//                flag = true;
//            }
//        }
//        System.out.println(flag == true ? "YES" : "NO");
//    }
//}

//import java.util.Scanner;
//
//class MyProgram{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int counter = 0;
//        while (true) {
//            String correct = sc.nextLine();
//            String vasya = sc.nextLine();
//            counter++;
//            if (correct.equals(vasya)) {
//                System.out.println("CORRECT");
//                break;
//
//            } else {
//                System.out.println("INCORRECT " + counter);
//            }if (counter == 5) {
//                System.out.println("Error");
//                break;
//            }
//        }
//    }
//}

//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (b/2>=a) {
//            System.out.println(b-a*2+2020);
//        }   else {
//            System.out.println("Никогда");
//        }
//    }
//}

//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner( System.in );
//        int a = sc.nextInt();
//        int counter = 0;
//        for (int i = 1; i<=a; i++)
//            if (a%i==0) {
//                counter++;
//            }
//        System.out.println(counter);
//    }
//}

//import java.util.Scanner;
//
//class main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(), k = sc.nextInt();
//        String sum = "";
//        StringBuilder sum_plus = new StringBuilder(sum) ;
//        while (true){
//            sum = String.valueOf(n%k);
//            sum_plus.append(sum);
//            n /= k;
//            if (n == 0)break;
//        }
//        System.out.println(sum_plus.reverse());
//    }
//}
//
//import java.util.Scanner;
//
//class main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(), k = sc.nextInt();
//        String sum = "";
//        StringBuilder sum_plus = new StringBuilder(sum) ;
//        while (true){
//            sum = String.valueOf(n%k);
//            sum_plus.append(sum);
//            n /= k;
//            if (n == 0)break;
//        }
//        System.out.println(sum_plus.reverse());
//    }
//}

//import java.util.Scanner;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int counter_3 = 0;
//        int counter_neg = 0;
//
//        while (number != 0) {
//            if (number % 3 == 0) {
//                counter_3++;
//            }
//            if (number < 0) {
//                counter_neg++;
//            }
//            number = sc.nextInt();
//        }
//
//        if (counter_3>counter_neg) {
//            System.out.println(333);
//        } else if (counter_neg > counter_3) {
//            System.out.println("negative");
//        } else {
//            System.out.println("Equal");
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int heightMax = Integer.MIN_VALUE;
//        int heightMin = Integer.MAX_VALUE;
//        String wordMax = "";
//        String wordMin = "";
//        String word;
//        int height;
//        for (int i = 0; i<number; i++) {
//            word = sc.next();
//            height = sc.nextInt();
//            if (height > heightMax) {
//                heightMax = height;
//                wordMax = word;
//            } if (height < heightMin) {
//                heightMin = height;
//                wordMin = word;
//            }
//        }
//        System.out.println(wordMin);
//        System.out.println(wordMax);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int a2 = sc.nextInt();
//        int[] data = new int[1000];
//        for (int i = 0; i<1000; i++) {
//            data[i] = (i + 1) * (i + 1) * (i + 1);
//        }
//        System.out.println(data[a1-1]);
//        System.out.println(data[a2-1]);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int[] data = new int[a1];
//        for (int i = 0; i<a1; i++) {
//            data[i] = sc.nextInt();
//        }
//        int mul = sc.nextInt();
//        for (int i = 0; i<a1; i++) {
//            data[i] *= mul;
//            System.out.println(data[i]);
//        }
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int summa = 0;
//        int[] data = new int[a1];
//        for (int i = 0; i<a1; i++) {
//            data[i] = sc.nextInt();
//            summa += data[i];
//        }
//        System.out.println(summa);
//        for (int i = data.length - 1; i >= 0; i--) {
//            System.out.println(data[i]);
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int summa = 0;
//        int[] data = new int[a1];
//        for (int i = 0; i<a1; i++) {
//            data[i] = sc.nextInt();
//            if (i % 2 == 0) {
//            summa += data[i]; }
//        }
//        System.out.println(summa);
//        for (int i = 0; i < data.length; i+=2) {
//            System.out.println(data[i]);
//        }
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int[] data = new int[a1];
//        for (int i = 0; i<a1; i++) {
//            data[i] = sc.nextInt();
//        }
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int temp = data[a];
//        data[a] = data[b];
//        data[b] = temp;
//        for (int datum : data) {
//            System.out.println(datum);
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int[] data = new int[a1];
//        for (int i = 0; i<a1; i++) {
//            data[i] = sc.nextInt();
//        }
//        int x = sc.nextInt();
//        int remember = data.length;
//        for (int i = 0; i < data.length; i++) {
//            if (x>data[i]) {
//                remember = i;
//                break;
//            } else if (x == data[i]) {
//                remember = i;
//            }
//        }
//        System.out.println(remember+1);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int[] data = new int[a1];
//        for (int i = 0; i<a1; i++) {
//            data[i] = sc.nextInt();
//        }
//        for (int i = 0; i < data.length-1; i++) {
//            if (i == 0) {
//                if (data[i] != data[i+1]) {
//                    System.out.println(data[i]);
//                }
//            } else  {
//            if ((data[i] != data[i+1]) & (data[i] != data[i-1])) {
//                System.out.println(data[i]);
//                }
//            }
//        }
//        if (data[data.length-1] != data[data.length-2]) {
//            System.out.println(data[data.length-1]);
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int temp;
//        int[] data = new int[a1];
//        for (int i = 0; i<a1; i++) {
//            data[i] = sc.nextInt();
//        }
//        for (int i = 0; i < data.length-1; i+=2) {
//            temp = data[i];
//            data[i] = data[i+1];
//            data[i+1] = temp;
//        }
//        for (int datum : data) {
//            System.out.println(datum);
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int[] data = new int[b-a+1];
//        for (int i = 0; i < data.length; i++) {
//            data[i] = (int) Math.pow(a+i, 3);
//        }
//        int n = sc.nextInt();
//        int c;
//        for (int i = 0; i < n; i++) {
//            c = sc.nextInt();
//            if (c>=a & b>=c) {
//                System.out.println(data[c-a]);
//            } else {
//                System.out.println("Error");
//            }
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner( System.in );
//        int n = sc.nextInt();
//        int[] data = new int[n];
//        int k = sc.nextInt();
//        int a,b;
//        for (int i = 0; i < data.length; i++) {
//            data[i] = 1;
//        }
//        for (int i = 0; i < k; i++) {
//            a = sc.nextInt();
//            b = sc.nextInt();
//            for (int j = a; j <= b; j++) {
//                data[j-1] = 0;
//            }
//        }
//        for (int datum : data) {
//            if (datum == 1) System.out.print("I");
//            else System.out.print(".");
//        }
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//            System.out.print(array[i] + " "); }
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i*i;
//            System.out.print(array[i] + " "); }
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = sc.nextInt();
//        }
//        for (int i = 0; i < array.length; i++)
//            System.out.print(array[i] + " ");
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = sc.nextInt();
//        }
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(array[a] + array[b]);
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] data = new int[n];
//        for (int i = 0; i < n; i++) {
//            data[i] = sc.nextInt();
//        }
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if ((a>=0 & a<=n-1) && (b>=0 & b<=n-1))
//        System.out.println(data[a] + data[b]);
//        else System.out.println("Error");
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] data = new int[n];
//        for (int i = 0; i < n; i++) {
//            data[i] = sc.nextInt();
//        }
//        int k = sc.nextInt();
//        for (int i = 0; i < k; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            if ((a>=0 & a<=n-1) && (b>=0 & b<=n-1))
//                System.out.println(data[a] + data[b]);
//            else System.out.println("Error");
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int[] data = new int[a1];
//        for (int i = 0; i<a1; i++) {
//            data[i] = sc.nextInt();
//        }
//        for (int i = 0; i < data.length-1; i++) {
//            System.out.print(data[i]+data[i+1] + " ");
//        }
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int[] data = new int[a1];
//        int counter = 0;
//        for (int i = 0; i<a1; i++) {
//            data[i] = sc.nextInt();
//        }
//        for (int i = 0; i < data.length-1; i++) {
//            if (data[i+1] > data[i]) counter++;
//        }
//        System.out.println(counter);
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int[] data = new int[a1];
//        int counter = -1;
//        for (int i = 0; i<a1; i++) {
//            data[i] = sc.nextInt();
//        }
//        int k = sc.nextInt();
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] == k) counter = i;
//        }
//        System.out.println(counter == -1 ? "Error" : counter);
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int[] data = new int[a1];
//        int counter = 0;
//        for (int i = 0; i<a1; i++) {
//            data[i] = sc.nextInt();
//        }
//        int k = sc.nextInt();
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] == k) counter ++;
//        }
//        System.out.println(counter);
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int[] data = new int[a1];
//        int counter = 0;
//        for (int i = 0; i<a1; i++) {
//            data[i] = sc.nextInt();
//        }
//        int k = sc.nextInt();
//        for (int i = 0; i < k; i++) {
//            counter += data[i]
//        }
//        System.out.println(counter);
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int[] data = new int[a1];
//        int counter = 0;
//        for (int i = 0; i<a1; i++) {
//            data[i] = sc.nextInt();
//        }
//        int k = sc.nextInt();
//        int k1 = sc.nextInt();
//        for (int i = k; i <= k1; i++) {
//            counter += data[i];
//        }
//        System.out.println((float) counter/(k1-k+1));
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        float[] data = new float[a1];
//        float[] data1 = new float[a1];
//        for (int i = 0; i<a1; i++) {
//            data[i] = sc.nextFloat();
//        }
//        for (int i = 0; i<a1; i++) {
//            data1[i] = sc.nextFloat();
//        }
//        for (int i = 0; i < data.length; i++) {
//            System.out.println( data[i]+data1[i]);
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] data = new int[n][m];
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                data[i][j] = (i+1) * (j+1);
//            }
//        }
//        for (int[] datum : data) {
//            for (int datumm : datum) {
//                System.out.print(datumm + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] data = new int[n][m];
//
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                data[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int[] datum : data) {
//            for (int datumm : datum) {
//                System.out.print(datumm + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] data = new int[n][n];
//        boolean flag = true;
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                data[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                if (data[i][j] == data[j][i]) {
//                    flag = true;
//                } else {
//                    flag = false;
//                    break;
//                }
//                if (flag == false) break;
//            }
//        }
//        System.out.println(flag ? "YES" : "NO");
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int c = Integer.MAX_VALUE;
//        int rem = 0;
//        int rem2 = 0;
//        int[][] data = new int[n][m];
//
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                data[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                if (data[i][j]<c) {
//                    c = data[i][j];
//                    rem = i;
//                    rem2 = j;
//                }
//            }
//        }
//        System.out.println(rem + " " + rem2);
//    }
//}

//import java.util.Arrays;
//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int c = 0;
//        int rem = Integer.MIN_VALUE;
//        String rem2 = "";
//        int[][] data = new int[n][];
//        data[0] = new int[m];
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                data[i][j] = sc.nextInt();
//            }
//            if (i != n-1){
//            int d = sc.nextInt();
//            data[i+1] = new int[d];}
//        }
//
//        for (int i = 0; i < data.length; i++) {
//            int summa = 0;
//            for (int j = 0; j < data[i].length; j++) {
//                summa += data[i][j];
//            }
//            if (summa > rem) {
//                c = i+1;
//                rem = summa;
//                rem2 = Arrays.toString(data[i])
//                        .replace(",", "")  //remove the commas
//                        .replace("[", "")  //remove the right bracket
//                        .replace("]", "")  //remove the left bracket
//                        .trim();           //remove trailing spaces from partially initialized arrays
//                ;
//            }
//        }
//        System.out.println(c);
//        System.out.println(rem);
//        System.out.println(rem2);
//    }
//}


//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] data = new int[n][m];
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                data[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(data[n-j-1][i] + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] data = new int[n][m];
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                data[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(data[j][m-i-1] + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[][] data = new int[n][n];
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                data[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(data[j][i] + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean flag = true;
//        int[][] data = new int[n][n];
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                data[i][j] = sc.nextInt();
//            }
//        }
//        int findout = 0;
//        for (int i : data[0]) {
//            findout += i;
//        }
//        for (int i = 0; i < n; i++) {
//            int multi = 0;
//            int multi1 = 0;
//            for (int j = 0; j < n; j++) {
//                multi += data[i][j];
//                multi1 += data[j][i];
//            }
//            if (multi != findout) {
//                flag = false;
//            }
//            if (multi1 != findout) {
//                flag = false;
//            }
//        }
//        System.out.println(flag ? "YES" : "NO");
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] data = new int[n];
//        for (int i = 0; i < data.length; i++) {
//            data[i] = sc.nextInt();
//            if (i % 2 == 0) System.out.print(data[i] + " ");
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] data = new int[n];
//        for (int i = 0; i < data.length; i++) {
//            data[i] = sc.nextInt();
//            if (data[i] % 2 == 0) System.out.print(data[i] + " ");
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] data = new int[n];
//        for (int i = 0; i < data.length; i++) {
//            data[i] = sc.nextInt();
//        }
//        boolean flag = false;
//
//        for (int i = 0; i < data.length-1; i++) {
//            if (data[i] * data[i+1] > 0) {
//                flag = true;
//                break;
//            }
//        }
//
//        System.out.println(flag ? "YES" : "NO");
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] data = new int[n];
//        for (int i = 0; i < data.length; i++) {
//            data[i] = sc.nextInt();
//        }
//        int count = 0;
//
//        for (int i = 1; i < data.length-1; i++) {
//            if ((data[i]>data[i-1]) & (data[i]>data[i+1])) {
//                count += 1;
//            }
//        }
//
//        System.out.println(count);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] data = new int[n];
//        for (int i = 0; i < data.length; i++) {
//            data[i] = sc.nextInt();
//        }
//        int temp;
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data.length; j++) {
//                if (data[i] < data[j]) {
//                    temp = data[i];
//                    data[i] = data[j];
//                    data[j] = temp;
//                }
//            }
//        }
//        for (int i : data) {
//            System.out.print(i + " ");
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] data = new int[n][n];
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[0].length; j++) {
//                if (i+j == (n-1)) {
//                    data[i][j] = 1;
//                } else if (i+j > (n-1)) {
//                    data[i][j] = 2;
//                } else {
//                    data[i][j] = 0;
//                }
//            }
//        }
//
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[0].length; j++) {
//                System.out.print(data[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] data = new int[n][m];
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[0].length; j++) {
//                    data[i][j] = sc.nextInt();
//                }
//            }
//        }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int first = 0, second = 0;
//        int maxim = 0;
//        int[][] data = new int[n][m];
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[0].length; j++) {
//                data[i][j] = sc.nextInt();
//                if (data[i][j] > maxim) {
//                    maxim = data[i][j];
//                    first = i;
//                    second = j;
//                }
//            }
//        }
//        System.out.println(maxim);
//        System.out.println(first + " " + second);
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int maxim = 0;
//        int counter = 0;
//        int[][] data = new int[n][m];
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[0].length; j++) {
//                data[i][j] = sc.nextInt();
//                if (maxim < data[i][j]) {
//                    maxim = data[i][j];
//                }
//            }
//        }
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[0].length; j++) {
//                 if (maxim == data[i][j]) {
//                    counter += 1;
//                    break;
//                }
//            }
//        }
//        System.out.println(counter);
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[0].length; j++) {
//                if (maxim == data[i][j]) {
//                    System.out.print(i + " ");
//                    break;
//                }
//            }
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        char a = sc.next().charAt(0);
//        if ('0' <= a & '9' >= a) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
//        System.out.println(word.charAt(2));
//        System.out.println(word.charAt(word.length()-2));
//        System.out.println(word.substring(0, 5));
//        System.out.println(word.substring(0, word.length()-2));
//        System.out.println(word.substring(3));
//        System.out.println(word.length());
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//        String word = sc.nextLine();
//        word = word.replace(a, b);
//        System.out.println(word);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        sc.nextLine();
//        String[] data = new String[a];
//        for (int i = 0; i < data.length; i++) {
//            data[i] = sc.nextLine();
//        }
//        String sep = sc.nextLine();
//        System.out.println(String.join(sep, data));
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//        System.out.println(a.indexOf(b));
//        System.out.println(a.lastIndexOf(b));
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//        int f = 0;
//        int d = 0;
//        String[] c = sc.nextLine().toLowerCase().split(" ");
//        for (String s : c) {
//            if (s.startsWith(a) & s.endsWith(b)) f++;
//            if (s.startsWith(b) & s.endsWith(a)) d++;
//        }
//        System.out.println(f);
//        System.out.println(d);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        String[] a = sc.nextLine().split("\\.");
//        if (a.length==4) {
//            int b = Integer.parseInt(a[0]);
//            int c = Integer.parseInt(a[1]);
//            int d = Integer.parseInt(a[2]);
//            int e = Integer.parseInt(a[3]);
//            if (b >= 0 & b<=255 & c >= 0 & c <= 255 & d >= 0 & d <= 255 & e >=0 & e <= 255) {
//                System.out.println("YES"); } else {System.out.println("NO");}
//        } else {
//            System.out.println("NO");
//        }
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        int a = Integer.parseInt(sc.nextLine());
//        String[] data = new String[a];
//        for (int i = 0; i < data.length; i++) {
//            data[i] = sc.nextLine();
//        }
//
//        int b = Integer.parseInt(sc.nextLine());
//        String[][] rep = new String[b*2][2];
//        for (int i = 0; i < b; i++) {
//            rep[i] = sc.nextLine().split(" - ");
//            rep[i+b][0] = rep[i][0].substring(0, 1).toUpperCase()+rep[i][0].substring(1);
//            rep[i+b][1] = rep[i][1].substring(0, 1).toUpperCase()+rep[i][1].substring(1);
//        }
//
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < rep.length; j++) {
//                data[i] = data[i].replace(rep[j][0], rep[j][1]);
//            }
//        }
//
//        for (String s : data) {
//            System.out.println(s);
//        }
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
//        char[] data = word.toCharArray();
//        int counter = 0;
//        for (char c : data) {
//            if (c == 'f') {
//                counter++;
//            }
//        }
//        System.out.println(counter);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
//        char[] data = word.toCharArray();
//        String b = sc.nextLine();
//        int counter = 0;
//        for (char c : data) {
//            if (c == b.toLowerCase().charAt(0) | c == b.toUpperCase().charAt(0)) {
//                counter++;
//            }
//        }
//        System.out.println(counter);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
//        char[] data = word.replaceAll("\\W","").toCharArray();
//        int digit = 0;
//        int letter = 0;
//        for (char c : data) {
//            if (Character.isDigit(c)) {
//                digit++;
//            } else {
//                letter++;
//            }
//        }
//        if (digit > letter) {
//            System.out.println("Digit");
//        } else if (letter > digit) {
//            System.out.println("Letter");
//        } else {
//            System.out.println("Equal");
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char[] word = sc.nextLine().toCharArray();
//        StringBuffer answer = new StringBuffer();
//        for (Character c : word) {
//            if (Character.isDigit(c) | Character.isLetter(c) | (c == ' ')) {
//                answer.append(c);
//            }
//        }
//        System.out.println(answer);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuffer word = new StringBuffer(sc.nextLine().toLowerCase().replace(" ",""));
//        String word1 = new String(word);
//        word = word.reverse();
//        String word2 = new String(word);
//        System.out.println(word1.equals(word2) ? "YES" : "NO");
//    }
//}

//import java.lang.Math;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] word = sc.nextLine().split(" ");
//        int maxim = 0;
//        for (String s : word) {
//            maxim = Math.max(maxim, s.length());
//        }
//        System.out.println(maxim);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine().toLowerCase().replaceAll(" ", "");
//        int[] data = new int[26];
//        for (int i = 0; i < data.length; i++) {
//            data[i] = 0;
//        }
//        for (int i = 0; i < word.length(); i++) {
//            char b = word.charAt(i);
//            data[(int) b - (int) 'a']++;
//        }
//        int maxim = 0;
//        char f = ' ';
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] > maxim) {
//                maxim = data[i];
//                f = (char) ((int) 'a' + i);
//            }
//        }
//        System.out.println(f + " " + maxim);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
//        String b = "1000001021";
//        int counter = 0;
//        for (int i = 0; i < word.length(); i++) {
//            int a =  Integer.parseInt(word.substring(i, i+1));
//            counter += Integer.parseInt(b.substring(a, a + 1 ));
//        }
//        System.out.println(counter);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String first = sc.nextLine();
//        String[] mas = first.replaceAll("\\D+", " ").split(" ");
//        String[] lol = mas.clone();
//        for (int i = 0; i < mas.length; i++) {
//            lol[i] = Integer.toBinaryString(Integer.parseInt(mas[i]));
//            first = first.replaceFirst(mas[i], lol[i]);
//        }
//        System.out.println(first);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i < n+1; i++) {
//            System.out.println(i);
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine().toLowerCase();
//        System.out.print(
//                s.contains(" повторение") ||
//                s.contains(" повторение ") ||
//                s.contains("повторение ")
//                ? "YES" : "NO");
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<String> data = new ArrayList<>();
//        data.add("1");
//        for (int i = 0; i < n; i++) {
//            data.add("0");
//        }
//        data.add("1");
//        System.out.println(String.join(" ", data));
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =  Integer.parseInt(sc.nextLine());
//        int ind = Integer.parseInt(sc.nextLine());
//        String word = sc.nextLine();
//        ArrayList<String> data = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            data.add(Integer.toString(i));
//        }
//        data.add(ind, word);
//        System.out.println(String.join(" ", data));
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =  Integer.parseInt(sc.nextLine());
//        int ind = Integer.parseInt(sc.nextLine());
//        String word = sc.nextLine();
//        ArrayList<String> data = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            data.add(Integer.toString(i));
//        }
//        data.set(ind, word);
//        System.out.println(String.join(" ", data));
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =  Integer.parseInt(sc.nextLine());
//        int ind = Integer.parseInt(sc.nextLine());
//        ArrayList<String> data = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            data.add(Integer.toString(i));
//        }
//        data.remove(ind);
//        System.out.println(String.join(" ", data));
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =  Integer.parseInt(sc.nextLine());
//        ArrayList<String> data = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            String word;
//            word = sc.nextLine();
//            if (word.length() == 3) {
//                System.out.println("воспроизводится " + data.remove(0));
//            } else {
//                data.add(word.substring(5));
//            }
//        }
//        System.out.println(String.join(" ", data));
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =  Integer.parseInt(sc.nextLine());
//        ArrayList<String> data = new ArrayList<>();
//        String word;
//        for (int i = 0; i < n; i++) {
//            word = sc.next();
//            if (word.equals("Добавить")) {
//                data.add(sc.next());
//            } else if (word.equals("Следующий!")) {
//                data.remove(0);
//            } else {
//                sc.next();
//                sc.next();
//                String here = sc.next();
//                data.add(data.indexOf(here)+1, word);
//            }
//        }
//        System.out.println(String.join(" ", data));
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =  Integer.parseInt(sc.nextLine());
//        ArrayList<String> data = new ArrayList<>();
//        String word;
//        for (int i = 0; i < n; i++) {
//            word = sc.next();
//            if (word.equals("push")) {
//                data.add(sc.next());
//            } else {
//                data.trimToSize();
//                System.out.println("Петя взял " + data.remove(data.size()-1));
//            }
//        }
//        System.out.println(String.join(" ", data));
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =  Integer.parseInt(sc.nextLine());
//        ArrayList<String> data = new ArrayList<>();
//        String word;
//        String remember = "";
//        for (int i = 0; i < n; i++) {
//            word = sc.next();
//            if (word.equals("Добавить")) {
//                String a = sc.next();
//                data.add(a);
//                System.out.println(a + " в очереди");
//            } else if (word.equals("Следующий!")) {
//                data.trimToSize();
//                if (data.size() >= 1) {
//                    remember = data.remove(0);
//                    System.out.println(remember + " в обработке");}
//                else System.out.println("Отлично, попью чаёк!");
//            } else if (word.equals("Посмотреть")) {
//                sc.next();
//                data.trimToSize();
//                if (data.size()!=0) System.out.println(String.join(" ", data));
//                else System.out.println("*прокатилось перекати-поле*");
//            } else if (word.equals("Стоит")) {
//                sc.next();
//                sc.next();
//                sc.next();
//                String stop = sc.next();
//                data.trimToSize();
//                if (data.size()<5) data.add(stop);
//                else System.out.println("Слабак!");
//            } else {
//                sc.next();
//                sc.next();
//                String here = sc.next();
//                if (data.indexOf(here) != -1) data.add(data.indexOf(here)+1, word);
//                else if (remember.equals(here)) {
//                    data.add(data.indexOf(here)+1, word);
//                } else {
//                    data.add(word);
//                    System.out.println(word + ", не надо тут ля-ля");};
//            }
//        }
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        int b = Integer.parseInt(sc.nextLine());
//        ArrayList<String> data = new ArrayList<>();
//        for (int i = 1; i < n+1; i++) {
//            data.add(Integer.toString(i));
//        }
//        for (int i = 0; i < b; i++) {
//            String[] word = sc.nextLine().split(" ");
//            data.add(Integer.parseInt(word[1]), word[0]);
//        }
//        System.out.println(String.join(" ", data));
//    }
//}

//import java.util.HashMap;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        String key, val;
//        HashMap<String, String> data = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            key = sc.nextLine();
//            val = sc.nextLine();
//            data.put(key, val);
//            data.put(val, key);
//        }
//        String word = sc.nextLine();
//        System.out.println(data.get(word));
//    }
//}

//import java.util.HashMap;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        String key;
//        int a = 1;
//        int maxim = 0;
//        String rem = "";
//        HashMap<String, Integer> data = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            key = sc.nextLine();
//            data.put(key, data.getOrDefault((key), 1)+1);
//        }
//        for (String b: data.keySet()){
//            if (data.get(b) > maxim) {
//                maxim = data.get(b);
//                rem = b;
//            }
//        }
//        System.out.println(rem);
//    }
//}

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        String name, job;
//        ArrayList<String> list = new ArrayList<>();
//        HashMap<String, ArrayList<String>> data = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            name = sc.nextLine();
//            job = sc.nextLine();
//            if (!data.containsKey(job)) {
//                list = new ArrayList<>();
//                list.add(name);
//                data.put(job, list);
//            }
//            else {
//                list = data.get(job);
//                list.add(name);
//                data.put(job, list);
//            }
//        }
//
//        int maxim = 0;
//        String m = "";
//        ArrayList<String> ans = new ArrayList<>();
//        for (String k: data.keySet()) {
//            if (data.get(k).size() > maxim) {
//                maxim = data.get(k).size();
//                ans = data.get(k);
//                m = k;
//            }
//        }
//        System.out.println(maxim);
//        System.out.println(m);
//        System.out.println(String.join("\n", ans));
//    }
//}

//import java.util.HashSet;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        HashSet<Integer> data = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            data.add(sc.nextInt());
//        }
//        System.out.println(data.size());
//    }
//}

//import java.util.HashSet;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        HashSet<Integer> data = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            System.out.println(data.add(sc.nextInt()) ? "NO" : "YES");
//        }
//    }
//}

//import java.util.HashSet;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        HashSet<String> data = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            String[] word = sc.nextLine().replace("'","").split(" ");
//            for (String s : word) {
//                data.add(s);
//            }
//        }
//        System.out.println(data.size());
//    }
//}

//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        HashMap<String, HashSet<String>> data = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            String[] word = sc.nextLine().replaceAll("\\W", "").toLowerCase().split(" ");
//            HashSet<String> m = new HashSet<>();
//            for (int j = 0; j < word.length-1; j++) {
//                m.add(word[j+1]);
//            }
//            data.put(word[0], m);
//        }
//        int forgot = sc.nextInt();
//        int maxim = 0;
//        String rem = "";
//        for (String st: data.keySet()) {
//            if (data.get(st).size() > maxim) {
//                maxim = data.get(st).size();
//                rem = st;
//            }
//        }
//        System.out.println(rem + " " + maxim);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println(b*b-4*a*c);
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int D = b*b - 4*a*c;
//        if (D > 0) {
//            System.out.println(2);
//        } else if (D == 0) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int D = b*b - 4*a*c;
//        if (D > 0) {
//            System.out.println(2);
//        } else if (D == 0) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//    }
//}

//import java.util.Scanner;
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int max = Integer.MIN_VALUE;
//        for(;sc.hasNext();){
//
//            int a = sc.nextInt();
//            if (a == 0) break;
//            if(a % 3 == 0 && a > max){
//                max = a;
//            }
//        }
//        System.out.println(max == Integer.MIN_VALUE ? "404" : max);
//    }
//}

//import java.util.Scanner;
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int eq = 0;
//        for (int i = a; i < b+1; i++) {
//            if (i % 10 == 3 | i % 10 == 7) {
//                eq += i;
//            }
//        }
//        System.out.println(eq);
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        ArrayList<Float> b = new ArrayList<>();
//        float minim = Integer.MAX_VALUE;
//        float maxim = Integer.MIN_VALUE;
//        for (int i = 0; i < a; i++) {
//            float num = sc.nextFloat();
//            b.add(num);
//            minim = Math.min(minim, num);
//            maxim = Math.max(maxim, num);
//        }
//        b.set(b.indexOf(minim), maxim);
//        b.set(b.lastIndexOf(maxim), minim);
//        for (Float j : b) {
//            System.out.print(j + " ");
//        }
//    }
//}

//import java.util.Scanner;
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int[][] data = new int[a][b];
//        boolean flag1 = false;
//        boolean flag2 = false;
//        for (int i = 0; i < data.length; i++) {
//            int mul = 1;
//            for (int j = 0; j < data[0].length; j++) {
//                data[i][j] = sc.nextInt();
//                mul *= data[i][j];
//            }
//            if (mul == 15) flag1 = true;
//        }
//        for (int i = 0; i < b; i++) {
//            int mul = 1;
//            for (int j = 0; j < a; j++) {
//                mul *= data[j][i];
//            }
//            if (mul == 15) flag2 = true;
//        }
//        System.out.println(flag1 ? "YES" : "NO");
//        System.out.println(flag2 ? "YES" : "NO");
//    }
//}

//import java.util.Scanner;
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String[] word = sc.nextLine().toLowerCase().split(" ");
//        int counter = 0;
//        for (int i = 0; i < word.length; i++) {
//            if (word[i].charAt(0) == 'а') counter++;
//        }
//        System.out.println(counter);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        my_first_function();
//        my_second_function();
//        my_second_function();
//    }
//
//    static void my_first_function() {
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//    }
//
//    static void my_second_function() {
//        System.out.println("Java the best!");
//    }
//}

//import java.util.Scanner;
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        multiply(a, b, c);
//    }
//
//    static void multiply(int a, int b, int c) {
//        System.out.println(a * b * c);
//    }
//}

//import java.util.Scanner;
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        twoWords(s1, s2);
//    }
//
//    static void twoWords(String a, String b) {
//        if (a.length() > b.length()) {
//            System.out.println("Первая строка длиннее");
//        } else if (a.length() == b.length()) {
//            System.out.println("Равная длина");
//        } else {
//            System.out.println("Вторая строка длиннее");
//        }
//    }
//}

//import java.util.Scanner;
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        double s1 = sc.nextDouble();
//        double s2 = sc.nextDouble();
//        double s3 = sc.nextDouble();
//        geron(s1, s2, s3);
//    }
//
//    static void geron(double a, double b, double c) {
//        double p = (a+b+c) * 0.5;
//        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
//        System.out.println((s > 0) ? s: "Такого треугольника не существует");
//    }
//}

//import java.util.Scanner;
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String figure = sc.nextLine();
//        int x = sc.nextInt();
//        perimeter(figure, x);
//        area(figure, x);
//    }
//
//    private static void area(String figure, int x) {
//        if (figure.equals("Круг")) {
//            System.out.println((int) Math.ceil(3.14 * x * x));
//        } else {
//            System.out.println((int) Math.ceil(x * x));
//        }
//    }
//
//    private static void perimeter(String figure, int x) {
//        if (figure.equals("Круг")) {
//            System.out.println((int) Math.ceil(2 * 3.14 * x));
//        } else {
//            System.out.println((int) Math.ceil(4 * x));
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        simple(a);
//        simple(b);
//        simple(c);
//    }
//
//    private static void simple(int c) {
//        if (c != 1 && c != -1 && c != 0) {
//            int d = 2;
//            boolean flag = true;
//            while (d * d <= c) {
//                if (c % d == 0) {
//                    System.out.println("NO");
//                    flag = false;
//                    break;
//                }
//                d++;
//            }
//            if (flag) System.out.println("YES");
//        } else System.out.println("NO");
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        simpleAB(x, y);
//    }
//
//    static void simpleAB(int a, int b) {
//        for (int i = a; i < b + 1; i++) {
//            System.out.println(i + " - " + isPrime(i));
//        }
//    }
//
//    static String isPrime(int a) {
//        int d = 2;
//        while (d * d <= a) {
//            if (a % d == 0) {
//                return "составное";
//            }
//            d++;
//        }
//        if (a != 1)  return "простое";
//        else return "1";
//    }
//}

//import java.util.Scanner;
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] mas = new int[n];
//        for (int i = 0; i < n; i++)
//            mas[i] = sc.nextInt();
//        monneub(mas);
//    }
//
//    private static void monneub(int[] mas) {
//        int counter = 1;
//        int maxim = 1;
//        for (int i = 0; i < mas.length-1; i++) {
//            if (mas[i] <= mas[i+1]) counter++;
//            else {
//                maxim = Math.max(maxim, counter);
//                counter = 1;
//            }
//        }
//        maxim = Math.max(maxim, counter);
//        System.out.println(maxim);
//    }
//}

//import java.util.Scanner;
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        sortByLength(s);
//    }
//
//    private static void sortByLength(String s) {
//        String[] data = s.split(" ");
//        for (int i = 0; i < data.length; i++) {
//            for (int j = i+1; j < data.length; j++) {
//                if (data[i].length() > data[j].length()) {
//                    String temp = data[i];
//                    data[i] = data[j];
//                    data[j] = temp;
//                } else if (data[i].length() == data[j].length()) {
//                    if (data[i].charAt(0) > data[j].charAt(0)) {
//                        String temp = data[i];
//                        data[i] = data[j];
//                        data[j] = temp;
//                    }
//                }
//            }
//        }
//        System.out.println(String.join(" ", data));
//    }
//}

//import java.util.Scanner;
//class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        int[][] mas = new int[n][];
//        for (int i = 0; i < n; i++){
//            String line = sc.nextLine();
//            String[] numbers = line.split(" ");
//            int[] a = new int[numbers.length];
//            for (int j = 0; j < numbers.length; j++)
//                a[j] = Integer.parseInt(numbers[j]);
//            mas[i] = a;
//        }
//        maximin(mas);
//    }
//
//    private static void maximin(int[][] mas) {
//        int maxim = Integer.MIN_VALUE;
//        for (int i = 0; i < mas.length; i++) {
//            int minim = Integer.MAX_VALUE;
//            for (int j = 0; j < mas[i].length; j++) {
//                minim = Math.min(minim, mas[i][j]);
//            }
//            maxim = Math.max(maxim, minim);
//        }
//        System.out.println(maxim);
//    }
//}

//import java.util.Scanner;
//
//class Main{
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        area(a, b, c);
//    }
//
//    private static void area(int a, int b, int c) {
//        System.out.println(a * b * 2 + a * c * 2 + c * b * 2);
//    }
//
//}

//import java.util.Scanner;
//
//class Main{
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int ro = sc.nextInt();
//        int V = sc.nextInt();
//        int F = arhimed(ro, V);
//        System.out.println("F = " + F +"H");
//    }
//
//    private static int arhimed(int ro, int v) {
//        return (10 * ro * v);
//    }
//
//}

//import java.util.Scanner;
//
//class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        int[][] mas = new int[n][];
//        for (int i = 0; i < n; i++){
//            String line = sc.nextLine();
//            String[] numbers = line.split(" ");
//            int[] a = new int[numbers.length];
//            for (int j = 0; j < numbers.length; j++)
//                a[j] = Integer.parseInt(numbers[j]);
//            mas[i] = a;
//        }
//        int ans = find_0(mas);
//        if (ans != -1)
//            System.out.println("0 in " + (ans+1) + " line");
//        else
//            System.out.println("0 not found");
//    }
//
//    private static int find_0(int[][] mas) {
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                if (mas[i][j] == 0) return i;
//            }
//        }
//        return -1;
//    }
//
//}

//import java.util.Scanner;
//
//class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String number = sc.nextLine();
//        format_number(number);
//    }
//
//    static void format_number(String number) {
//        if (number.length() != 11) {
//            System.out.println("Неверное число символов");
//            return;
//        }
//        char[] word = number.toCharArray();
//        for (char s: word) {
//            if (!Character.isDigit(s)) {
//                System.out.println("Не все символы являются цифрами");
//                return;
//            }
//        }
//        if (word[0] != '8') {
//            System.out.println("Это не российский номер телефона");
//            return;
//        }
//        System.out.println(word[0] + " (" + word[1] + word[2] + word[3] + ") " + word[4] + word[5] + word[6] + "-"+word[7]+word[8]+"-"+word[9]+word[10]);
//        return;
//    }
//}

//import java.util.Scanner;
//
//class Programm{
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(factorial(n));
//    }
//
//    static int factorial(int n) {
//        if (n == 1 || n == 0) return 1;
//        return n * factorial(n-1);
//    }
//}

//import java.util.Scanner;
//
//class Programm{
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int d = sc.nextInt();
//        int h = sc.nextInt();
//        int m = sc.nextInt();
//        int s = sc.nextInt();
//        System.out.println("Секунд прошло: " + second_count(d, h, m, s));
//    }
//    static int second_count(int d, int h, int m, int s) {
//        if (d > 0) {
//            h = h + 24;
//            d--;
//        }
//        if (h > 0 && d == 0) {
//            m = m + 60;
//            h--;
//        }
//        if (m > 0 && h == 0 && d == 0) {
//            s = s + 60;
//            m--;
//        }
//        if (m == 0 && h == 0 && d == 0) {
//            return s;
//        }
//        return second_count(d, h, m, s);
//    }
//}

//import java.util.Scanner;
//
//class Programm{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        int[][] mas = new int[n][];
//        for (int i = 0; i < n; i++){
//            String line = sc.nextLine();
//            String[] numbers = line.split(" ");
//            int[] a = new int[numbers.length];
//            for (int j = 0; j < numbers.length; j++)
//                a[j] = Integer.parseInt(numbers[j]);
//            mas[i] = a;
//        }
//        int ans = find_line7(mas);
//        if (ans != -1)
//            System.out.println("Сумма строки под номером " + (ans + 1) + " кратна 7");
//        else
//            System.out.println("Таких строк нет");
//    }
//    static int i = 0;
//
//    private static int find_line7(int[][] mas) {
//        int summa = 0;
//        for (int j = 0; j < mas[i].length; j++) {
//            summa += mas[i][j];
//        }
//        if (summa % 7 == 0) {
//            return i;
//        } else {
//            i++;
//            if (i == mas.length) {
//                return -1;
//            }
//            return find_line7(mas);
//        }
//    }
//}

//import java.util.Scanner;
//
//class Programm{
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x1 = sc.nextInt();
//        int y1 = sc.nextInt();
//        int x2 = sc.nextInt();
//        int y2 = sc.nextInt();
//        king_step(x1, y1, x2, y2);
//    }
//
//    private static void king_step(int x1, int y1, int x2, int y2) {
//        if (!(1 <= x1 && x1 <= 8 && 1 <= y1 && y1 <= 8)) {
//            System.out.println(1);
//            return;
//        }
//        if (!(1 <= x2 && x2 <= 8 && 1 <= y2 && y2 <= 8)) {
//            System.out.println(2);
//            return;
//        }
//        if (x1 == x2 & y1 == y2) {
//            System.out.println(3);
//            return;
//        }
//        if (Math.abs(x1 - x2) <= 1 & Math.abs(y1-y2) <= 1) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//        return;
//    }
//
//}

//import java.util.Scanner;
//
//class Programm{
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        System.out.println(akkerman(m, n));
//    }
//
//    private static int akkerman(int m, int n) {
//        if (m == 0) return n+1;
//        if (m > 0 && n == 0) {
//            return akkerman(m - 1, 1);
//        }
//        if (m > 0 && n > 0) {
//            return akkerman(m - 1, akkerman(m, n - 1));
//        }
//        return 0;
//    }
//
//}

//import java.util.Scanner;
//
//class Programm{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] data = new int[n][2];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 2; j++) {
//                data[i][j] = sc.nextInt();
//            }
//        }
//        Perimeter(data);
//        Square(data);
//
//    }
//    static void Perimeter(int[][] mas) {
//        double perim = 0;
//        for (int i = 0; i < mas.length-1; i++) {
//            perim += Math.sqrt(Math.pow((mas[i+1][0]-mas[i][0]),2)+Math.pow(mas[i][1]-mas[i+1][1], 2));
//        }
//        perim += Math.sqrt(Math.pow((mas[mas.length-1][0]-mas[0][0]),2)+Math.pow(mas[mas.length-1][1]-mas[0][1], 2));
//        System.out.println(Math.round(perim*100)/100.0);
//        return;
//    }
//
//    static void Square(int[][] mas) {
//        double temp = 0;
//        double temp1 = 0;
//        for (int i = 0; i < mas.length-1; i++) {
//            temp += (mas[i][0] * mas[i+1][1]);
//            temp1 += (mas[i][1] * mas[i+1][0]);
//        }
//        System.out.println(Math.abs(temp - temp1)/2);
//        return;
//    }
//}

//import java.util.HashMap;
//import java.util.Scanner;
//
//class Programm{
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        data.put(-1, 0);
//        data.put(0, 1);
//        data.put(1, 1);
//        System.out.println(superfibo(n));
//    }
//    static HashMap<Integer, Integer> data = new HashMap<>();
//    private static int superfibo(int n) {
//        if (!data.containsKey(n)) {
//            data.put(n, superfibo(n-1)+superfibo(n-2)+superfibo(n-3));
//        }
//        return data.get(n);
//    }
//}

//import java.util.Scanner;
//
//class Programm {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        System.out.println(min(a, b, c, d));
//    }
//
//    static int min(int a, int b, int c, int d) {
//        return Math.min(a, Math.min(b, Math.min(c, d)));
//    }
//
//}

//import java.util.Scanner;
//
//class Programm {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean f = sc.nextInt() != 0;
//        boolean s = sc.nextInt() != 0;
//        System.out.println(xor(f, s));
//    }
//
//    static boolean xor(boolean f, boolean s) {
//        if (f & !s) return true;
//        else if (!f & s) return true;
//        else return false;
//    }
//
//}

//import java.util.Scanner;
//
//class Programm {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean f = sc.nextInt() == 1 ? true : false;
//        boolean s = sc.nextInt() == 1 ? true : false;
//        boolean t = sc.nextInt() == 1 ? true : false;
//        System.out.println(election(f, s, t));
//    }
//
//    static boolean election(boolean f, boolean s, boolean t) {
//        if (f & s & t) return true;
//        if (f & s & !t) return true;
//        if (!f & s & t) return true;
//        if (f & !s & t) return true;
//        return false;
//    }
//
//}

//import java.util.Scanner;
//
//class Programm {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(digit_count(s));
//    }
//
//    static int digit_count(String s) {
//        s = s.replaceAll("\\D", "");
//        return s.length();
//    }
//}

//import java.util.Scanner;
//
//class Programm {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] mas = new int[n];
//        for (int i = 0; i < n; i++)
//            mas[i] = sc.nextInt();
//        sort(mas);
//        for(int i: mas)
//            System.out.print(i + " ");
//    }
//
//    static void sort(int[] mas) {
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = i+1; j < mas.length; j++) {
//                if (mas[i] < mas[j]) {
//                    int temp = mas[i];
//                    mas[i] = mas[j];
//                    mas[j] = temp;
//                }
//            }
//        }
//    }
//}

//import java.util.Scanner;
//
//class Programm {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        int n = sc.nextInt();
//        System.out.println(pow(a, n));
//    }
//
//    static double pow(double a, int n) {
//        if (n==0) return 1.0;
//        double c = a;
//        for (int i = 0; i < n-1; i++) {
//            c *= a;
//        }
//        return c;
//    }
//}

//import java.util.Scanner;
//
//class Programm {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        int n = sc.nextInt();
//        System.out.println(pow(a, n));
//    }
//
//    static double pow(double a, int n) {
//        if (n == 0) return 1.0;
//        if (n % 2 == 0) return pow(a*a,  n/2);
//        return a * pow(a, n-1);
//    }
//}

//import java.util.Scanner;
//
//class Programm {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        isit(n);
//    }
//
//    static int isit(int n) {
//        if (n % 5 == 0) return isit(n / 5);
//        if (n > 3) return isit(n - 3);
//        if (n == 1) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//        return n;
//    }
//}

//import java.util.Scanner;
//
//class Programm {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        show(n, k);
//    }
//
//    static int show(int n, int k) {
//        int[] data = new int[n];
//        int maxim = Math.max(n * n, k * k);
//        for (int i = 0; i < data.length; i++) {
//            data[i] = 1;
//        }
//        for (int i = 0; i < maxim; i++) {
//
//        }
//        return;
//    }
//}

//class Main{
//    public static void main(String[] args) {
//        Animal tiger = new Animal("тигр", "Артём");
//        tiger.setAge(15);
//        tiger.setWeight(300.6);
//        tiger.setSwim(true);
//        tiger.setWalk(true);
//        tiger.setFly(false);
//        tiger.display();
//
//        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
//        duck.holiday(5);
//        duck.rename("Утя-Утя");
//        duck.display();
//        System.out.println(duck.getAge());
//        System.out.println(duck.getName());
//        System.out.println(duck.getWeight());
//        System.out.println(duck.getType());
//        System.out.println(duck.isSwim());
//        System.out.println(duck.isWalk());
//        System.out.println(duck.isFly());
//    }
//}
//
//class Main{
//    public static void main(String[] args) {
//        WritingMaterials pen = new WritingMaterials();
//        pen.setName("ручка");
//        pen.setColor("Красный");
//        pen.setLength(11.6);
//        pen.setPrice(167);
//        pen.setDraw(true);
//        pen.display();
//        pen.draw();
//        pen.priceDown(10);
//        pen.display();
//        pen.priceUp(23);
//        pen.display();
//        pen.replace_rod("Синий");
//        pen.draw();
//        System.out.println(pen.getName());
//        System.out.println(pen.getColor());
//        System.out.println(pen.getLength());
//        System.out.println(pen.getPrice());
//        System.out.println(pen.isDraw());
//    }
//
//}

import java.util.Scanner;

class Animal {
    public Animal() {
    }
    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
        this.name = "No Name";
    }


    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public String type, name;
    public int age;
    public double weight;
    public boolean isFly, isWalk, isSwim;

    public void display(){
        System.out.printf("Тип: %s , Имя: %s, Возраст: %d, Вес: %s, Умеет летать: %s , Умеет ходить: %s, Умеет плавать: %s.",
                type , name, age, weight, isFly ? "Да" : "Нет", isWalk ? "Да" : "Нет", isSwim ? "Да" : "Нет" );
        System.out.println();
    }
    public void rename(String newName) {
        name = newName;
    }
    public void holiday(int days) {
        weight += (days*0.1);
    }

    public void holiday() {
        this.weight += 0.1;
    }

    public void holiday(double m) {
        this.weight += m;
    }

    public void holiday(double m, int n) {
        this.weight += m*n;
    }
}

class Bird extends Animal {

    public Bird() {
        this.isFly = true;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    String area;
    boolean winterFly;
    public void chirik_chirik() {
        System.out.println("Chirik-Chirik");
    }

    @Override
    public void display() {
        System.out.printf("Тип: %s , Имя: %s, Возраст: %d, Вес: %s, Умеет летать: %s , Умеет ходить: %s, Умеет плавать: %s, Зона обитания: %s, Улетает ли зимовать: %s",
                type , name, age, weight, isFly ? "Да" : "Нет", isWalk ? "Да" : "Нет", isSwim ? "Да" : "Нет", area, winterFly ? "Да" : "Нет");
        System.out.println();
        System.out.println("I am Bird");
    }
}

class Fish extends Animal {
    public Fish() {
        this.isSwim = true;
    }
    String squama;

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    boolean upStreamSwim;

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama){
        this.squama = squama;
    }

    public void bul_bul() {
        System.out.println("Bul-bul");
    }

    @Override
    public void display() {
        System.out.printf("Тип: %s , Имя: %s, Возраст: %d, Вес: %s, Умеет летать: %s , Умеет ходить: %s, Умеет плавать: %s, Тип чешуи: %s, Умеет ли плавать против течения: %s",
                type , name, age, weight, isFly ? "Да" : "Нет", isWalk ? "Да" : "Нет", isSwim ? "Да" : "Нет", squama, upStreamSwim ? "Да" : "Нет" );
        System.out.println();
        System.out.println("I am Fish");
    }
}

class Insect extends Animal {
    public Insect() {
        this.isWalk = true;
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    int wingCount;
    boolean likeJesus;

    public void ggggg() {
        System.out.println("Ggggg");
    }

    @Override
    public void display() {
        System.out.printf("Тип: %s , Имя: %s, Возраст: %d, Вес: %s, Умеет летать: %s , Умеет ходить: %s, Умеет плавать: %s, Количество ног: %s, Ходит по воде: %s",
                type , name, age, weight, isFly ? "Да" : "Нет", isWalk ? "Да" : "Нет", isSwim ? "Да" : "Нет", wingCount, likeJesus ? "Да" : "Нет");
        System.out.println();
        System.out.println("I am Insect");
    }
}

//public class Main{
//    public static void main(String[] args) {
//        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
//        duck.display();
//
//        Bird b = new Bird();
//        b.setName("Bob");
//        b.display();
//        b.setArea("На югах");
//        b.setWinterFly(false);
//        System.out.println(b.getArea());
//        System.out.println(b.isWinterFly());
//        b.chirik_chirik();
//
//        Fish f = new Fish();
//        f.setName("Сельд");
//        f.display();
//        f.setSquama("Крупная");
//        f.setUpStreamSwim(true);
//        System.out.println(f.getSquama());
//        System.out.println(f.isUpStreamSwim());
//        f.bul_bul();
//
//        Insect i = new Insect();
//        i.setName("Жук Жукыч");
//        i.display();
//        i.setWingCount(4);
//        i.setLikeJesus(true);
//        System.out.println(i.getWingCount());
//        System.out.println(i.isLikeJesus());
//        i.ggggg();
//    }
//}
//class Main{
//    public static void main(String[] args) {
//        WritingMaterials pen = new WritingMaterials();
//        pen.setName("ручка");
//        pen.setColor("Красный");
//        pen.setLength(11.6);
//        pen.setPrice(167);
//        pen.setDraw(true);
//        pen.draw();
//        pen.draw("Синий");
//        pen.draw("Зелёный", 15);
//        pen.draw(4);
//
//        WritingMaterials ruler = new WritingMaterials("линека", 34);
//        ruler.setDraw(false);
//        pen.draw();
//        pen.draw("Синий");
//        pen.draw("Зелёный", 15);
//        pen.draw(4);
//
//    }
//
//}

//class Main{
//    public static void main(String[] args) {
//        WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
//        wm.display();
//
//        Pen p = new Pen();
//        p.setName("Паркер");
//        p.display();
//        p.setCountColor(2);
//        p.setAuto(false);
//        System.out.println(p.getCountColor());
//        System.out.println(p.isAuto());
//        p.writeMyName();
//
//        Ruler r = new Ruler();
//        r.setName("Линейка");
//        r.display();
//        r.setLength(25);
//        r.setWood(true);
//        System.out.println(r.getLength());
//        System.out.println(r.isWood());
//        r.measure();
//
//        Divider d = new Divider();
//        d.setName("Циркуль");
//        d.display();
//        d.setDividerType("С карандашом");
//        d.setMetal(true);
//        System.out.println(d.getDividerType());
//        System.out.println(d.isMetal());
//        d.draw_circle();
//    }
//}
class WritingMaterials {
    public WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public WritingMaterials(int price, double length, boolean draw) {
        this.price = price;
        this.length = length;
        this.draw = draw;
        this.name = "No Name";
        this.color = "No Color";
    }

    public WritingMaterials(String name, int price) {
        this.name = name;
        this.price = price;
        this.color = "No Color";
    }

    public WritingMaterials() {
    }

    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    String name, color;
    int price;
    double length;
    boolean draw;

    public void display() {
        System.out.printf("Название: %s, Цвет: %s, Длина: %s, Цена: %d, Умеет рисовать: %s", name, color, length,
                price, draw ? "Да" : "Нет");
        System.out.println();
    }

    public void replace_rod(String newColor) {
        this.color = newColor;
    }

    public void priceUp(int addPrice) {
        this.price += addPrice;
    }

    public void priceDown(int redPrice) {
        this.price -= redPrice;
    }

    public void draw() {
        if (draw) {
            System.out.printf("%s провёл линий: 1. Их цвет - %s.", name, color);
            System.out.println();
        } else {
            System.out.printf("%s не может ничего нарисовать.", name);
            System.out.println();
        }
    }
    public void draw(int n) {
        if (draw) {
            System.out.printf("%s провёл линий: %d. Их цвет - %s.", name, n, color);
            System.out.println();
        } else {
            System.out.printf("%s не может ничего нарисовать.", name);
            System.out.println();
        }
    }

    public void draw(String color) {
        if (draw) {
            System.out.printf("%s провёл линий: 1. Их цвет - %s.", name, color);
            System.out.println();
        } else {
            System.out.printf("%s не может ничего нарисовать.", name);
            System.out.println();
        }
    }
    public void draw(String color, int n) {
        if (draw) {
            System.out.printf("%s провёл линий: %d. Их цвет - %s.", name, n, color);
            System.out.println();
        } else {
            System.out.printf("%s не может ничего нарисовать.", name);
            System.out.println();
        }
    }
}

class Pen extends WritingMaterials {

    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName());
    }
    public int getCountColor() {
        return countColor;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    int countColor;
    boolean auto;

    public void writeMyName(){
        System.out.println(name);
    }
}

final class Ruler extends WritingMaterials {
    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName());
    }
    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    double length;
    boolean wood;

    public void measure() {
        System.out.println("Сейчас померяем длину");
    }
}

class Divider extends WritingMaterials {
    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName());
    }
    public String getDividerType() {
        return dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public boolean isMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public void draw_circle() {
        System.out.println("Нарисован круг");
    }
    String dividerType;
    boolean metal;
}

//class Main{
//    public static void main(String[] args) {
//        WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
//        wm.display();
//
//        Pen p = new Pen();
//        p.setName("Паркер");
//        p.display();
//        p.setCountColor(2);
//        p.setAuto(false);
//        System.out.println(p.getCountColor());
//        System.out.println(p.isAuto());
//        p.writeMyName();
//
//        Ruler r = new Ruler();
//        r.setName("Линейка");
//        r.display();
//        r.setLength(25);
//        r.setWood(true);
//        System.out.println(r.getLength());
//        System.out.println(r.isWood());
//        r.measure();
//
//        Divider d = new Divider();
//        d.setName("Циркуль");
//        d.display();
//        d.setDividerType("С карандашом");
//        d.setMetal(true);
//        System.out.println(d.getDividerType());
//        System.out.println(d.isMetal());
//        d.draw_circle();
//    }
//}

class Building {
    String name, adress, creator;
    int year;
    boolean sight;

    {
        name = "No Name";
        adress = "No Adress";
        creator = "No Creator";
        year = 0;
        sight = false;
    }
}

class Library extends Building {
    int bookCounter;
    boolean corupted;
    {
        bookCounter = 0;
        corupted = false;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookCounter=" + bookCounter +
                ", corupted=" + corupted +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", creator='" + creator + '\'' +
                ", year=" + year +
                ", sight=" + sight +
                '}';
    }

    public void beSilent() {
        System.out.println("Прекратите шуметь!");
    }
}

abstract class Human{
    double height;
    double weight;
    int iq;

    abstract void Fart();
}

class Kurator extends Human {
    public void Fart() {
        System.out.println("Пук!");
    }

    public void checkHomework(){
        System.out.println("Проверяю домашку");
    }
    int salary;
    {
        height = 180;
        weight = 75;
        salary = 0;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String[] exp = sc.nextLine().split(" ");
//        calc(exp);
        Library b = new Library();
        b.beSilent();
        System.out.println(b.toString());

    }

    public static void calc(String[] exp) {
        double num1 = 0;
        double num2 = 0;
        try {
            num1 = Double.parseDouble(exp[0]);
            num2 = Double.parseDouble(exp[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error! Not number");
            return;
        }
        if (!((exp[1].equals("/")) | (exp[1].equals("+")) | (exp[1].equals("-")) | (exp[1].equals("*")))) {
            System.out.println("Operation Error!");
            return;
        }
        if (exp[1].equals("/") & exp[2].equals("0")) {
            System.out.println("Error! Division by zero");
            return;
        }
        if (exp[1].equals("+")) {
            System.out.println(num1 + num2);
            return;
        } else if (exp[1].equals("-")) {
            System.out.println(num1 - num2);
            return;
        } else if (exp[1].equals("*")) {
            System.out.println(num1 * num2);
            return;
        } else {
            System.out.println(num1 / num2);
            return;
        }
    }
}