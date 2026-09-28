
class Numbers {
    public static void main(String args[]) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Character based right angled triangle");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(65 + j));
            }
            System.out.println();
        }
    }
}

