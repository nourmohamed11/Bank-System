public class Stock {

         String name;
         float price;

    public Stock(String name) {

    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public Stock(String name, float price) {
            this.name = name;
            this.price = price;
        }
    }


