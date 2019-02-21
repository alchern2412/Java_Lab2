package by.belstu.it.chernyavsky.basejava;

import java.util.Objects;

import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) {
        //Определить перемнные типа char, int, short, byte, long, boolean.

        char c1 = 'a';
        int i1 = 10;
        short sh1 = 13;
        byte b1 = 8;
        long l1 = 880055535;
        boolean bl1 = true;

        System.out.println("Str + int " + i1);
        System.out.println("Str + char " + c1);
        System.out.println("Str + double " + (double)8.33);
        //byte b2 = b1 + i1;
        System.out.println("byte = byte + int => ERROR");
        //int i2 = (double)224.3 + l1;
        System.out.println("int = double + long => ERROR");
        long l2 = i1 + 2147483647;
        System.out.println("long = int + long = " + l2);
        boolean b2 = bl1 && false;
        System.out.println("boolean = boolean && boolean = bl1(true) && false = " + b2);
        boolean b3 = true ^ true;
        System.out.println("boolean = boolean ^ boolean = true && true = " + b3);
        //boolean b4 = true + false;
        System.out.println("boolean + boolean => ERROR");
        long l4 = 922337203342334323l;
        System.out.println("long = " + l4);
        long l5 = 0x7fff_ffff_ffffl;
        System.out.println("long 2 = "+ l5);

        System.out.println(" 3.45 % 2.4 = " +  3.45 % 2.4);
        System.out.println(" 1.0/0.0 = " +  1.0/0.0);
        System.out.println(" 0.0/0.0 = " +  0.0/0.0);
        System.out.println("  log(-345) = " +   log(-345));
        System.out.println("  Float.intBitsToFloat(0x7F800000) = " +   Float.intBitsToFloat(0x7F800000));
        System.out.println("  Float.intBitsToFloat(0xFF800000) = " +   Float.intBitsToFloat(0xFF800000));



        System.out.println("Math.PI = " + PI);
        System.out.println("Math.E = " + Math.E);
        System.out.println("Math.round(PI) " + Math.round(PI) + " " + Math.round(E));
        System.out.println("Math.min(p,e) = " + Math.min(1, 444));
        System.out.println("rand() = " + random());

        //Классы-оболочки
        Boolean B1 = true;
        Character C1 = 'b';
        Integer I1 = 1313;
        Byte BB1 = 43;
        Short SH1 = 111;
        Long L11 = 234123343212343l;
        Double DD1 = 41231234.33123d;

        System.out.println("I1 = " + I1 + " I1 << 2 = " + (I1 << 2));//сдвиг битов на два влево
        System.out.println("L11 = " + L11 + " L11 >>> 3 = " + (L11 >>> 4));
        System.out.println("L11 = " + L11 + " ~L11 = " + (~L11));


        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);

        int testint1 = 123;
        Integer Int1 = testint1;
        int testint2 = Int1;
        System.out.println("Int1.getClass().getName() = " + Int1.getClass().getName());

        byte testbyte1 = 127;
        BB1 = testbyte1;
        byte testbyte2 = BB1;
        System.out.println("BB1.getClass().getName() = " + BB1.getClass().getName());

        System.out.println("(Integer.parseInt(\"10\") + 12 = " + (Integer.parseInt("10") + 12));
        System.out.println("Integer.toHexString(10000423) = " + Integer.toHexString(10000423));
        System.out.println("Integer.compare(10, 34) = " + Integer.compare(10, 34));
        System.out.println("Integer.toString(33322312) = " + Integer.toString(33322312));
        System.out.println("Integer.bitCount(32543) = " + Integer.bitCount(32543)); // кол-во единиц
        System.out.println("Double.isNaN(sqrt(-1)) = " + Double.isNaN(sqrt(-1)));

        String s34 = "2345";
        //переводите строку в массив байтов и обратно из массива байтов в
        //строку
        char[] char1 = s34.toCharArray();   // из строки в массив char[]
        String s35 = new String(char1);     // из массива в строку обратно

        //преобразуйте строку в логический тип 2-мя способами.
        boolean bool1 = Boolean.valueOf("1");
        boolean bool2 = Boolean.parseBoolean("true");

        //определите два строки (String) с одинаковыми инициализаторами.
        //Выполите ==, equals, compareTo. В чем разница, поясните
        //результат. Одной из строк присвойте null. Повторите все тир
        //варианта сравнения.

        String s123 = "Test";
        String s124 = "Test";
        System.out.println("equals " + s123.equals(s124));
        System.out.println("== " + (s123 == s124));                 //
        System.out.println("compareTo " + s123.compareTo(s124)); //0 означает что равны (сравнивает по значению)

        System.out.println("equals new String(\"Hello\") " + s123.equals(new String("Test")));
        System.out.println("== new String(\"Hello\") " + (s123 == new String("Test")));                 //
        System.out.println("compareTo new String(\"Hello\")   " + s123.compareTo(new String("Test"))); //0 означает что равны

        String ssss = "Hello. world bebebe?suck";
        String[]sarray = ssss.split("e");
        for (var i : sarray) {
            System.out.println(i);
        }

        System.out.println(ssss.contains("world"));
        System.out.println(ssss.hashCode());
        System.out.println(ssss.indexOf("world"));
        System.out.println(ssss.length());
        System.out.println(ssss.replace("world", "something new"));

        char [][]ccc1 = new char[3][];
        char []ccc2[] = new char[2][2];
        char ccc3[][] = new char[3][3];

        ccc1[0] = new char[4];
        ccc1[1] = new char[5];
        ccc1[2] = new char[6];

        System.out.println(ccc1.length);
        System.out.println(ccc1[0].length);
        System.out.println(ccc1[1].length);
        System.out.println(ccc1[2].length);

        for (int i = 0; i < ccc2.length; i++) {
            for (int j = 0; j < ccc2[i].length; j++) {
                ccc3[i][j] = 'v';

            }

        }
        for (int i = 0; i < ccc3.length; i++) {
            for (int j = 0; j < ccc3[i].length; j++) {
                ccc3[i][j] = 'v';

            }
        }
        boolean comrez1 = ccc2 == ccc3;
        for (char[] i :
                ccc3) {
            for (char j :
                    i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //char testtest = ccc3[10][3];//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
        //at by.belstu.it.chernyavsky.basejava.Task3.main(Task3.java:160)




        WrapperString newObj = new WrapperString("Hello, world");
        System.out.println(newObj.getField1());             // до замены
        newObj.replace('H', 'K');
        System.out.println(newObj.getField1());                 // после замены

        /**Комментарий*/

    }

    static  int sint;

    final int fi1 = 10;         //относится к экземпляру
    public final int pfi2 = 20; //относится к экземпляру
    public static final int psfi3 = 30; // относится к классу
}

class WrapperString{
    private String Field1;

    public WrapperString(String field1) {
        Field1 = field1;
    }

    public String getField1() {
        return Field1;
    }

    public void setField1(String field1) {
        Field1 = field1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(Field1, that.Field1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Field1);
    }

    public void replace (char oldchar, char newchar){
        Field1 = Field1.replace(oldchar, newchar);
        return;
    }


}
