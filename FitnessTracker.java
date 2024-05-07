import java.util.ArrayList; // Importing ArrayList class from java.util package
import java.util.Scanner; // Importing Scanner class from java.util package

public class FitnessTracker { // Declaring a public class named FitnessTracker
    public static void main(String[] args) { // Declaring the main method, the entry point of the program
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object for user input
        Tracker tracker = new Tracker(); // Creating obj of the Tracker class
        
        // Add dummy data
        tracker.addActivity(new Activity("Running", 20)); // Adding a new activity with name "Running" and duration 20 minutes
        tracker.addActivity(new Activity("Cycling", 30)); // Adding a new activity with name "Cycling" and duration 30 minutes
        tracker.addActivity(new Activity("Swimming", 25)); // Adding a new activity with name "Swimming" and duration 25 minutes
        
        // Display summary
        int totalDuration = tracker.calculateTotalDuration(); // Calculating the total duration of all activities
        System.out.println("Summary of Activities:"); // Printing a summary header
        for (Activity activity : tracker.getActivities()) { // Iterating through each activity in the tracker
            System.out.println(activity.getName() + ": " + activity.getDuration() + " minutes"); // Printing the name and duration of each activity
        }
        System.out.println("Total Duration: " + totalDuration + " minutes"); // Printing the total duration of all activities
        
        // Provide feedback based on total duration
        if (totalDuration < 60) { // Checking if total duration is less than 30 minutes
            System.out.println("You should consider adding more exercise to your routine."); // Providing feedback to add more exercise
        } else { // If total duration is 30 minutes or more
            System.out.println("Congratulations! You've met your fitness goals."); // Congratulating for meeting fitness goals
        }
        
        scanner.close(); // Closing the scanner object to release resources
    }
}

class Activity { // Declaring a class named Activity

    private String name; // Declaring a private instance variable for activity name
    private int duration; // Declaring a private instance variable for activity duration in minutes
    
    // Constructor
    public Activity(String name, int duration) { // Constructor to initialize activity name and duration
        this.name = name; // Assigning name parameter to instance variable
        this.duration = duration; // Assigning duration parameter to instance variable
    }
    
    // Getter methods
    public String getName() { // Getter method for activity name
        return name; // Returning the activity name
    }
    
    public int getDuration() { // Getter method for activity duration
        return duration; // Returning the activity duration
    }
}

class Tracker { // Declaring a class named Tracker

    private ArrayList<Activity> activities; // Declaring a private ArrayList to store activities
    
    // Constructor
    public Tracker() { // Constructor to initialize the ArrayList
        activities = new ArrayList<>(); // Creating a new ArrayList object
    }
    
    // Method to add activity
    public void addActivity(Activity activity) { // Method to add an activity to the tracker
        activities.add(activity); // Adding the activity to the ArrayList
    }
    
    // Method to calculate total duration
    public int calculateTotalDuration() { // Method to calculate the total duration of all activities
        int totalDuration = 0; // Initializing total duration variable
        for (Activity activity : activities) { // Iterating through each activity in the ArrayList
            totalDuration += activity.getDuration(); // Adding the duration of each activity to the total duration
        }
        return totalDuration; // Returning the total duration
    }
    
    // Getter method for activities
    public ArrayList<Activity> getActivities() { // Getter method to retrieve the ArrayList of activities
        return activities; // Returning the ArrayList of activities
    }
}
