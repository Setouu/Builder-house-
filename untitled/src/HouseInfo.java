public class HouseInfo {

    public long NumberOfHouse;
    public String owner;
    public String Street;
    public double cost;
    public double interestRate;

    public static class Builder {

        private long NumberOfHouse; //This is important, so we'll pass it to the constructor.
        private String owner;
        private String Street;
        private double cost;
        private double interestRate;

        public Builder(long NumberOfHouse) {
            this.NumberOfHouse = NumberOfHouse;
        }

        public Builder client(String owner){
            this.owner = owner;

            return this;  //By returning the builder each time, we can create a fluent interface.
        }

        public Builder atStreet(String Street){
            this.Street = Street;

            return this;
        }

        public Builder startingcost(double cost){
            this.cost = cost;

            return this;
        }

        public Builder coefficient(double interestRate){
            this.interestRate = interestRate;

            return this;
        }

        public HouseInfo build(){
            //Here I create the actual house object
            HouseInfo house = new HouseInfo();  //Since the builder is in the HouseInfo class, we can create its private constructor.
            house.NumberOfHouse = this.NumberOfHouse;
            house.owner = this.owner;
            house.Street = this.Street;
            house.cost = this.cost;
            house.interestRate = this.interestRate;

            return house;
        }
    }


    private HouseInfo() {
        //Constructor no -aergument was created
    }
    // Now, we can create new data with all required information about  house
    
    HouseInfo house = new Builder(1234L)
            .client("Esbol")
            .atStreet("Abay str.")
            .startingcost(100)
            .coefficient(2.5)
            .build();

    HouseInfo anotherhouse = new Builder(4567L)
            .client("Aruzhan")
            .atStreet("Almaty str.")
            .startingcost(100)
            .coefficient(2.5)
            .build();
}
