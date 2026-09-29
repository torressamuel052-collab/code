public class CityDistances {
    class CityDistances {

    // the variable cityNames contains the names of the cities that this class knows
    // about. Unfortunately, they are not in alphabetical order.
    static final String[] cityNames = {
            "Chicago",
            "Boston",
            "New York",
            "Atlanta",
            "Miami",
            "Dallas",
            "Houston"

    };

    // distances is a 2-dimensional array of doubles. It represents the
    // distances between city pairs
    static final double[][] distances = {
            { 0, 983, 787, 714, 1375, 967, 1087 },      // distance from Chicago
            { 983, 0, 214, 1102, 1763, 1723, 1842 },    // distance from Boston
            { 787, 214, 0, 888, 1549, 1548, 1627 },     // distance from New York
            { 714, 1102, 888, 0, 661, 781, 810 },       // distance from Atlanta
            { 1375, 1763, 1549, 661, 0, 1426, 1187 },   // distance from Miami
            { 967, 1723, 1548, 781, 1426, 0, 239 },     // distance from Dallas
            { 1087, 1842, 1627, 810, 1187, 239, 0 }     // distance from Houston
    };

    // cityNameToIndex takes one argument, a string containing a city name.
    // it returns an int: the index of that city in the array of city names.
    // if the city name is not in the array of city names, it returns -1
    // Remember that java arrays start at 0, not 1
    public static int cityNameToIndex(String name) {
        // YOUR CODE HERE

        for (int i=0; i < cityNames.length; i++){
            if(cityNames[i].equalIgnoreCase(name)){
                return i;
            }
        }
        return 0;
    }

    // findDistance takes as arguments two city names, and returns, as a double,
    // the distance between them. 
    // if either city is not found in the list of city names, it prints a
    // message and returns -1
    public static double findDistance(String city1, String city2) {
       // YOUR CODE HERE

       int index1=cityNameToIndex(city1);
       int index2=cityNameToIndex(city2);

       if(index1 ==-1 || index2 == =1 ){
        system.out.println("Error .One of the cities were not found ,try again.");
        returnc -1;

       }
       return distance[index1][index2];
    }

    // closest takes as its one argument a string containing a city name.
    // It prints out the name of the closest other city and the distance to that city.
    // it returns as a double the distance. 
    // if the city is not found, it prints a message and returns -1
    public static double closest(String name) {
        // YOUR CODE HERE

        int TargetIndex == cityNameToIndex(name);

        if (TargetIndex == -1){
            system.out.pprint ("Your city "+name+" is not found, try again.")
            return -1;
        }
        return 0;
        
    }



}
}
