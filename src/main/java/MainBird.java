public class MainBird {
    public static void main(String[] args) {
        Martin martin =new Martin();
        Finch finch=new Finch();
        martin.sit();
        martin.fly();
        finch.sit();
        finch.fly();
    }

    public static class Finch implements Bird {
        public void sit(){
            System.out.println("Зяблик сидит на ветке.");
        }
        public void fly(){
            System.out.println("Зяблик летит.");
        }
    }

    public static class Martin implements Bird{
        public void sit(){
            System.out.println("Ласточка сидит на ветке.");
        }
        public void fly(){
            System.out.println("Ласточка летит.");
        }
    }

    public static interface Bird {
        void sit();
        void fly();
    }
}
