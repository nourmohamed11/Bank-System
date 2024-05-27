public class Savings {
    public class Saving extends Account {
        private int InterestRate;


        public Saving(int Balance, int InterestRate) {
            super( Balance);
            this.InterestRate = InterestRate;
        }
        public void Savings(){
            InterestRate = 0;
        }

        public int getInterestRate() {
            return InterestRate;
        }

        public void setInterestRate(int InterestRate) {
            this.InterestRate = InterestRate;
        }
    }

}
