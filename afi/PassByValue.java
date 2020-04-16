//public class PassByValue {
//
//    public class PassByValue {
//        private static void swap(int x, int y) {
//            int t = x;
//            x = y;
//            y = t;
//        }
//        private static void passByValueBasicTypes (){
//            int x = 10;
//            int y = 20;
//            swap(x, y);
//        }
//        private static void swap1(Integer x, Integer y) {
//            Integer t = new Integer(x);
//            x = y;
//            y = t;
//        }
//        private static void passByValueObjectTypes () {
//            Integer x =new Integer(10) ;
//            Integer y = new Integer(20) ;
//            swap1(x, y);
//        }
//        private static void swap2(Integer x, Integer y) {
//            Integer t = new Integer(x);
//            x = new Integer(y);
//            y = new Integer(t) ;
//        }
//        private static void passByValueObjectTypesThatDoesNotWork() {
//            Integer x = new Integer(10);
//            Integer y = new Integer(20);
//            swap2(x, y);
//        }
//        public static void main(String[] args) {
//            System.out.println("Before swap 5, x = " + x.getX() + " y = ", y.getY());
//            passByValueBasicTypes() ;
//
//            System.out.println("Before swap 5, x = " + x.getX() + " y = ", y.getY());
//            passByValueObjectTypes() ;
//        }
//    }
//}
