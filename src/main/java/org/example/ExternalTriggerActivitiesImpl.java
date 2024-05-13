package org.example;

public class ExternalTriggerActivitiesImpl implements ExternalTriggerActivities {
    @Override
    public void activity1(String input) {
        // Activity logic for activity 1
        System.out.println("Activity 1 executed with input: " + input);
    }
    @Override
    public void activity2(String input) {
        // Activity logic for activity 2
        System.out.println("Activity 2 executed with input: " + input);
    }
}
