package org.example;

import io.temporal.client.WorkflowClient;
import io.temporal.client.WorkflowOptions;
import io.temporal.client.WorkflowStub;
import io.temporal.serviceclient.WorkflowServiceStubs;

public class ExternalService {
    public static void main(String[] args) {
        // Create a workflow client
        WorkflowServiceStubs service = WorkflowServiceStubs.newLocalServiceStubs();
        WorkflowClient workflowClient = WorkflowClient.newInstance(service);

        // Start the workflow using an external workflow stub
        WorkflowOptions workflowOptions = WorkflowOptions.newBuilder()
                .setTaskQueue("remote-queue")
                .build();
        WorkflowStub workflowStub = workflowClient.newUntypedWorkflowStub("WorkflowToStart", workflowOptions);
        workflowStub.start("input-for-started-workflow");
    }
}