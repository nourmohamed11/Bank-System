
public class Customer extends Account {

    private String name , address;

        public Customer(long balance, String name, String address) {
            super (balance);
            this.name = name;
            this.address = address;
        }

    public Customer() {
        super(100);
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }


    }

