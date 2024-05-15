package org.example;

import io.temporal.client.WorkflowClient;
import io.temporal.serviceclient.WorkflowServiceStubs;
import io.temporal.worker.Worker;
import io.temporal.worker.WorkerFactory;

public class ExternalTriggeredWorker {
    public static void main(String[] args) {
        WorkflowServiceStubs service = WorkflowServiceStubs.newLocalServiceStubs();
        WorkflowClient client = WorkflowClient.newInstance(service);

        WorkerFactory factory = WorkerFactory.newInstance(client);
        Worker worker = factory.newWorker("remote-queue");
        worker.registerWorkflowImplementationTypes(ExternalTriggeredWorkflowImpl.class);
        worker.registerActivitiesImplementations(new ExternalTriggerActivitiesImpl());
        factory.start();
    }
}