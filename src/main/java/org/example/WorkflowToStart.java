package org.example;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface WorkflowToStart {
    @WorkflowMethod
    void executeWorkflow(String input);
}