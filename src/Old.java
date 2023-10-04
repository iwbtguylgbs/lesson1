public class Old {
    public static void main(String[] args) {
        byte b = 120;
        short s = 32000;
        int i = 2_000_000;
        long l = 3_000_000_000l;


        float f = 3.14f;
        double d = 3.141919891989;
        char c = 33;
        boolean bl = true;

        short s1 = b;
        byte s2 = (byte) s;

        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = arr1;

        arr1[0] = 5;

        String str = "123";
        int a123 = Integer.parseInt(str);
        String ddd = String.valueOf(123);
        System.out.println(a123);
        System.out.println(ddd);

        for (int j = 0; j < 5; j++) {
            System.out.println(arr1[j]);
        }

        for (int j: str.toCharArray()) {
            System.out.println(j);
        }

        do {
            ;
        } while (true);
    }
}