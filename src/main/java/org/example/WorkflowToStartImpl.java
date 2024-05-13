package org.example;

public class WorkflowToStartImpl implements WorkflowToStart {
    @Override
    public void executeWorkflow(String input) {
        // Workflow logic goes here
        System.out.println("Workflow started with input: " + input);
    }
}