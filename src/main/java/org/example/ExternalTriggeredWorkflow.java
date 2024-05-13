package org.example;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface ExternalTriggeredWorkflow {
    @WorkflowMethod
    void executeWorkflow(String input);
}
