package org.Names;

import java.util.Random;

public class NamesList {
    public static String[] firstNames = {
            "James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph", "Charles", "Thomas",
            "Daniel", "Matthew", "Steven", "Donald", "Paul", "Andrew", "Joshua", "Mark", "George", "Kevin",
            "Brian", "Edward", "Ronald", "Timothy", "Jason", "Jeffrey", "Ryan", "Jacob", "Nicholas", "Eric",
            "Jonathan", "Anthony", "William", "Benjamin", "Patrick", "Jack", "Dennis", "Alexander", "Samuel", "Cody",
            "Russell", "Gregory", "Tyler", "Keith", "Larry", "Frank", "Ethan", "Scott", "Raymond", "Phillip",
            "Aaron", "Walter", "Brandon", "Harry", "Bobby", "Arthur", "Gary", "Roger", "Justin", "Terry",
            "Jose", "Gerald", "Sean", "Albert", "Karl", "Samuel", "Vincent", "Ralph", "Philip", "Adam",
            "Eugene", "Wayne", "Roy", "Howard", "Jeremy", "Louis", "David", "Alan", "Randall", "Todd",
            "Kenneth", "Billy", "Brandon", "Antonio", "Lawrence", "Jason", "Glenn", "Gerald", "Peter", "Chris",
            "Martin", "Henry", "Bradley", "Frederick", "Lucas", "Shawn", "Dale", "Seth", "Clifford", "Dwayne",
            "Carlos", "Andre", "Ray", "Roland", "Earl", "Curtis", "Floyd", "Cameron", "Randy", "Joel"
    };

    public static String[] lastNames = {
            "Smith", "Johnson", "Brown", "Taylor", "Wilson", "Moore", "Harris", "Clark", "Lee", "Lewis",
            "Hall", "Walker", "Young", "Allen", "Turner", "Wright", "King", "Scott", "Green", "Baker",
            "Adams", "Nelson", "Hill", "Ramirez", "Carter", "Mitchell", "Roberts", "Phillips", "Evans", "Collins",
            "Edwards", "Stewart", "Flores", "Morris", "Nguyen", "Murphy", "Rivera", "Cook", "Long", "Reed",
            "Bailey", "Gonzalez", "Perez", "Sanchez", "Davis", "Parker", "Hernandez", "Martinez", "Lopez", "White",
            "Mills", "Allen", "Adams", "Perez", "Collins", "Barnes", "Ross", "Hall", "Butler", "Jones",
            "Morgan", "Stewart", "Murphy", "James", "Bennett", "Russell", "Wood", "Jenkins", "Perry", "Powell",
            "Price", "Mitchell", "Rogers", "Robinson", "Griffin", "Cruz", "Gomez", "Hamilton", "Wallace", "Knight",
            "Garza", "Berry", "Gardner", "Gonzales", "Sharp", "Harper", "Cole", "Mason", "Fields", "Dixon"
    };

    private static Random random = new Random();

    public static String getRandomFullName(){
        return firstNames[random.nextInt(0,firstNames.length)] + " " + lastNames[random.nextInt(0,lastNames.length)];

    }

    public static String getRandomFirstName(){
        return firstNames[random.nextInt(0,firstNames.length)];
    }

    public static String getRandomLastName(){
        return lastNames[random.nextInt(0,lastNames.length)];
    }
}
