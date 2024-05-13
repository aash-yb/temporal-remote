package org.example;

import io.temporal.activity.ActivityOptions;
import io.temporal.workflow.Workflow;

import java.time.Duration;

public class ExternalTriggeredWorkflowImpl implements ExternalTriggeredWorkflow {
    private final ExternalTriggerActivities activities = Workflow.newActivityStub(
            ExternalTriggerActivities.class,
            ActivityOptions.newBuilder().
                    setStartToCloseTimeout(Duration.ofSeconds(5)).build());

    @Override
    public void executeWorkflow(String input) {
        // Execute activities
        activities.activity1(input);
        activities.activity2(input);
        // Execute additional activities as needed
    }
}

