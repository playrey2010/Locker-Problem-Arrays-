public class LockerRiddle {
    public static void main(String[] args) {
        boolean [] openlockers = new boolean [101];
        boolean open = true;

        for (int i=1; i<101; i++) {
            openlockers[i] = !open;
        }


        for (int i =1; i<101; i++) {
            for (int j = i; j<101; j+=i) {
                openlockers[j] = !openlockers[j];
            }
        }

        for (int i=0; i<101; i++) {

            if (openlockers[i] == true) {
                System.out.println("Locker " + (i) + " is open");
            }
        }


    }
}
