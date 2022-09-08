public class State {
    static String region="";
    static String city="";
    static String area="";

    public static void main(String[] args) {

        Region reg = new Region("Брестская область");
        Area are = new Area("Пинский район");
        City cit = new City("г. Пинск");
        System.out.println(region+"\n"+area+"\n"+city);
    }

    public static class Area extends State {
        public Area(String area) {
            super.area = area;
        }

    }

    public static class Region extends State {
        public Region(String region) {
            super.region = region;
        }
    }

    public static class City extends State {
        public City(String city) {
            super.city = city;
        }
    }
}

