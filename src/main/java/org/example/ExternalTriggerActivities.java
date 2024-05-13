package org.example;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;
import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@ActivityInterface
public interface ExternalTriggerActivities {
    @ActivityMethod
    void activity1(String input);

    @ActivityMethod
    void activity2(String input);

    // Define additional activities as needed
}

